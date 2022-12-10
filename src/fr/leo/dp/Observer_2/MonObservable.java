package fr.leo.dp.Observer_2;

public class MonObservable extends java.util.Observable {
	
	private int etat = 0;

	public int getEtat() {
		return etat;
	}

	public void setEtat(int etat) {
		if (Math.abs((this.etat - etat))>3) {
			this.etat = etat;
			this.setChanged();
			notifyObservers();
		}
	}
}
