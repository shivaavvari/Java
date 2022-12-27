package sample;

import java.applet.Applet;
import java.awt.Checkbox;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Checkboxs extends Applet implements ItemListener{

	Checkbox cb1, cb2, cb3;
    String s = "  ";	
    
	
	@Override
	public void init() {
	
    cb1 = new Checkbox();
	cb2 = new Checkbox();
	cb3 = new Checkbox();
	
	cb1.setLabel("Computers");
	cb2.setLabel("statistics");
	cb3.setLabel("programming");
	
	add(cb1);
	add(cb2);
	add(cb3);
	
	cb1.addItemListener(this);
	cb1.addItemListener(this);
	cb1.addItemListener(this);

	
	}
	
	
	@Override
	public void paint(Graphics g) {
    Font newfont = new Font("TimesRoman",Font.BOLD,24);
    g.setFont(newfont);
		
	String msg="Check boxes is clicked             ",msg1,msg2,msg3;
	msg1= msg+cb1.getLabel();
	g.drawString(msg1+cb1.getState(), 10, 50);
	msg2= msg+cb2.getLabel();
	g.drawString(msg2+cb2.getState(), 10, 100);
	msg3= msg+cb3.getLabel();
	g.drawString(msg3+cb3.getState(), 10, 150);
	
	}


	@Override
	public void itemStateChanged(ItemEvent e) {
		repaint();
		
	}
}
