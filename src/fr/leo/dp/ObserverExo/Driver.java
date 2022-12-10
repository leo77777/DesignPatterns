package fr.leo.dp.ObserverExo;

public class Driver {

	public static void main(String[] args) {
		DonneesMeteo dm = new DonneesMeteo();	

		Observer aca = new AfichageConditionsActuelle();
		dm.addObserver(aca);
		
		Observer ap = new AfichagePrevisions();
		dm.addObserver(ap);
		
		System.out.println("");
		dm.setMesure(10, 20, 40);		
		System.out.println("");
		dm.setMesure(10, 20, 50);		
		System.out.println("");
		dm.setMesure(3, 3, 4);
	}
}
