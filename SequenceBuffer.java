package java_proj;
import java.io.*;

public class SequenceBuffer {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file1 = null;
		FileInputStream file2 = null;
		SequenceInputStream file3 =null;	
		
		file1 = new FileInputStream("C:\\Users\\aissh\\eclipse\\Java_proj\\src\\java_proj\\text1.dat");

		file2 = new FileInputStream("C:\\Users\\aissh\\eclipse\\Java_proj\\src\\java_proj\\text2.dat");
		
		file3 = new SequenceInputStream(file1, file2);
		BufferedInputStream inBuffer = new BufferedInputStream(file3);
		BufferedOutputStream outBuffer = new BufferedOutputStream(System.out);
		
		int ch;
		
		while( (ch=inBuffer.read()) != -1)
		{
			outBuffer.write((char) ch);
		}
		inBuffer.close();
		outBuffer.close();
		file1.close();
		file2.close();
	}
	
}
