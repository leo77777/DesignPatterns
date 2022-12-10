package fr.leo.dp.Singleton_3;

public class DriverThreads {
	public static void main(String[] args) {
		
		for (int i = 1; i <= 5; i++) {
			ThreadedTask t = new ThreadedTask("T"+i);
			t.start();
		}
	}

}
