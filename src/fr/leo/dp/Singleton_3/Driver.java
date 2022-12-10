package fr.leo.dp.Singleton_3;

public class Driver {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			Singleton monSingleton = Singleton.getInstence();
			monSingleton.traiter("T"+i);
		}
	}
}

