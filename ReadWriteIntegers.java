package java_proj;
import java.io.*;

public class ReadWriteIntegers {
public static void main(String[] args) {
	

	DataInputStream dis =null;
	DataOutputStream dos =null;
	File inFile = new File("C:\\Users\\aissh\\eclipse\\Java_proj\\src\\java_proj\\rand.dat");
	
	try {
		dos = new  DataOutputStream(new FileOutputStream(inFile));
		for (int i = 0; i < 20; i++) {
			dos.writeInt((int) (Math.random() *100));
			
			
		}
	} catch (IOException ioe) {
		// TODO: handle exception
		System.out.println(ioe.getMessage());
	}
	finally {
		try {
			dos.close();	
		} catch (IOException ioe) {
			// TODO: handle exception
		}
		
		
	}
	try {
		dis = new  DataInputStream(new FileInputStream(inFile));
		for (int i = 0; i < 20; i++) {
			Integer n =  dis.readInt();
			System.out.print(n+" ");
			
		}
	} catch (IOException ioe) {
		// TODO: handle exception
		System.out.println(ioe.getMessage());
	}
	finally {
		try {
			dis.close();	
		} catch (IOException ioe) {
			// TODO: handle exception
		}
		
		
	}
	
	
	
}
}