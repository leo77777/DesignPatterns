package fr.leo.dp.FabriqueSimple_2;

public abstract class Pizza {
	String nom;

	public void preparer() {
		System.out.println("preparation pizza " + this.nom);
	}

	public void cuire() {
		System.out.println("cuisson pizza " + this.nom);
	}

	public void couper() {
		System.out.println("couper pizza " + this.nom);
	}

	public void emballer() {
		System.out.println("emballer pizza " + this.nom);
	}

}
