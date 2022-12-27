package sample;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.channels.ClosedByInterruptException;

public class Fileexam {
public static void main(String[] args) {
	
try {
	FileOutputStream fs = new FileOutputStream("abc.txt");
	String s = "This is the fileinputstream";
	for (int i = 0; i < s.length(); i++) {
		fs.write(s.charAt(i));
	}
	fs.close();

	FileInputStream fd = new FileInputStream("abc.txt");
	int id  = fd.available();
	
	byte ibuf[] = new byte[id];
	int byrd =   fd.read(ibuf,0,id);
	
	System.out.println(byrd);
	System.out.println(new String(ibuf));
} catch (Exception e) {
	// TODO: handle exception
}

	
	
	
}
}