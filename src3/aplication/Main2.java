package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Main2 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Rectangle rect = new Rectangle();

		System.out.println("Enter the width of rectangle: ");
		rect.width = sc.nextDouble();
		System.out.println("Enter the heigth of rectangle: ");
		rect.height = sc.nextDouble();

		System.out.println("AREA = " + rect.area() + "\nDIAGONAL = " + rect.diagonal() + "\nPERIMETER = " + rect.perimeter());
//		System.out.printf("AREA = %.2f%nPERIMETER = %.2f%nDIAGONAL = %.2f", x, y, z);

		sc.close();
	}

}
