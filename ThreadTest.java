package java_proj;


class A extends Thread
{
	@Override
	public void run() {
		// TODO Auto-generated method stub
	    for (int i = 1; i <=5; i++) {
			
	    	System.out.println("\t From Thread A : i ="+i);
		}
	    System.out.println("Exit from thread A");
	
	}
}

class B extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
	    for (int j = 1; j <=5; j++) {
			
	    	System.out.println("\t From Thread B : j ="+j);
		}
	    System.out.println("Exit from thread B");
	
	}
	
	
}


class C extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
	    for (int k = 1; k <=5; k++) {
			
	    	System.out.println("\t From Thread c : k ="+k);
		}
	    System.out.println("Exit from thread C");
	
	}
	
	
}


public class ThreadTest {

	
	public static void main(String[] args) {
	 new A().start();
	 new B().start();
	 new C().start();
		 
	}
}
