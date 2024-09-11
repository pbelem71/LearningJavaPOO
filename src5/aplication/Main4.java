package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Employees;

public class Main4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Employees emp = new Employees();

		System.out.println("Enter your name: ");
		emp.employeeName = sc.nextLine();
		System.out.println("Enter your salary: ");
		emp.employeeSalary = sc.nextDouble();
		System.out.println("Enter the taxes: ");
		emp.employeeTax = sc.nextDouble();

		System.out.printf("Employee: %s, $ %.2f%n", emp.employeeName, emp.netSalary());
		System.out.println("Witch percentage to increase salary? ");
		emp.percentage = sc.nextDouble();
		emp.increaseSalary(emp.employeeSalary, emp.percentage);
		System.out.printf("Updated data: %s, $ %.2f", emp.employeeName, emp.netSalary() + emp.res);

		sc.close();
	}

}
