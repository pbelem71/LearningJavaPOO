package aplication;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator1;

public class Main7 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Double dollarPrice, dollarValues;

		System.out.println("What is the Dollar price?");
		dollarPrice = sc.nextDouble();
		System.out.println("How many dollars will be bought?");
		dollarValues = sc.nextDouble();
		
		System.out.println("Amount to be paid in reais = " + (Calculator1.currentConverter(dollarPrice, dollarValues)
		+ (Calculator1.currentConverter(dollarPrice, dollarValues) * 0.06)));
		
		sc.close();
	}

}
