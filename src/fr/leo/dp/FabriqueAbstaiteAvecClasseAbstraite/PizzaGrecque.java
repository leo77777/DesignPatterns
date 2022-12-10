package fr.leo.dp.FabriqueAbstaiteAvecClasseAbstraite;

public class PizzaGrecque extends Pizza {

	public PizzaGrecque(FabriqueIngredients fabrique) {
		nom = "pizza Grecque";
		this.fabrique = fabrique;
		fabrique.creerIngredients();
		this.pate = fabrique.pate;
		this.sauce = fabrique.sauce;
		this.garniture = fabrique.garniture;
	}

}
