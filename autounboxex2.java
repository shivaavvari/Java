package java_proj;

import java.util.Stack;

public class autounboxex2 {
public static void main(String[] args) {

	Stack<Integer> Mystack = new Stack<Integer>();
	Mystack.push(10);
	Mystack.push(20);
	Mystack.push(30);
	Mystack.push(40);
	int stackSum = Mystack.pop() + Mystack.pop();
	System.out.println("" + Mystack.pop());
	System.out.println("" + Mystack.pop());

	System.out.println(""+stackSum);
	
	
	
	
	
	
	
}
}
