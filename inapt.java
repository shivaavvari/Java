package sample;

import java.applet.Applet;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.TextField;

public class inapt extends Applet{

	TextField t1,t2;
	@Override
	public void init() {
	
	   t1= new TextField(5);
	   t2= new TextField(5);
		
	add(t1);
	add(t2);
    t1.setText("X");
    t2.setText("y");
	}
	
	@Override
	public void paint(Graphics g) {
	  String msg ="Please enter the value of x,y";
	  g.drawString(msg, 10, 50);
	 
	  try {
	  String s1 = t1.getText();
	  int x = Integer.parseInt(s1);
	  String s2 = t2.getText();
	  int y = Integer.parseInt(s2);
	  int z = x+y;
	  
	  String s = String.valueOf(z);
	  
	  g.drawString(s, 10, 100);
	  }
	  catch (Exception e) {
		// TODO: handle exception
	}
	
	}
	@Override
	public boolean action(Event evt, Object what) {
	  repaint();
	  return true;
	
	}
}
