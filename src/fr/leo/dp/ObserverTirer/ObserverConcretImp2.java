package fr.leo.dp.ObserverTirer;

public class ObserverConcretImp2 implements Observer {

	@Override
	public void update(Observable o) {
		int etat = ((ObservableConcret) o).getEtat();
		System.out.println("Resultat: " + etat *7);
	}
}
