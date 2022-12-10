package fr.leo.dp.Observer_2;

public class Driver {

	public static void main(String[] args) {
		MonObservable monObservable = new MonObservable();
		Observer1 observeur1  = new Observer1();
		Observer2 observeur2  = new Observer2();
		Observer3 observeur3  = new Observer3();
		
		
		monObservable.addObserver(observeur1);
		monObservable.addObserver(observeur2);
		monObservable.addObserver(observeur3);
		
		monObservable.setEtat(10);
		monObservable.setEtat(12);
		monObservable.setEtat(40);
	}
}
