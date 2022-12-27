package sample;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;


class tabbedpanel extends JPanel{

	String tabs[] = {"one","two","three","four"};
    JTabbedPane tabbedpane = new JTabbedPane();
   
public tabbedpanel()
    {
	setLayout(new BorderLayout());
	for (int i = 0; i < tabs.length; i++) {
		tabbedpane.addTab(tabs[i],null,createpane(tabs[i]));
        tabbedpane.setSelectedIndex(0);
        add(tabbedpane,BorderLayout.CENTER);
        }
	}
JPanel createpane(String s)
{
  JPanel p = new JPanel();
  p.add(new Label(s));
  return p;
}

public static void main(String[] args) {
	
   
   JFrame f = new JFrame("tabbedpane example");

   f.addWindowListener(new WindowAdapter()
  {
   public void WindowClosing(WindowEvent e)
   {
    System.exit(0);
   }

  });

  f.getContentPane().add(new tabbedpanel(),BorderLayout.CENTER);
  f.setSize(400,125);
  f.setVisible(true);
}
}