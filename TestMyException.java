package java_proj;



class MyException extends Exception
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	MyException(String message)
	{
		super(message);
		
	}

}
public class TestMyException {
public static void main(String[] args) {
	int x= 5, y=1000;
	try {
		 
		 float z = (float) x/(float)y;
		 if(z<0.01) {
			 throw new MyException("Number is too small");
		 }
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println("caught my exception");
		System.out.println(e.getMessage());
		
	}
	finally {
		System.out.println("I am always here");
	}
}
}
