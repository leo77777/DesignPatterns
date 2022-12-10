package fr.leo.dp.ObserverPousser;

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
			o.update( etat);
		}
	}

	public int getEtat() {
		return etat;
	}

	public void setEtat(int etat) {
		this.etat = etat;
		notifyObservers();
	}
}
