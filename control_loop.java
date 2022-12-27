package sample;

import java.applet.Applet;
import java.awt.Graphics;

public class control_loop extends Applet {


	@Override
	public void paint(Graphics g) {
	for (int i = 0; i < 5; i++) {
		if(i%2==0)
		{
			
			g.drawOval(100, i*100, 100,100);}
		else {
			g.fillOval(100, i*100, 100,100);
			
		     }
		}
	
	}


}

