package Factory;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Selecione uma nave:");
		System.out.println("1 para Banshee");
		System.out.println("2 para A380");
		System.out.println("3 para B747");
		
		int type = scanner.nextInt();
		
		Fly fly = FlyFactory.create(type);
		fly.shoot();		
		
		scanner.close();

	}

}
