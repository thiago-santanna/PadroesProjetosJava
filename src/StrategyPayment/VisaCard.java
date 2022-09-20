package StrategyPayment;

public class VisaCard extends Pay {
	@Override
	public void payment(double price) {
		System.out.println("Pagamento de " + price + " usando VisaCard" );	
	}
}
