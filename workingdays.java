package java_proj;

public class workingdays {

	enum Days{
		sunday,
		monday,
		tuesday,
		wednesday,
		thursday,
		friday,
		saturday
	}
	
	public static void main(String[] args) {

		for (Days d : Days.values())
		{
			
			if (d.equals(Days.sunday))
			{
				System.out.println("value = "+d+"is a holiday");
				
			}
			else {
				{
					System.out.println("value = "+ d +"is a weekday");
							
				}
			}
		}
	}
}
