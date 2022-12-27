package sample;

public class contrl_break {
public static void main(String[] args) {
	Loop1 :for (int i = 0; i < 100; i++) {
        	System.out.println("");
                
        	if (i>10)
        		{break;}
        	for (int j = 0; j < i; j++) {
                
        	System.out.print("*");
        	if(i==j)
        		{continue Loop1;}
        	
		}
	
	}
}
}
