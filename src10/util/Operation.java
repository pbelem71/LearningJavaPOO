package util;

import entities.Accounts;

public class Operation {

	static Accounts acc = new Accounts();

	public static void depositInAccount(Double x, Double y) {
		x += y;
		acc.setCurrentValue(x);
	}

	public static void withDrawInAccount(Double x, Double y) {
		x -= y - 5;
		acc.setCurrentValue(x);
	}
	public static void newName(String x) {
		acc.setNameAccount(x);
	}

}
