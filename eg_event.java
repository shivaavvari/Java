package java_proj;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;



// <applet code=eg_event.class width=200 height=400> </applet>
public class eg_event  extends Applet implements KeyListener {

@Override
public void init() {
	// TODO Auto-generated method stub
   addKeyListener(this);
}
	@Override
	public void keyTyped(KeyEvent kb) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		showStatus("keyboard keyis pressed");
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		showStatus("Keyboard key is released");
	}

	Font f1=new Font("timesRoman",Font.BOLD,20);
	@Override
		public void paint(Graphics g) {
			// TODO Auto-generated method stub
			g.setFont(f1);
			g.setColor(Color.blue);
			g.drawString("This applet sense the up/down of keys",20,120);
		}
	
}
