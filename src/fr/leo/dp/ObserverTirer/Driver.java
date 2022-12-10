package fr.leo.dp.ObserverTirer;

public class Driver {

	public static void main(String[] args) {
		
		ObservableConcret sujet = new ObservableConcret();
		ObserverConcretImp1 obs1 = new ObserverConcretImp1();
		ObserverConcretImp2 obs2 = new ObserverConcretImp2();
		
		sujet.addObserver(obs1);
		sujet.addObserver(obs2);
		
		System.out.println("");
		sujet.setEtat(8);
		
		System.out.println("");		
		sujet.setEtat(7);
		sujet.deleteObserver(obs1);
		
		System.out.println("");		
		sujet.setEtat(9);
	}
}
