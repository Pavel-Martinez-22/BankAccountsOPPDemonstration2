/*
Brief Description:  This file contains the superclass Account and its methods. Methods include set balance and id, get balance and id, withdraw, deposit, and toSrting.
 */

public class Account {
	private int id;
	private double balance;

	// Default constructor
	public Account() {
		this.id = 0;
		this.balance = 0.0;
	}

	// Overload constructor
	public Account(int id, double balance) {
		this.id = id;
		try {
			if (balance < 0) {
				throw new IllegalAmountException(balance);
			} else {
				this.balance = balance;
			}
		} catch (IllegalAmountException ex) {
			ex.printStackTrace();
		}
	}

	// Set Balance
	public void setBalance(double balance) {
		this.balance = balance;
	}

	// Return Balance
	public double getBalance() {
		return this.balance;
	}

	// Set ID
	public void setId(int id) {
		this.id = id;
	}

	// Return ID
	public int getId() {
		return this.id;
	}

	// Adjust Balance after withdraw
	public void withdraw(double amount) {
		// Empty
	}

	// Adjust Balance after deposit
	public void deposit(double amount) {
		try {
			if (amount < 0) {
				throw new IllegalAmountException(amount);
			} else {
				balance += amount;
			}
		} catch (IllegalAmountException ex) {
			ex.printStackTrace();

		}

	}

	// Return a string representation of this object
	public String toString() {
		return "Account ID: " + this.id + "\nBalance: $" + String.format("%.2f", this.balance);
	}

}
