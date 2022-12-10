package fr.leo.dp.ObserverTirer;

import java.util.ArrayList;
import java.util.List;

public class ObservableConcret implements Observable {
	
	private List<Observer> observer = new ArrayList<>();
	private int etat;

	@Override
	public void addObserver(Observer o) {
		observer.add(o);
	}

	@Override
	public void deleteObserver(Observer o) {
		observer.remove(0);
	}

	@Override
	public void notifyObservers() {
		for (Observer o : observer) {
			// Dans cette implémentation, on envoit l'objet 'ObservableConcret'
			// et on laisse à 'ObserverConcret', le soin de faire ce qu'il a à faire
			o.update(this);
		}
	}

	// Permet à l'ObserverConcret de récuperer l'état de l'objet
	public int getEtat() {
		return etat;
	}
	
	// Permet la mise à jour de l'état de l'ObservableConcret
	public void setEtat(int etat) {
		this.etat = etat;
		notifyObservers();
	}
}
