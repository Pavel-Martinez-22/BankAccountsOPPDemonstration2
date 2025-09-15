/*
Brief Description:  This file contains the NoSufficientFundsException  class created in order to catch runtime errors.
 */

public class NoSufficientFundsException extends Exception {
	private double amount;
	
	public NoSufficientFundsException( double amount) {
		super(String.format("Insufficient Funds: $%.2f", amount));
		this.amount = amount;
	}
	
	public double getAmount() {
		return amount;
	}
}
