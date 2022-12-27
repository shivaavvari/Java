package sample;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class bouncingball extends Applet implements Runnable{

	
	String msgString="The Moving Banner";
	Thread thread=null;
	boolean stopflag;
	int bx,by,mx=400,my=200,bdia=50,incx=10,incy=10;
    
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

	    g.fillOval(bx, by, bdia, bdia);	
	
	}

	
	public void run()
		{
		
		while(true){
			 		try {
				Thread.sleep(100);
				repaint();
                bx+=incx;
				if (bx>mx || bx<10)
				{
					
					incx *= -1;
					bx = 2*incx;
					}
			   by+=incy;
				if (by>mx || by<1)
				{
					
					incy *= -1;
					by = 2*incy;
					}
			
			if(stopflag)
				break;
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			
		}	
		
		
		}

		
	}
		

