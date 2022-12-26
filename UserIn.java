package java_proj;
import java.awt.*;

import java.applet.*;



public class UserIn extends Applet{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5814426338460888014L;
	TextField text1,text2;
	@Override
	public void init() {
		// TODO Auto-generated method stub
	text1 = new TextField(8);
	text2 = new TextField(8);
	add(text1);
	add(text2);
	text1.setText("0");
	text2.setText("0");
	
	}
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
	  int x=0,y=0,z=0;
	  String s1,s2,s;
	  g.drawString("Input a number in each box", 10, 50);
	  try {
		s1= text1.getText();
		x = Integer.parseInt(s1);
		s2= text2.getText();
		y = Integer.parseInt(s2);
		
	} catch (Exception ex) {}
		// TODO: handle exception
		
		z =x+y;
		s= String.valueOf(z);
		g.drawString("The sum is ", 10, 75);
		g.drawString(s,100,75);
		
	}
	
    public boolean Action(Event event, Object object)
   {
	   repaint();
	   return(true);
   }
	
}
