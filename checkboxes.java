package sample;

import java.applet.Applet;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Event;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;

public class checkboxes extends Applet{
    int m;
	String newstr;
CheckboxGroup cbGroup;
Checkbox cb1, cb2, cb3,cb4;
String msg = "This is the new String message";

@Override
	public void init() {

	
	cbGroup = new CheckboxGroup();

	cb1=new Checkbox();

	cb2=new Checkbox();
	

	cb3=new Checkbox();

	cb4=new Checkbox();

	
	add(cb1);
	add(cb2);
	add(cb3);
	add(cb4);

	
	cb1.setLabel("8");
	cb2.setLabel("16");
	cb3.setLabel("24");
	cb4.setLabel("32");

	}


   @Override
	public void paint(Graphics g) {

	
    g.drawString(msg, 50, 100);
    Font f= new Font("TIMESROMAN",Font.BOLD,m);
    g.setFont(f);
    g.drawString("This is the new message", 100, 100);
    
   }

	
   @Override
	public boolean handleEvent(Event evt) {
	
	    if (evt.target instanceof Checkbox) {
	    	msg=  ((Checkbox)evt.target).getLabel();
	  	     m = Integer.valueOf(msg).intValue();  
	    }
	   
	    
    repaint();	
    return true;
    
      
   	
   }
   	
	
	
	
	
}
