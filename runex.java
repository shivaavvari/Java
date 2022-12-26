package java_proj;


class rune implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 1; i <=10; i++) {
	  		
 	    	System.out.println("\t From Threadx : "+i);
		}
		System.out.println("end of thread X");
	}

}

class runex{
  public static void main(String[] args) {
	
	  
	  rune runnnable = new rune();
	  Thread  threadx =  new Thread(runnnable);
	  threadx.start();
	  System.out.println("end of main thread");
	  
}	
	
	
	
}




