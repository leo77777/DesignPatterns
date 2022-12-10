package fr.leo.dp.Singleton_2;

public class MultiThreads extends Thread {

	private static boolean yes = true;

	@Override
	public void run() {

		if (yes) {
			yes = false;

			try {
				Thread.currentThread();
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		Satellite s1 = Satellite.getSatellite();
		System.out.println("Dans le Thread: " + s1.hashCode());
	}

}
