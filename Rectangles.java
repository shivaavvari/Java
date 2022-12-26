package java_proj;

import java.awt.*;
import java.applet.Applet;

public class Rectangles extends Applet{

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
	int inset;
	int rectWidth, rectHeight;
    g.setColor(Color.BLUE);
    g.fillRect(0, 0, 300, 160);
	inset=0;
	rectHeight=159;
	rectWidth =299;
	g.setColor(Color.red);
	g.drawString("Rectangles", 150, 200);
	while(rectWidth>=0 && rectHeight>=0)
	{
		g.drawRect(inset, inset, rectWidth, rectHeight);
		inset+=15;
		rectHeight-=30;
		rectWidth-=30;
	}
	}
}