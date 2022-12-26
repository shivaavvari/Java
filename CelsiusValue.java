package java_proj;
import java.awt.*;
import java.applet.Applet;
import java.awt.event.*;

public class CelsiusValue extends Applet implements AdjustmentListener{


	private Scrollbar bar;
	private int old, newtemp=0;
	private int fahr = 32;
	@Override
	public void init() {
		// TODO Auto-generated method stub
	    bar = new Scrollbar(Scrollbar.HORIZONTAL, 0, 1,0,100);
	    bar.addAdjustmentListener(this);
	    setLayout(new BorderLayout());
	    add("North",bar);
	    
	}
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
	  g.drawString("celsius = "+newtemp,30, 50);
	  g.drawString("Farenheit ="+fahr, 30, 70);
	}

	@Override
	public void adjustmentValueChanged(AdjustmentEvent e) {
		// TODO Auto-generated method stub
      newtemp  =bar.getValue();
      if (newtemp!=old)
      {
    	  fahr =newtemp*9/5+32;
    	  old = newtemp;
      }
      repaint();
	}

	
	
	
	
}
