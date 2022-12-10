package fr.leo.dp.Stategie_1;

public class CanardEnPlastique extends Canard {
	
	public CanardEnPlastique() {
		this.setComportementVol(new NePasVoler());
		this.setComportementCancan( new NePasCancaner());
	}

	@Override
	public void aficher() {
		System.out.println("Je suis un canard en plastique");
	}
}
