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
			// Dans cette impl�mentation, on envoit l'objet 'ObservableConcret'
			// et on laisse � 'ObserverConcret', le soin de faire ce qu'il a � faire
			o.update(this);
		}
	}

	// Permet � l'ObserverConcret de r�cuperer l'�tat de l'objet
	public int getEtat() {
		return etat;
	}
	
	// Permet la mise � jour de l'�tat de l'ObservableConcret
	public void setEtat(int etat) {
		this.etat = etat;
		notifyObservers();
	}
}
