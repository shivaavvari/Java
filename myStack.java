package java_proj;
import  java.util.*;
public class myStack {

	private LinkedList ll =new LinkedList();
	
	void push1(Object o)
{
		ll.addFirst(o);
		
		
}
	void push2(Object obj)
	{
			ll.addLast(obj);
			
			
	}
 public Object bottom()
 {
	 return ll.getLast();
 }
public	Object pop()
	{
		return ll.removeFirst();
		
	}
public static void main(String[] args) {
	car mycar;
	bird myBird;
	
	myStack s = new myStack();
s.push1(new car());
s.push2(new bird() );

System.out.println((car)s.pop()); 
 	
}

}	

	


class car{
	String car1, car2, car3, car4;
	public car() {
		// TODO Auto-generated constructor stub
		
		car1="Benz";
		car2 ="toyota";
		car3="qualis";
		car4="santro";
		
	}
}

class bird{
	String bird1, bird2,bird3;
	public bird() {
		// TODO Auto-generated constructor stub
		bird1 ="parrot";
		bird2="duck";
		bird3="raven";
		
	}
}