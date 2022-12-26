package java_proj;

import java.util.Stack;

public class autounboxex {
  public static void main(String[] args) {
	Stack mystack = new Stack();
	mystack.push(new Integer(10));
	mystack.push(new Integer(20));
	Integer stksum1 = (Integer) mystack.pop();
	Integer stksum2 = (Integer) mystack.pop();
    int stksum = stksum1.intValue() +stksum2.intValue();
    System.out.println(stksum);    
}
}
