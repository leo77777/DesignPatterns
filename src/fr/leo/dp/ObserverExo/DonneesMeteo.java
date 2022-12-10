package fr.leo.dp.ObserverExo;

import java.util.ArrayList;
import java.util.List;

public class DonneesMeteo implements Observable{
	
	private float pression, temperature, humidite;	
	private List<Observer> observers = new ArrayList<>();

	@Override
	public void addObserver(Observer o) {
		observers.add(o);		
	}

	@Override
	public void removeObserver(Observer o) {
		observers.remove(o);		
	}

	@Override
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(temperature, humidite, pression);
		}		
	}

	public void setMesure(float p, float  h, float t){
		this.temperature = t;
		this.humidite =h;
		this.pression = p;
		notifyObservers();
	}
}
