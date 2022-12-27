package sample;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class piechart extends Applet{

	final int dataset[] = {20,30,40,10};
	final String fruits[]= {"carrot","apple","banana","strawberry"};
	final Color colors[] = {Color.RED,Color.yellow,Color.BLUE,Color.GREEN};
	int graphofset =20;
	int graphdia= 150;
	

	
	@Override
    public void paint(Graphics g) {
   	// TODO Auto-generated method stub
		int startangle =0,piesize;
		int subtotal=0;
		try {
			for (int i = 0; i < dataset.length; i++) {
				subtotal += dataset[i];
				piesize = subtotal * 360 /100 - startangle;  
				
				g.setColor(colors[i]);
				g.fillArc(graphofset, graphofset, graphdia, graphdia, startangle, piesize);
	            startangle+=piesize;
	            g.fillRect(graphofset+graphdia+10,graphofset+i*10, 15, 15);
	            g.setColor(Color.black);
	            g.drawString(fruits[i],graphdia+graphofset+10+20, graphofset+i*20);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
	}	
		
	}
	
	

