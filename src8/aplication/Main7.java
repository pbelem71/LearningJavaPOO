package aplication;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator1;

public class Main7 {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Calculator1 calc = new Calculator1();

		System.out.println("Enter the Dollar price: ");
		calc.dollarPrice = sc.nextDouble();
		System.out.println("Enter the value in Dollars: ");
		calc.dollarValues = sc.nextDouble();
		
		
		
		
		sc.close();
	}

}
