package sample;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import javax.security.auth.x500.X500Principal;

public class ThreadGreoup {

	
	public static void main(String[] args) {
		
	try {
	    	  InputStreamReader isr = new InputStreamReader(System.in);
	    	  BufferedReader br= new BufferedReader(isr);
		    System.out.println("Please enter");
		    String c = br.readLine();
		    System.out.println("The new stuff is:"+c);  
		
		    OutputStreamWriter osw = new OutputStreamWriter(System.out);
		    BufferedWriter bw = new BufferedWriter(osw);
		    bw.write("This is the end of output");
		    System.out.println(bw);
		    
		    
	} catch (Exception e) {
		// TODO: handle exception
	}	
    
	}
}
