package java_proj;

public class Erro5 {
  public static void main(String[] args) {
	int a[] = {5,10};
	int b=5;
	try {
		int x = a[2] /b-a[1];
		
		
	} catch (ArithmeticException e) {
		
		
			System.out.println("Division by Zero");
			
		// TODO: handle exception
	}
	catch (ArrayIndexOutOfBoundsException e) {
		// TODO: handle exception
		System.out.println("Array index error");
	}
	catch (ArrayStoreException e) {
		// TODO: handle exception
		System.out.println("Wrong Data type");
	}
	
	int y =a[1]/a[0];
	System.out.println("y="+y);
}
}
