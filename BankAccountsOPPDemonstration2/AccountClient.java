/*
Brief Description:  This file is the test file that test the operations of the methods. I have created an Array that holds 4 objects of super class account. Then I have tested each object according to there sublcass type.
 */

public class AccountClient {
	public static void main(String[] args) {

		// 1. Declare an array of Account, named accounts, of size 4
		Account[] accounts = new Account[4];

		// 2. Initialize every element in accounts array.
		// Make accounts[0] and accounts[1] be CheckingAccount
		accounts[0] = new CheckingAccount(101, 250);
		accounts[1] = new CheckingAccount(102, 1500);

		// Make accounts[2] and accounts[3] be SavingsAccount
		accounts[2] = new SavingAccount(103, 300, 0.06);
		accounts[3] = new SavingAccount(103, 2000, 0.06);
		try {
			// 3. Make deposit and withdraw for each account and print out the account
			// information to see the result
			for (Account account : accounts) {

				System.out.println(account);
				// Deposit
				System.out.println("Deposit: $250.00");
				account.deposit(250.0);
				System.out.println("After Deposit\n" + "Balance: $" + String.format("%.2f", account.getBalance()));

				// Withdraw
				System.out.println("Withdraw: $600.00");
				account.withdraw(600);
				System.out.println("After Withdraw\n" + "Balance: $" + String.format("%.2f", account.getBalance()));

				// 4. If the account is SavingsAccount, call addInterest function to update the
				// account balance. Then print out the account information
				if (account instanceof SavingAccount) {
					((SavingAccount) account).addInterest();
					System.out.println("Balance with interest: $" + String.format("%.2f", account.getBalance()));
				}
				System.out.println();
			}
		} catch (Exception ex) {

		}
	}

}
