package fr.leo.dp.Command_2;

public class Stereo {

	String sejour;

	protected Stereo(String sejour) {
		super();
		this.sejour = sejour;
	}

	public void marche() {
		System.out.println("Stereo en marche");
	}

	public void arret() {
		System.out.println("Stereo à l'arret");
	}

	public void setCd() {
		System.out.println("setCd en route");
	}

	public void setDvd() {
		System.out.println("setDvd en route");
	}

	public void setRadio() {
		System.out.println("setRadio en route");
	}

	public void setVolume() {
		System.out.println("Volume modifié ");
	}

}
