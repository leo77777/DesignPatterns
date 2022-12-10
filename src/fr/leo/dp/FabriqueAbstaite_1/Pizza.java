package fr.leo.dp.FabriqueAbstaite_1;

import fr.leo.dp.FabriqueAbstaite.garnitures.Garniture;
import fr.leo.dp.FabriqueAbstaite.pate.Pate;
import fr.leo.dp.FabriqueAbstaite.sauce.Sauce;

public abstract class Pizza {
	FabriqueIngredients fabrique;

	String nom;
	Pate pate;
	Sauce sauce;
	Garniture garniture;

	public void preparer() {
		String intitul�NomEtNomFabrique = this.nom + " " + this.fabrique;
		System.out.println("preparation " + intitul�NomEtNomFabrique);
	}

	public void cuire() {
		String intitul�NomEtNomFabrique = this.nom + " " + this.fabrique;
		System.out.println("cuisson " + intitul�NomEtNomFabrique);
	}

	public void couper() {
		String intitul�NomEtNomFabrique = this.nom + " " + this.fabrique;
		System.out.println("couper " + intitul�NomEtNomFabrique);
	}

	public void emballer() {
		String intitul�NomEtNomFabrique = this.nom + " " + this.fabrique;
		System.out.println("emballer " + intitul�NomEtNomFabrique);
	}

	public void poserGarnitures() {
		System.out.println("Listes des ingr�dients: ");
		System.out.println(pate);
		System.out.println(sauce);
		System.out.print("Garnitures :");
		for (String string : garniture.garniture)
			System.out.print(string + " ");
		System.out.println("");
	}

}
