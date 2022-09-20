package Singleton;

public class Single {
	private static Single instance;

	public Single() {
		// Não faz nada
	}

	public static Single getInstance() {
		if (instance == null) {
			instance = new Single();
		}
		return instance;
	}

}
