package java_proj;
import java.util.*;
import java.io.*;
public class Inventory {

	static DataInputStream din = new DataInputStream(System.in);
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
	static StringTokenizer st;
	
	public static void main(String[] args) throws IOException{
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("invent.dat")); 
        System.out.println("Enter code number");
        st= new StringTokenizer(br.readLine());
        int code =  Integer.parseInt(st.nextToken());
        System.out.println("Enter  number of Items");
        st= new StringTokenizer(br.readLine());
        int items =  Integer.parseInt(st.nextToken());
        System.out.println("Enter cost ");
        st= new StringTokenizer(br.readLine());
        double cost =  new Double(st.nextToken()).doubleValue();

        dos.writeInt(code);
        dos.writeInt(items);
        dos.writeDouble(cost);
        dos.close();
        DataInputStream dis = new DataInputStream(new FileInputStream("invent.dat"));
        int codeNumber =dis.readInt();
        int totalItems = dis.readInt();
        double itemcost = dis.readDouble();
        double totalCost = totalItems * itemcost;
        dis.close();
        
        
        System.out.println();
        System.out.println(codeNumber);
        System.out.println(itemcost);
        System.out.println(totalCost);
        
	}
	
}
