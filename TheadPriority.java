package java_proj;


class G extends Thread
{
	@Override
	public void run() {
		// TODO Auto-generated method stub
	    for (int i = 1; i <=100; i++) {
			
	    	System.out.println("\t From Thread G : i ="+i);
		}
	    System.out.println("Exit from thread g");
	
	}
}

class H extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
	    for (int j = 1; j <=100; j++) {
			
	    	System.out.println("\t From Thread G : j ="+j);
		}
	    System.out.println("Exit from thread G");
	
	}
	
	
}


 class I extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
	    for (int k = 1; k <=100; k++) {
			
	    	System.out.println("\t From Thread I : k ="+k);
		}
	    System.out.println("Exit from thread I");
	
	}
	
	
}


 class ThreadPriority {

	
	public static void main(String[] args) {
	
		G threadG = new G();
		H threadH = new H(); 
		I threadI = new I();
		
		threadG.setPriority(Thread.MIN_PRIORITY);
		threadH.setPriority(threadH.getPriority()+1);
		threadI.setPriority(Thread.MAX_PRIORITY);		
		
		System.out.println("start thread G");
		threadG.start();
		System.out.println("start thread H");
		threadH.start();
		System.out.println("start thread I");
		threadI.start();
		
	}
}
