package java_proj;

import java.io.*;

public class readBytes {

	public static void main(String[] args) {
		FileInputStream infile = null;
		int b;
		try {
			 infile = new FileInputStream("C:\\Users\\aissh\\eclipse\\Java_proj\\src\\java_proj\\cities.txt");
			 while ((b=infile.read()) != -1)
			 {
				 System.out.print((char) b);
				 infile.close();
				 
			 }
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
}
