package java_proj;
import java.awt.*;


import java.applet.Applet;

public class colorrect extends Applet{

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
	  Color c = g.getColor();
	  g.setColor(Color.pink);
	g.drawOval(20, 20, 100, 100);
	g.fillRect(120, 120, 50, 50);
	}
}
