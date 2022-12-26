package java_proj;

import java.io.IOException;
import java.io.RandomAccessFile;


public class RandomIO {
public static void main(String[] args) {
	RandomAccessFile file =null;
	try {
		file=new RandomAccessFile("C:\\Users\\aissh\\eclipse\\Java_proj\\src\\java_proj\\rand.dat", "rw");
		file.writeChar('X');
		file.writeInt(555);
		file.writeDouble(3.1412);
		file.seek(0);
		System.out.println(file.readChar());
		System.out.println(file.readInt());
		System.out.println(file.readDouble());
		file.seek(2);
		System.out.println(file.readInt());
		file.close();

	} catch (IOException e) {
		// TODO: handle exception
		
				System.out.println(e);
	}
}
}
