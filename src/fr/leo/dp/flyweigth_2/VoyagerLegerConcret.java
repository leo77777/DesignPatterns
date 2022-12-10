package fr.leo.dp.flyweigth_2;

public class VoyagerLegerConcret implements VoyagerLeger {

	private String valeur;

	public VoyagerLegerConcret(String valeur) {
		this.valeur = valeur;
	}

	@Override
	public void aficher(String context) {
		System.out.println("Voyager leger avec la valeur " + valeur + ", context " + context);
	}
}
