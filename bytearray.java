package sample;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class bytearray {
public static void main(String[] args) throws IOException {
	
	ByteArrayOutputStream bs = new ByteArrayOutputStream();
	String s ="Welcome to the bytearray input stream";
	for (int i = 0; i < s.length(); i++) {
		bs.write(s.charAt(i));
	
	System.out.println(bs);
	System.out.println(bs.size());
	
	ByteArrayInputStream in =new ByteArrayInputStream(bs.toByteArray());

	int ib = in.available();
	
	byte ibuf[] = new byte[ib];
	int byrd = in.read(ibuf, 0, i);
    System.out.println(byrd);
    System.out.println(new String(ibuf));
}
}
}
