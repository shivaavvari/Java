package sample;

import java.applet.Applet;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GraphicsEnvironment;

public class Font_dif extends Applet{
	
@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
	 String	font_set[] = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames() ;
 for (int i = 0; i < font_set.length; i++) {
	 Font f = new Font("TimesRoman",Font.BOLD,16+i*4);
	 g.setFont(f);
     g.drawString(font_set[i], 5, i*35+20);

 }
}
}