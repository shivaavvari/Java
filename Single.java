package java_proj;

import java.lang.annotation.*;
import java.lang.reflect.*;
@interface MySingle{
	int value();
	
}
public class Single {
 @MySingle(100)
public static void mymeth()
{
	 	Single ob =  new Single();
	 	try {
			Method m = ob.getClass().getMethod("mymeth");
		    MySingle anno = m.getAnnotation(MySingle.class);
		    System.out.println("The value is: " + anno.value());
		    
	 	} catch (Exception e) {
			// TODO: handle exception
		}
	 	
	 	
}
 public static void main(String[] args) {
	mymeth();
}
}
