package java_proj;
import java.io.*;
public class CopyCharacters {
   public static void main(String[] args) {
	File inFile  = new File("C:\\Users\\aissh\\eclipse\\Java_proj\\src\\java_proj\\input.dat");
	File outFile  = new File("C:\\Users\\aissh\\eclipse\\Java_proj\\src\\java_proj\\output.dat");
	FileReader ins=null;
	FileWriter outs =null;
	
     try {
	   ins = new FileReader(inFile);
	   outs  = new FileWriter(outFile);
	// TODO: handle Reader;
	   
	   int ch;
	   while((ch=ins.read())!= -1)
	   {
		   outs.write(ch);
		   
	   }
}catch (IOException e) {
	// TODO: handle exception
        System.out.println(e);
        System.exit(-1);
}  
     finally {
		 	 try {
				ins.close();
				outs.close();
			} catch (IOException e2) {
				// TODO: handle exceptio
	}
}
   }
}
