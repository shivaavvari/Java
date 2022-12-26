package java_proj;

import java.awt.*;



import java.applet.Applet;

public class graphics_methods  extends Applet{

  String s = new String();
  String s1 = new String();
  String s2 = new String();
  Font f1 = new Font("courier new", Font.BOLD,20);
  @Override
	public void paint(Graphics ga) {
		// TODO Auto-generated method stub
		ga.setFont(f1);
		ga.setColor(Color.BLUE);
		ga.drawString("illustration of methods of graphics class",200, 520);
		Font f2 = ga.getFont();
		s = f2.toString();
		ga.drawString(s, 5,540);
		ga.setColor(Color.green);
		Color col = ga.getColor();
		s2= col.toString();
		ga.drawString(s2,5,560);
		FontMetrics f3 = ga.getFontMetrics();
		
		s1 = f3.toString();
		ga.drawString(s1, 5, 580);
		ga.drawLine(10,10, 50, 50);
		ga.drawRect(10,60,40, 30);
		ga.fillRect(60,10, 30,80);
		ga.drawRoundRect(10,100,80,50,10,10);
		ga.fillRoundRect(20,110,60,30,5,5);
		ga.drawOval(20,20,200,120);
		ga.fillOval(70,30,100, 100);
	}
}
