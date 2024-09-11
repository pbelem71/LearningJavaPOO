package entities;

public class Employees {

	public String employeeName;
	public Double employeeSalary, employeeTax, percentage, res;

	public Double netSalary() {
		return employeeSalary - employeeTax;
	}

	public void increaseSalary(Double x, Double y) {
		res = x * (y / 100);
	}
	public String toString() {
		return employeeName + ", $ " + String.format("%.2f", netSalary());
		}
}
