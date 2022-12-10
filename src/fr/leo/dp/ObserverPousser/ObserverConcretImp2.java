package fr.leo.dp.ObserverPousser;

public class ObserverConcretImp2 implements Observer {

	@Override
	public void update(int etat) {
		System.out.println("Resultat: " + etat *7);
	}
}
