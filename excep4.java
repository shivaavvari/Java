package java_proj;

class me extends Exception
{
      /**
	 * 
	 */
	private static final long serialVersionUID = -5439859770554715209L;

	me(String s)
     {
    	 super(s); 	
     }
	
}



public class excep4 {

	public static void main(String[] args) {
		
		if (args[0]=="Hello")
		{
			System.out.println("String is right");
			
		}
		else {
			try {
				throw new me("invalid String"); 
			} catch (me ex) {
				// TODO: handle exception
				System.out.println(ex.getMessage());
			}
		}
	}
}
