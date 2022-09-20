package StrategyPayment;

public class MasterCard extends Pay {
	@Override
	public void payment(double price) {
		System.out.println("Pagamento de " + price + " usando MasterCard" );		
	}
}
