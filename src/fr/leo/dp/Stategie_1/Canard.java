package fr.leo.dp.Stategie_1;

public abstract class Canard {
	
	private ComportementVol comportementVol;
	private ComportementCancan comportementCancan;
	
	public void nager(){
		System.out.println("Je nage");
	}	
	public abstract void aficher();	
	
	public void effectuerVol(){
		comportementVol.voler();
	}	
	public void effectuerCancan(){
		comportementCancan.cancaner();
	}
	public void setComportementVol(ComportementVol comportementVol) {
		this.comportementVol = comportementVol;
	}
	public void setComportementCancan(ComportementCancan comportementCancan) {
		this.comportementCancan = comportementCancan;
	}
}
