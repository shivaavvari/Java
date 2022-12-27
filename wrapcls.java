package sample;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public  class wrapcls{
public static void main(String[] args) {
	

	float pAmount= new Float(0);
	float intrate = new Float(0);
	int years = 0;
	
    	try {
			
			InputStreamReader isr = new InputStreamReader(System.in);		
			BufferedReader br = new BufferedReader(isr);
			
			
			System.out.println("Please enter PAmount");
			String pString = br.readLine();
			pAmount = Float.valueOf(pString).floatValue();
			
			System.out.println("Please enter Interest Value");
			String istr = br.readLine();
		    intrate = Float.valueOf(istr).floatValue();
			
			
			System.out.println("Please enter number of years");
			String ystr = br.readLine();
		    years = Integer.valueOf(ystr).intValue();
			
			
         		} catch (Exception e) {
		
         			System.out.println("Input error");// TODO: handle exception
		            System.exit(0);
         		}
    	
    	Float final_value = Interest(pAmount,intrate,years);
    	System.out.println();
    	System.out.println("The total value is : "+final_value.intValue());
 }

private static Float Interest(float p, float i, int y) {
	// TODO Auto-generated method stu
	
	int yr =1;
    float  sum = p;
	while(yr<=y){
		 sum=sum*(1+i);
		 yr+=1;
		 
	}
	
	
	return sum;
	
	
}


}
