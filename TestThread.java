package sample;

import java.applet.Applet;

public class  TestThread {

	public synchronized static void main(String[] args) {
		TestingThread t1 =	 new TestingThread();
		TestingThread t2 =	 new TestingThread();
		TestingThread t3 =	 new TestingThread();
			
	}
	
}


class   TestingThread extends Thread
{
	Thread min_thread,max_thread,norm_thread;
	int i =0;
	
	TestingThread()
	{
		min_thread = new Thread();
		min_thread.setName("Min Thread");
		min_thread.setPriority(min_thread.MIN_PRIORITY);

		max_thread = new Thread();
		max_thread.setName("Max Thread");
		max_thread.setPriority(max_thread.MAX_PRIORITY);


		norm_thread = new Thread();
		norm_thread.setName("norm Thread");
		norm_thread.setPriority(norm_thread.NORM_PRIORITY);
         start();}
	
	
		public void run() {
	
			try {
				
				for (int i = 0; i < 6; i++) {
					System.out.println("Thread :"+Thread.currentThread());
					Thread.sleep(100);
				}
				
				
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			
		}
	}


	
