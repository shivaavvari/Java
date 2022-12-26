package java_proj;
import java.io.*;

public class prandomAccess {

	public static void main(String[] args) throws IOException{
		RandomAccessFile raf = new RandomAccessFile("random.txt", "rw");
		try {
			Writer out=new OutputStreamWriter(new FileOutputStream(raf.getFD()),"utf-8"); 
			out.write("programming in c");
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		finally {
			raf.close();
		}
	}
	
	
}
