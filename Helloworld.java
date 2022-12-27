package sample;

import java.util.Scanner;

public class Helloworld{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println("HelloWorld ");
       Scanner sc = new Scanner(System.in);
       System.out.println("Please enter value of");
       int a = sc.nextInt();
       System.out.println("Please enter value of");
       int b = sc.nextInt();
       System.out.println("Please enter value of");
       int c = sc.nextInt();
       System.out.println("Please enter value of");
       double d = sc.nextDouble();
       
       System.out.println("Please enter value of");
       System.out.println("Please enter value of");
       System.out.println("Please enter value of");
       System.out.println("Please enter value of");
       System.out.println("Please enter value of");
       System.out.println("Please enter value of");
          
       if(a>b)
       {
    	   if(b>c)
    	   {
    		   System.out.println("a is greatest");
    	   }
    	   else if (c>a) {
    		   System.out.println("c is greatest");
			
		  } 
          else {
			System.out.println("c is greatest");
		  }
    	   
	  }
       else {
    	   if(b>c)
    	   {
    		   System.out.println("b is greatest");
    	   }
    	   else {
			 System.out.println("c is greatest");
		}
	}
}
}