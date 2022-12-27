package sample;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Event;
import java.awt.Label;
import java.awt.TextArea;

public class textareas extends Applet {

	TextArea t1, t2;
    Label l ;
    Button b;
	String str="texttexttexttexttexttexttexttexttexttexttexttexttexttexttexttextvtextvtextvtextvtexttext"
    	+"texttexttexttexttexttexttexttexttexttexttexttexttexttexttexttextvtextvtextvtextvtexttext "
    	+"texttexttexttexttexttexttexttexttexttexttexttexttexttexttexttextvtextvtextvtextvtexttext";
   
	@Override
  	public void init() {
	t1 = new TextArea(); 
	t2 = new TextArea(); 
   	b=  new Button("Copy <<<<<<<<<<<<<<<<<<<<");
	add(t1);
	add(t2);
	add(b);
	t1.setText(str);
	
	}

@Override
public boolean action(Event evt, Object what) {
    if (evt.target==b)
    {
    	t2.setText(t1.getSelectedText());
    }
	return true;
}
}