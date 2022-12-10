package fr.leo.dp.ObserverExo;

public class AfichageConditionsActuelle implements Observer {

	@Override
	public void update(float t, float h, float p) {
		System.out.println("---------------------");
		System.out.println("Afichage Conditions Actuelles");
		System.out.println("Temp=" + t);
		System.out.println("Pression=" + p);
		System.out.println("Humidité=" + h);
	}
}
