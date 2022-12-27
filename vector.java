package sample;

import java.util.Vector;

public class vector extends Vector<Integer> {
public static void main(String[] args) {
	

	Vector<Integer> e = new Vector<Integer>();
   e.add(24);
   e.addElement(3);   
   System.out.println(e);
 System.out.println(e.capacity());
 System.out.println(e.clone());
 System.out.println(e.firstElement());
 System.out.println(e.size());
 System.out.println(e.toString());
 
}
}
