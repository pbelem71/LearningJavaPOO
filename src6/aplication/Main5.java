package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Main5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Student stu = new Student();

		System.out.println("Enter the student name: ");
		stu.studentName = sc.nextLine();
		System.out.println("Enter the student grades: ");
		stu.studentGrade1 = sc.nextDouble();
		stu.studentGrade2 = sc.nextDouble();
		stu.studentGrade3 = sc.nextDouble();

		if (stu.finalGrade() > 60) {
			System.out.println(stu + "\nPASS");
		} else {
			System.out.println(stu + "\nFAILED\nMissing " + ((int)60 - stu.finalGrade()));
		}

		sc.close();
	}

}
