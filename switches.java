package sample;

import java.util.Scanner;

public class switches {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Please enter a number from 1-5");
		
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		
		switch (num) {
		case 1:
		    System.out.println("sunday");
			break;
		case 2:
		    System.out.println("monday");
			break;
		case 3:
		    System.out.println("tuesday");
			break;
		case 4:
		    System.out.println("wednesday");
			break;
		case 5:
		    System.out.println("thursday");
			break;

		default:
			break;
		}
		
	}

}
