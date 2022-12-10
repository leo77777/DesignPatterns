package fr.leo.dp.ObserverExo;

public class AfichagePrevisions implements Observer{
	
	private float pression;

	@Override
	public void update(float t, float h, float p) {
		if ((p-pression) > 0)
		{System.out.println("Amélioration en cours");	
		}else if (p-pression <0) {
			System.out.println("Le temps se rafraichit");
		}else {
			System.out.println("Depression bien installée");
		}
		pression = p;
	}
}
