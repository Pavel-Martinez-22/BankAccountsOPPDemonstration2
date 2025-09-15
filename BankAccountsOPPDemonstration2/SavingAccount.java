/*
Brief Description:  This file is a subclass of Account. It provides its own methods specific to the Savings Account.The methods in this account are set and get interest, override withdraw and override toString, and an add interest method.In this version of the project try blocks and exceptions have been added.
 */


public class SavingAccount extends Account {

	private double interestRate;

	public SavingAccount(int id, double balance, double interestRate) {
		super(id, balance);
		this.interestRate = interestRate;
	}

	// Set Interest Rate
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	// Return Interest Rate
	public double getInterestRate() {
		return interestRate;
	}

	// Policy: withdraw amount must greater than and the minimum balance of the
	// account must be 500 all the time.
	@Override
	public void withdraw(double amount) {
		double updateBalance = 0.0;
		try {
			if(amount < 0 ) {
				throw new IllegalAmountException(amount);
			}else if ((getBalance() - amount < 500)) {
				throw new NoSufficientFundsException(amount);
			}else {
				updateBalance = getBalance() - amount;
				setBalance(updateBalance);
			}
		}catch(IllegalAmountException ex) {
			ex.printStackTrace();
		}catch(NoSufficientFundsException ex) {
			ex.printStackTrace();
		}
	}

	// The account balance updated to current_balance * (1 + interestRate).
	public void addInterest() {
		double currentBalance = getBalance() * (1 + interestRate);
		setBalance(currentBalance);
	}

	// Override the toString method defined in the superclass
	@Override
	public String toString() {
		return "Savings Account " + "\nInterest Rate: " + getInterestRate() + "\n" + super.toString();
	}

}