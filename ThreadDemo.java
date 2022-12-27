package sample;

import java.util.Date;
import java.util.Dictionary;
import java.util.Enumeration;


public class ThreadDemo implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
	for (int i = 0; i < 5; i++) {			
		System.out.println(Thread.currentThread().getName());
	}	
	}
	
public static void main(String[] args) {
	ThreadDemo t = new ThreadDemo();
	Thread t1 = new Thread(t);
	Thread t2 = new Thread(t);
	Thread t3 = new Thread(t);
	
	t1.start();
	t2.start();
	t3.start();
	Date date = new Date("jan-10-2021");
    System.out.println(date);
    int  keys[]= {1,2,3,4};
	Character[] values = {'a','b','c','d'};   
    Dictionary<int[], Character[]> shivaDictionary= new Dictionary<int[], Character[]>() {
	
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Enumeration<int[]> keys() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Enumeration<Character[]> elements() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Character[] get(Object key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Character[] put(int[] key, Character[] value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Character[] remove(Object key) {
		// TODO Auto-generated method stub
		return null;
	}
    
    }; 
    for (int i = 0; i < values.length; i++) {
	  shivaDictionary.put(keys, values);	
    }
}	
}

