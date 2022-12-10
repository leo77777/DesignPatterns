package fr.leo.dp.Singleton_3;

public class Singleton {
	
	private int compteur;

	private static final Singleton singleton;

	static{
		singleton = new Singleton();
	}
	

	private Singleton() {
		System.out.println("Instanciation du singleton");
	}
	

	public static Singleton getInstence() {
		return singleton;
	}
	
	public void traiter(String taskName) {
		System.out.println(" ... Traitement de la tache " + taskName);
		for (int i = 1; i <= 5; i++) {
			synchronized (this) {
				++compteur;
			}
			System.out.println(".." + compteur);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Fin du traitement de la tache " + taskName + " Compteur=" + compteur);
	}
}
