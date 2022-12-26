package java_proj;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.LookAndFeel;

public class Invest {
public static void main(String[] args) {
	Float principleAmount = new Float(0);
	Float interestRate = new Float(0);
	int numYears = 0;
	
	try {
		BufferedReader d = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the principle Amount");
		System.out.flush();
		String principleString= d.readLine();
		principleAmount = Float.valueOf(principleString);
		System.out.println("Enter the interest Rate");
		System.out.flush();
		String interestString= d.readLine();
	    interestRate = Float.valueOf(interestString);
		
		System.out.println("Enter the number of years");
		System.out.flush();
		String  yearsString= d.readLine();
	    numYears = Integer.parseInt(yearsString);			
		
		
	} catch (IOException e) {
		// TODO: handle exception
		System.out.println("I/O error");
		System.exit(1);
		
	}
	
	float value =  loan(principleAmount.floatValue(),interestRate.floatValue(),numYears);
	printline();
	System.out.println("Final value=" +value);
	printline();
}

static float loan(float p, float r,int n)
{
	int year =1;
	float sum = p;
	while(year <=n)
		{
	      sum = sum * (1+r);
	      year= year+ 1;
		}
		
	
 return sum;
}


static void printline()
{
	for (int i = 0; i <=30; i++) {
		System.out.print("= ");
		
		
	}
	System.out.println(" ");
}
}
