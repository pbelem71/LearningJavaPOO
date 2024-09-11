package entities;

public class Student {

	public String studentName;
	public Double studentGrade1, studentGrade2, studentGrade3;

	public Double finalGrade() {
		return studentGrade1 + studentGrade2 + studentGrade3;
	}

	public String toString() {
		return "Final grade = " + finalGrade();
	}
}
