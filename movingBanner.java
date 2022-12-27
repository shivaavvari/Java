package sample;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
//<Applet class="movingBanner" height=400 width=400> </applet>
public class movingBanner extends Applet  implements Runnable{

String msgString="The Moving Banner";
Thread thread=null;
boolean stopflag;
int n;

@Override
	public void init() {
		// TODO Auto-generated method stub
    setBackground(Color.BLUE);
    setForeground(Color.CYAN);
    setFont(new Font("TimesRoman",Font.BOLD,24));
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
		g.drawString(msgString, 10, 50);
	}


public void run()
	{
	char c;
	for (; ; ) {
		repaint();
		 		try {
			Thread.sleep(1000);
			

			c = msgString.charAt(0);
			msgString = msgString.substring(1, msgString.length());
			msgString += c;
			
			
		if(stopflag)
			break;
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}	
	
	
	}

	
}
	