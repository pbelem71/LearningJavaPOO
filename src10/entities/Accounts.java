package entities;

public class Accounts {

	private int accountNum;
	private String nameAccount;
	private Double currentValue;

	public Accounts() {
	}

	public Accounts(int accountNum, String nameAccount, Double initialDeposit) {
		this.accountNum = accountNum;
		this.nameAccount = nameAccount;
		this.currentValue = initialDeposit;
	}

	public void setNameAccount(String nameAccount) {
		this.nameAccount = nameAccount;
	}

	public Double getCurrentValue() {
		return currentValue;
	}

	public void setCurrentValue(Double x) {
		this.currentValue = x;
	}

	public String toString() {
		return "Account data:\n" + "Account " + accountNum + ", Holder " + nameAccount + ", balance " + currentValue;
	}

}