package StrategyPayment;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Você precisa pagar R$ 25,00");
		System.out.println("Selecione um entre as opções:");
		System.out.println("1 - MasterCard");
		System.out.println("2 - VisaCard");
		System.out.println("3 - Paypal");
		
		int code = scanner.nextInt();
		
		PayManager payManager = null;
		
		switch (code) {
		case 1:
			payManager = new PayManager(new MasterCard());
			break;
		case 2:
			payManager = new PayManager(new VisaCard());
			break;
		case 3:
			payManager = new PayManager(new PayPal());
			break;
		default:
			System.out.println("Nenhuma forma de pagamento foi informada.");
			break;
		}
		
		if (payManager != null){			
			payManager.doPay(25);
		}
		scanner.close();
	}
}
