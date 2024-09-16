package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Accounts;
import util.Operation;

public class Program1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Double currentAccountValue = 0.0;
		int accountNum;
		String accountHolder, verificInitialDeposit;
		char confirm = 'y';

		System.out.println("Enter account number: ");
		accountNum = sc.nextInt();
		System.out.println("Enter the account holder: ");
		sc.nextLine();
		accountHolder = sc.nextLine();
		System.out.println("Is there an initial deposit?\ntype yes or not");
		verificInitialDeposit = sc.nextLine();
		if (verificInitialDeposit.indexOf(confirm) != 1) {
			System.out.println("Enter the inital deposit value: ");
			currentAccountValue = sc.nextDouble();
		}

		Accounts acc = new Accounts(accountNum, accountHolder, currentAccountValue);
		
		for (boolean y = true; y;) {

			for (boolean x = true; x;) {
				Double newValue;
				String newName;
				System.out.println(
						"Which operation do you need?\n(1)Current Balance\n(2)Deposit value\n(3)Withdraw value\n(4)Change account holder name");
				int ope = sc.nextInt();
				switch (ope) {
				case 1:
					System.out.println(acc);
					x = false;
					break;
				case 2:
					System.out.println("Amount to deposit into the account");
					newValue = sc.nextDouble();
					acc.setCurrentValue(Operation.depositAccount(currentAccountValue, newValue));
					System.out.print("Updated " + acc);
					x = false;
					break;
				case 3:
					System.out.println("Ammount to withdraw from the account: ");
					newValue = sc.nextDouble();
					acc.setCurrentValue(Operation.withDrawAccount(currentAccountValue, newValue));
					System.out.println("Updated " + acc);
					x = false;
					break;
				case 4:
					System.out.println("What the new name?");
					sc.nextLine();
					newName = sc.nextLine();
					acc.setNameAccount(newName);
					System.out.println("Updated " + acc);
					x = false;
					break;
				default:
					System.out.println("Invalid operation, try again");
				}
			}

			System.out.println("\nDid you need one more operation?\ntype 1 for yes\ntype 2 for not");
			int verifOpp = sc.nextInt();
			if (verifOpp == 2) {
				y = false;
			}
		}
		
		System.out.println("Thank you for your preference");
		sc.close();
	}

}