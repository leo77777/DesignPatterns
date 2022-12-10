package fr.leo.dp.flyweigth_2;

public class VoyagerLegerNonPartager implements VoyagerLeger {

	private String valeur1;
	private String valeur2;

	public VoyagerLegerNonPartager(String valeur1, String valeur2) {
		this.valeur1 = valeur1;
		this.valeur2 = valeur2;
	}

	@Override
	public void aficher(String context) {
		System.out.println("Voyager leger avec la valeur1 " + valeur1 + ", valeur2 " + valeur2);
	}
}
