package sample;

import java.applet.Applet;
import java.awt.Graphics;

public class drawPolygon extends Applet{

	@Override
	public void paint(Graphics g) {
	int x[] = {20,120,220,20};
	int y[]= {20,120,20,20};
	int npoints=4;
	int x1[] = {120,220,220,120};
	int y1[]= {120,20,220,120};
	int n_points=4;
	
		
		g.drawPolygon(x, y, npoints);
		g.fillPolygon(x1, y1, n_points);
	
	
	
	
	
	}
	
	
	
	
	
}
