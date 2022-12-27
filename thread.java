package sample;

import java.applet.Applet;

public class thread {
      public static void main(String[] args) {
		Thread t=Thread.currentThread();
	    System.out.println(t);
		t.setName("My thread");
		System.out.println("Current Thread:"+t);
		 long now = System.currentTimeMillis();

	try {
		   		
            Thread.sleep(100);			
			for (int i = 0; i < 20; i++) {
		     		
		   System.out.println("  "+i);
		   
			}
			long end = System.currentTimeMillis();
			System.out.println("Time elapsed:    "+(end-now));

	} catch (Exception e) {
		// TODO: handle exception
	}
	
	  	
}
}