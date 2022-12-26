package java_proj;

import java.util.AbstractSequentialList;
import java.util.Vector;

public class LanguageVector {
   public static void main(String[] args) {
	Vector list= new Vector();
    int length  = args.length;
    for (int i = 0; i < length; i++) {
		list.addElement(args[i]);
		
	}
    list.insertElementAt("cobol", 0);
    list.insertElementAt("ada", 1);
    list.insertElementAt("basic", 0);
    list.insertElementAt("c++", 2);
    list.insertElementAt("fortran", 3);
    
	int size  = list.size();
	String listArray[] = new String[size];
	list.copyInto(listArray);
	System.out.println("list of languages");
	for (int i = 0; i < size; i++) {
		System.out.println(listArray[i]);
	}
}
}
