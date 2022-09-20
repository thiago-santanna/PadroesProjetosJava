package StrategyPayment;

public class PayPal extends Pay {
	@Override
	public void payment(double price) {
		System.out.println("Pagamento de " + price + " usando PayPal");
	}

}
