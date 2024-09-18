package util;

public class Operation {
	
	static final Double TAX = 5.0;

	public static Double depositAccount(Double x, Double y) {
		x += y;
		return x;
	}

	public static Double withDrawAccount(Double x, Double y) {
		x = x - y - TAX;
		return x;
	}

}