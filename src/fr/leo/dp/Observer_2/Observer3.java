package fr.leo.dp.Observer_2;

import java.util.Observable;
import java.util.Observer;

public class Observer3 implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		System.out.println("Voici la nouvelle valeur annoncée par Observeur3: " + ((MonObservable)o).getEtat() );
	}
}
