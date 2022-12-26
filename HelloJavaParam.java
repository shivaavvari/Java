package java_proj;

import java.awt.*;
import java.applet.*;

public class HelloJavaParam  extends Applet{

	
	String str;

	public void init() {
		// TODO Auto-generated method stub
		 str = getParameter("string");
		 if(str==null)
		 {
			 str= "java";
			 str = "Hello" +str;
		 }
		
		 
	}

	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		g.drawString(str, 10, 100);
	}
}
