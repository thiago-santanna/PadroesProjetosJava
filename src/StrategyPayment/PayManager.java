package StrategyPayment;

public class PayManager {
	private Pay pay;

	public PayManager(Pay pay) {
		this.pay = pay;
	}
	
	public void doPay(double price) {
		this.pay.payment(price);
	}

}
