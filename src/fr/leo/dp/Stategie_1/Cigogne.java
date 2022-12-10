package fr.leo.dp.Stategie_1;

public class Cigogne extends Canard {

	public Cigogne() {
		this.setComportementVol(new VolerAvecDesAiles());
		this.setComportementCancan( new Coincoin());
	}
	
	@Override
	public void aficher() {
		System.out.println("Je suis une cigogne");
	}
}
