package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Triangle x, y;
		x = new Triangle();
		y = new Triangle();

		System.out.println("Enters the measures of triangle X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Enters the measures of the triangle y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();

		Double areaX = x.area(), areaY = y.area();

		System.out.printf("Area X:%.4f%nArea Y:%.4f%n", areaX, areaY);
		if (areaX > areaY) {
			System.out.printf("Larger area: X");
		} else {
			System.out.printf("Larger area: Y");
		}

		sc.close();
	}

}
