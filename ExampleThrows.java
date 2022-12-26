package java_proj;

public class ExampleThrows {

	static void divide_m() throws ArithmeticException
	{
		
		int x=22,y=0,z;
		z= x/y;
		
		
	}
	public static void main(String[] args) {
		try {
			divide_m();
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("Caught the exception "+ e);
		}
	}
}
