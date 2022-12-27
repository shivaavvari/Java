package sample;

import java.util.Enumeration;

class Enum_dem implements Enumeration<Object> {
    private boolean more = true;
    private int count =0;
	
	
	@Override
	public boolean hasMoreElements() {
		// TODO Auto-generated method stub
	if (count >4)
	{
		return false;
	}
	else {
		{
			return true;
		}
	}
	
	}

	@Override
	public Object nextElement() {
		// TODO Auto-generated method stub
	    count++;
		if (count>4)
		{
		  more =false;
		  return new Integer(count=0);
		  
		}
		
		else {
			return count;
	        
		}
			
	}

}


public class Enum_demo
{
	public static void main(String[] args) {
		
		Enum_dem enum_dem = new Enum_dem();
		while(enum_dem.hasMoreElements())
		{
			System.out.println(enum_dem.nextElement());
		}
		
	}
	
}