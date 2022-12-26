import java.awt.*;
import java.awt.event.*;


import java.applet.Applet;



public class Question extends Applet implements ActionListener
{

String theQuestion;
String  theAnswer=" ";
Button reveal = new Button("Click to answer");

public void init()
{

theQuestion = getParameter("question");
add(reveal);
reveal.addActionListener(this);


}

public void paint(Graphics g)
{
g.setColor(java.awt.Color.black);
g.drawString(theQuestion, 10, 50);

g.setColor(java.awt.Color.RED);
g.drawString(theAnswer, 10, 70);

}


@Override
public void actionPerformed(ActionEvent e) {
    // TODO Auto-generated method stub
theAnswer = getParameter("answer");
repaint();    
}
}

