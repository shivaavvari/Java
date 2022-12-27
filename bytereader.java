package sample;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

public class bytereader {
public static void main(String[] args) {
	
	ByteArrayOutputStream bs = new ByteArrayOutputStream();
	
	String s= "This is the new attempt bytearray output stream reader";
    for (int i = 0; i < s.length(); i++) {
		bs.write(s.charAt(i));
	System.out.println("The new data is:"+bs);
    System.out.println("The size of  "+bs.size());    
    
    ByteArrayInputStream in = new ByteArrayInputStream(bs.toByteArray());
    
    int ib  = in.available();
    
    byte ibuf[] = new byte[ib];
    
    int byrd = in.read(ibuf, 0, i);
    
    System.out.println(byrd);
    System.out.println(new String(ibuf));
    
    
    
    
    
    
    
    
    
    
    }	
	
	
	
}
}
