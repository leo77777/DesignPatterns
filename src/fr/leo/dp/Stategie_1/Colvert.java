package fr.leo.dp.Stategie_1;

public class Colvert extends Canard {

	public Colvert() {
		this.setComportementVol(new VolerAvecDesAiles());
		this.setComportementCancan( new Cancan());
	}
	
	@Override
	public void aficher() {
		System.out.println("Je suis un colvert");
	}
}
