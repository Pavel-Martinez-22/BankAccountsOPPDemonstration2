/*
Brief Description:  This file contains the IllegalAmountException class created in order to catch runtime errors.
 */

public class IllegalAmountException extends Exception {
	
	private double amount;
	
	public IllegalAmountException( double amount) {
		super(String.format("Invalid amount: $%.2f", amount));
		this.amount = amount;
	}
	
	public double getAmount() {
		return amount;
	}
	
	
}