package java_proj;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccess {

	public static void main(String[] args) {
		RandomAccessFile rFile;
		try {
			rFile=new RandomAccessFile("C:\\Users\\aissh\\eclipse\\Java_proj\\src\\java_proj\\city.txt", "rw");
			rFile.seek(rFile.length());
			rFile.writeBytes("Mumbai \n");
			rFile.close();
			
		} catch (IOException ioe) {
			// TODO: handle exception
		System.out.println(ioe);
		}
	}
}
