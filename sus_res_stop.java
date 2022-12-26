package java_proj;


public class sus_res_stop implements Runnable{

    Thread Th;
    boolean suspend_flag,stop_flag;
    public sus_res_stop(String tN) {
		// TODO Auto-generated constructor stub
     Th= new Thread(this,tN);
    suspend_flag =false;
    stop_flag =false;
     Th.start();
     
    }
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		try {
			int j=1;
			while (++j<20) {
				synchronized(this) {
					while(suspend_flag) {wait();}
					if(stop_flag) {break;}
				}
			}
		} catch (InterruptedException ie) {
			// TODO: handle exception
              System.out.println("Thread interrupted");

               }
              
              
              
		}
	

    synchronized void  my_suspend(){
  	  
  	  suspend_flag =true;
   
	}
    
    synchronized void  my_resume(){
    	  
    	  suspend_flag =false;
          notify();
  	}
    synchronized void  my_stop(){
    	  
    	  suspend_flag =false;
          stop_flag =true;
          notify();
  	}
      
}



