package sample;

import java.applet.Applet;
import java.awt.Event;
import java.awt.Label;
import java.awt.PopupMenu;
import java.awt.Scrollbar;
import java.awt.TextField;

public class scroll_bar extends Applet{

	
	Scrollbar s;
	Label l;
	TextField tField;
	@Override
	public void init() {
	    s = new Scrollbar(Scrollbar.VERTICAL,0,50,0,100);
	    l = new Label("Please enter the tax rate");
		tField = new TextField();
		
		add(s);
		add(l);
		add(tField);
		
	}
	
	@Override
	public  boolean handleEvent(Event evt) {
     if (evt.target instanceof Scrollbar)
     {
    	
    
    
    	int intrate = ((Scrollbar)evt.target).getValue();
    	tField.setText(String.valueOf(intrate));
    	return true;
     }
	

	return false;
	}
}
