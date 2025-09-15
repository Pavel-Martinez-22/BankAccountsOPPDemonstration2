/*
Brief Description:  This file is a subclass of Account. It provides its own methods specific to the Checking Account.The methods in this file are override withdraw and override toString. In this version of the project try blocks, and exceptions have been added.
 */

public class CheckingAccount extends Account {

	public CheckingAccount(int id, double balance) {
		super(id, balance);
	}

	// Policy: withdraw amount must greater than 0 and less than or equal to current
	// account balance
	@Override
	public void withdraw(double amount) {
		double updateBalance = 0.0;
		try {
			if (amount < 0) {
				throw new IllegalAmountException(amount);
			} else if ((getBalance() - amount) < 0) {
				throw new NoSufficientFundsException(amount);

			} else {
				updateBalance = getBalance() - amount;
				setBalance(updateBalance);
			}
		} catch (IllegalAmountException ex) {
			ex.printStackTrace();

		} catch (NoSufficientFundsException ex) {
			ex.printStackTrace();
		}

	}

	// Override the toString method defined in the superclass
	@Override
	public String toString() {
		return "Checking Account \n" + super.toString();
	}
}
