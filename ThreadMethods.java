package java_proj;


class D extends Thread
{
	@Override
	public void run() {
		// TODO Auto-generated method stub
	    for (int i = 1; i <=5; i++) {
	  		if (i==1)  Thread.yield();
 	    	System.out.println("\t From Thread D : i ="+i);
		}
	    System.out.println("Exit from thread D");
	
	}
}

class E extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
	    for (int j = 1; j <=5; j++) {
	         if (j==3) {}		interrupt();
	    	System.out.println("\t From Thread E : j ="+j);
		}
	    System.out.println("Exit from thread E");
	
	}
	
	
}


class F extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
	    for (int k = 1; k <=5; k++) {
	    	if (k==1)
	    	try {
				
					{sleep(1000);}
			} catch (Exception e) {
				// TODO: handle exception
			}
	    	System.out.println("\t From Thread F : k ="+k);
		}
	    System.out.println("Exit from thread F");
	
	}
	
	
}


class ThreadMethods {

	
	public static void main(String[] args) {
	 new D().start();
	 new E().start();
	 new F().start();
		 
	}
}
