package sample;
import java.applet.Applet;
import java.awt.Checkbox;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.Graphics;
import java.awt.Font;

//<Applet class=chkbix.class height= 400 width = 400> </Applet>
public class chkbix extends Applet implements ItemListener{

Checkbox cb1 ;
String msg;

public void init()
{

cb1 = new Checkbox();
add(cb1);
cb1.addItemListener(this);


}


public void itemStateChanged(ItemEvent e)
{
repaint();
}

public void paint(Graphics g)
{
msg="This is the new message";
g.drawString("This is the new Date"+cb1.getState() , 10 , 50);

}

}
