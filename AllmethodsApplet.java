package java_proj;
import java.awt.*;
import java.applet.Applet;
public class AllmethodsApplet  extends Applet{

	TextArea messages = new TextArea(8,20);
	public AllmethodsApplet()
	{
		messages.append("constructor called \n");
		
		
	}
	@Override
	public void init() {
		// TODO Auto-generated method stub
	add(messages);
	messages.append("Init called \n");
	}
	
	@Override
	public void start() {
		messages.append("start called \n");
		
	
		}
		
	@Override
	public void stop() {
		// TODO Auto-generated method stub
		messages.append("stop called \n");
			}
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		messages.append("Destroy  called \n");
		}
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		messages.append("paint called \n");
		Dimension size= getSize();
	    g.drawRect(0, 0, size.width-1,size.height-1);
			}
}
