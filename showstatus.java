package sample;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class showstatus extends Applet{

	@Override
	public void init() {
	setBackground(Color.BLUE);
	setForeground(Color.CYAN);
	}
	
	@Override
	public void paint(Graphics g) {
	 g.drawString("This is the applet Window", 10, 50);
	 showStatus("This is the status window");
	
	}
	
}
