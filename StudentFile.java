package java_proj;


import java.io.*;
import java.applet.Applet;
import java.awt.*;

public class StudentFile  extends  Frame{

	TextField number, name ,marks;
	Button enter, done;
	Label numlabel, namelabel, marklabel;
	DataOutputStream dos;
	
	public StudentFile() {
		// TODO Auto-generated constructor stub
	
	
	}
	
    public void setup() {
		// TODO Auto-generated method stub
       resize(400,200);
    	setLayout(new GridLayout(4,2));
       number = new TextField(25);
       numlabel =new Label("Roll Number");
       name = new TextField(25);
       namelabel = new Label("student name ");
       marks =new TextField(25);
       marklabel = new Label("marks");
       enter =  new Button("enter");
       done = new Button("done");
       
       add(numlabel);
       add(number);
       add(namelabel);
       add(name);
       add(marklabel);
       add(marks);
       add(enter);
       add(done);
		show();
    try {
    	
		dos = new DataOutputStream(new FileOutputStream("student.dat"));
		
	} catch (IOException e) {
		// TODO: handle exception
		System.exit(1);
		System.err.println(e.toString());
		System.exit(1);
		
		
	}
    
    
    
    }
    
    
   public void addRecord() {
	// TODO Auto-generated method stub
	   int num;
	   double d;
	   num = (new Integer(number.getText())).intValue();
           try {
			dos.writeInt(num);
			dos.writeUTF(name.getText());
			d = new Double(marks.getText());
		    
			dos.writeDouble(d);
			
		} catch (IOException e) {
			// TODO: handle exception
		}
           
           number.setText("");
           name.setText(" ");
           marks.setText(" ");
           
}
    
      
   @Override
public boolean action(Event evt, Object what) {
	// TODO Auto-generated method stub
	if(evt.target instanceof Button)
	{
		if (evt.arg.equals("Enter"))
		{
			addRecord();
			return true;
		}
	}
	return false;
	
	   
}
   
  public static void main(String[] args) {
	StudentFile student  =  new StudentFile();
	student.setup();
}
}
