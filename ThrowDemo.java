package sample;

public class ThrowDemo {

	
	
	
	
	int size, array[];
	public ThrowDemo(int s) {
	
		size =s;
try {
	checkDemo();
} catch (Exception e) {
	// TODO: handle exception
}
		
		// TODO Auto-generated constructor stub
	}
	 void checkDemo() throws ArraySizeException{
		// TODO Auto-generated method stub
		
		if (size <0)
		throw new ArraySizeException();
		
		array = new int[3];
		for (int i = 0; i <3; i++) {
			array[i] = i+1;
		}
	}
	public static void main(String args[]) {
		new ThrowDemo(Integer.parseInt(args[-1]));
	}
}

class ArraySizeException extends NegativeArraySizeException
{
	public ArraySizeException() {	
	super("you have passed an illegal array size");	
	}
	
	
}

