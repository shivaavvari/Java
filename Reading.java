package java_proj;

import java.io.DataInputStream;
class Reading {

public static void main (String[] args) {
 
	DataInputStream in = new DataInputStream(System.in);
	
	int intNumber=0;
	float floatNumber =0.0f;
	try {
		System.out.println("Please enter a Integer:");
		intNumber = Integer.valueOf(in.readInt()).intValue();
		System.out.println("Enter a float number");
		floatNumber = Float.valueOf(in.readFloat()).floatValue();
		
		
	} catch (Exception e) {}
		// TODO: handle exception
		System.out.println("intNumber = "+intNumber);
		System.out.println("floatNumber = "+floatNumber);
		
	
	
	
}
}
