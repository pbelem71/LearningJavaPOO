package entities;

public class Accounts {

	private int accountNum;
	private String nameAccount;
	private Double currentValue;

	public Accounts(Double currentValue) {
		this.currentValue = currentValue;
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

	public void setCurrentValue(Double currentValue) {
		this.currentValue = currentValue;
	}

	public String toString() {
		return String.format("Account data:%nAccount %s, Holder %s, Balance %.2f", accountNum, nameAccount,
				currentValue);

	}

}