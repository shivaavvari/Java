package sample;
import java.lang.Math;
public class arraycopy {
    
    public static void main(String[] args) {
        int[] smallprimes = {2,3,5,7,11,14};
		int[] luckynumbers = {1001,1002,1003,1004,1005,1006,1007};
    	
        System.arraycopy(smallprimes, 2, luckynumbers, 3, 4);
        for (int i = 0; i < luckynumbers.length; i++) {
	    	System.out.println(luckynumbers[i]);
		    	
		}
        for (int i = 0; i < 100; i++) {
	    double j = Math.pow(i,i+2);
		System.out.println(j);
		
        int fourthbitfromright =(i & 8)/8;
        System.out.println(fourthbitfromright);
	
        }
        }
    
    

}
