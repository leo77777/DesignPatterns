package fr.leo.dp.Stategie_1;
public class Driver {
	public static void main(String[] args) {
		Canard c = new Colvert();
		c.nager();
		c.aficher();
		//c.setComportementVol(new VolerAvecDesAiles());
		c.effectuerVol();
		c.effectuerCancan();
		//c.setComportementVol(new NePasVoler());
		//c.effectuerVol();
		
		System.out.println("");
		Canard c2 = new Cigogne();
		c2.nager();
		c2.aficher();
		c2.effectuerVol();
		c2.effectuerCancan();
		
		System.out.println("");
		Canard c3 = new CanardEnPlastique();
		c3.nager();
		c3.aficher();
		c3.effectuerCancan();
		c3.effectuerVol();
	}
}
