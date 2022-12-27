package sample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class throwsDemo {
public static void main(String[] args) throws IOException, NumberFormatException{
	
	double aimedamount;
	double interest =7.5;
    double payment;
    int years =0;
    double balance = 0;
    
    
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    System.out.println("Amount to be expected at the time of retirement");
    aimedamount = Double.valueOf(br.readLine()).doubleValue();
	int s  = Integer.valueOf(br.readLine()).intValue();
	System.out.println(s);
	
    System.out.println("Your contribution");
    payment = Double.valueOf(br.readLine()).doubleValue();
  
    while (balance < aimedamount)
    {
    	balance = (balance +payment) *(1+(interest/100));
    	years++;
    }

    System.out.println(years);
}
}
