package sample;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.Date;


public class Digitalclock extends Applet implements Runnable
{
Font theFont = new Font("TIMESROMAN",Font.BOLD,24);
Date theDate;
Thread t=null;
boolean stopflag;


	public void start() {
	
	t=new Thread(this);
	stopflag =false;
	t.start();
	}
	@Override
		public void stop() {
		
	stopflag = true;
	t.interrupt();
	
	}
	
	
	@Override
	public void paint(Graphics g) {
			// TODO Auto-generated method stub
	g.setFont(theFont);
	g.drawString(theDate.toString(), 10, 50);
   }



	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
		theDate= new  Date();
		repaint();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		
		}
	
	}
	}
	
	

