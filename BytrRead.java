package java_proj;
import java.io.*;

public class BytrRead {
public static void main(String[] args) throws IOException {
	int i;
	FileInputStream fin = new FileInputStream("C:\\Users\\aissh\\eclipse\\Java_proj\\src\\java_proj\\cities.txt");
	do {
		i = fin.read();
		System.out.print((char)i );
	} while (i!=-1);
fin.close();
fin=null;
}
}
