package Factory;

public class FlyFactory {
	public static Fly create(int type) {
		Fly fly = null;
		switch (type) {
		case 1:
			fly = new Banshee();
			break;
		case 2:
			fly = new A380Fly();
			break;
		case 3:
			fly = new B747tFly();
			break;
		default:
			System.out.println("Nenhuma Nave foi informada");
			break;
		}
		return fly;
	}

}
