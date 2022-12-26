package java_proj;

import java.util.ArrayList;

public class ArrayListExample {

public static void main(String[] args) {
	
	ArrayList<String> arrayList = new ArrayList<String>();
   System.out.println(arrayList.size());
   arrayList.add("A");
   arrayList.add("B");
   arrayList.add("C");
   arrayList.add("D");
   arrayList.add("E");
   arrayList.add("F");
   arrayList.add("G");
   System.out.println(arrayList.size());
   System.out.println(arrayList	);
   arrayList.add(2,"E");
   
}
}