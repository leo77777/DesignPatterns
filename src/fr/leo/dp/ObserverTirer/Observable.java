package fr.leo.dp.ObserverTirer;

public interface Observable {
	
	public void addObserver(Observer o);
	public void deleteObserver(Observer o);
	public void notifyObservers();

}
