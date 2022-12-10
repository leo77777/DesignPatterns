package fr.leo.dp.Singleton_2;

public class Driver {

	public static void main(String[] args) {
		Satellite s1 = Satellite.getSatellite();
		Satellite s2 = Satellite.getSatellite();
		Satellite s3 = Satellite.getSatellite();

		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());

		System.out.println("");
		for (int i = 0; i < 3; i++)
			System.out.println(Satellite.getSatellite().hashCode());

		System.out.println(" ");

		Test t1 = new Test();
		Test t2 = new Test();
		Test t3 = new Test();

		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());
		System.out.println(t3.hashCode());

		System.out.println("");
		for (int i = 0; i < 3; i++)
			System.out.println(new Test().hashCode());

		System.out.println("");
		MultiThreads mt1 = new MultiThreads();
		mt1.start();

		System.out.println("");
		MultiThreads mt2 = new MultiThreads();
		mt2.start();

		System.out.println("");
		MultiThreads mt3 = new MultiThreads();
		mt3.start();
	}

}
