package sample;
import java.io.*;
public class SequenceBuffer {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
       FileInputStream file1 = null;
       FileInputStream file2 = null;
       SequenceInputStream file3 =null;       
		
       file1 = new FileInputStream("text1.dat");
       file2 = new FileInputStream("text2.dat");
       file3 = new SequenceInputStream(file1,file2);
       
       
       
       BufferedInputStream inBuffer = new BufferedInputStream(file3);
       BufferedOutputStream outBuffer = new BufferedOutputStream(System.out);
       int ch;
       while((ch = inBuffer.read())!=-1)
       {
    	   outBuffer.write(ch);
    	   
       }
       inBuffer.close();
       outBuffer.close();
       
       file1.close();
       file2.close();
       
	}

}
