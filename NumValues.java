package java_proj;
import java.awt.*;
import java.applet.*;

public class NumValues extends Applet{

	@Override
	
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		int value1=10;
		int value2=20;
		int sum = value1+ value2;
		String s = "Sum:" + String.valueOf(sum);
		g.drawString(s, 100, 100);
	}	
}
