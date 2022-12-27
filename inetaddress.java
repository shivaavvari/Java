package sample;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class inetaddress  {

	
	public static void main(String[] args) {
		
   try {
	   InetAddress inet= InetAddress.getLocalHost();
	   System.out.println("Please check this exception"+inet.getHostAddress());
	   System.out.println("Please check this exception"+inet.getHostName());
	   System.out.println("Please check this exception"+inet.getCanonicalHostName());
			   
} catch (Exception e) {
	// TODO: handle exception
}	
		
			
	
	}
}
