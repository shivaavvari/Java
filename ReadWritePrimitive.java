package java_proj;
import java.io.*;

public class ReadWritePrimitive {
public static void main(String[] args) throws IOException {
	
	File primitive = new File("C:\\Users\\aissh\\eclipse\\Java_proj\\src\\java_proj\\prim.dat");
	FileOutputStream fos=new FileOutputStream(primitive);
	DataOutputStream dos= new DataOutputStream(fos);
	
	
	dos.writeInt(1999);
	dos.writeDouble(375.85);
	dos.close();
	fos.close();
	
	FileInputStream fis = new FileInputStream(primitive);
	DataInputStream dis = new DataInputStream(fis);
	System.out.println(dis.readInt());
	System.out.println(dis.readDouble());
	
	dis.close();
	fis.close();
}
}
