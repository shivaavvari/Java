package sample;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
//<Applet class="movingBanner" height=400 width=400> </applet>
public class Marquee extends Applet  implements Runnable{

String msgString="The Moving Banner";
Thread thread=null;
boolean stopflag;
int x=10,y=100,f=5;

@Override
	public void init() {
		// TODO Auto-generated method stub
    setBackground(Color.BLUE);
    setForeground(Color.CYAN);
    
}

@Override
	public void start() {
		// TODO Auto-generated method stub)
	thread = new Thread(this);
	stopflag =false;
	thread.start();
	}

@Override
	public void stop() {
    stopflag =true;
    thread.interrupt();
	
	
	}


@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub

	Font newf = new Font("TimesRoman",Font.BOLD,f);	
 
	g.setFont(newf);
	FontMetrics fMetrics = g.getFontMetrics();
	int width = fMetrics.stringWidth(msgString);
	
	g.drawString(msgString, 10, 50);
	   f+=2;
		if (f>50) 
		f=2;
	}


public void run()
	{
	
	for (; ; ) {
		 		try {
			Thread.sleep(100);
			repaint();

				
		if(stopflag)
			break;
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}	
	
	
	}

	
}
	