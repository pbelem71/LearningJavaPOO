package util;

public class Operation {

	public static Double depositAccount(Double x, Double y) {
		x += y;
		return x;
	}

	public static Double withDrawAccount(Double x, Double y) {
		x = x - y - (Double)5.0;
		return x;
	}

}