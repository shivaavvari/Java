package sample;

import java.util.Stack;

public class stack extends Stack<Integer> {
	
	
public static void main(String[] args) {
	Stack<Integer> e = new Stack<Integer>();
	
	System.out.println(e.push(100));
	System.out.println(e.push(101));
	System.out.println(e.push(102));
	System.out.println(e.push(103));
	System.out.println(e.push(104));
	System.out.println(e.push(105));
System.out.println(e.pop());	
	System.out.println(e.toString());
	
}	

	
	
}
