package java_proj;
import java.io.*;

public class Writebytes {
public static void main(String[] args) {
	byte cities[] = {'D','E','L','H','I','\n','M','A','D','R','A','S','\n','L','O','N','D','O','N','\n'};
	FileOutputStream outfile = null;
    try {
		outfile = new FileOutputStream("C:\\Users\\aissh\\eclipse\\Java_proj\\src\\java_proj\\cities.txt");
		outfile.write(cities);
		outfile.close();
	} catch (IOException e) {
		// TODO: handle exception
		System.out.println(e);
		System.exit(-1);
	}	
}
}