package java_proj;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class MouseRing extends Applet implements MouseListener {
 
	private int x=100, y=100;
	private int pauseLength=0;
	public void init()
	{
		pauseLength = 10; //Integer.parseInt(getParameter("PauseLength"));
		setBackground(Color.white);
	
	}
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
	   int count =0;
	   while(count<100)
	   {
		   int radius = count*5;
		   int diameter=radius*2;
		   g.setColor(Color.black);
		   g.drawOval(-radius, y-radius, diameter, diameter);
		   pause(100);
		   g.setColor(Color.white);
		  
		   g.drawOval(x-radius, y-radius, diameter, diameter);
		   count+=1;	   
	   }
	}
	
	
	private void pause(int howLong) {
		// TODO Auto-generated method stub
        for (int count = 0; count < howLong; count++) {
			System.out.print("pause");
		}
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		x= e.getX();
		y= e.getY();
		repaint();
	
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	
}
