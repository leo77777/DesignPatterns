package fr.leo.dp.FabriqueAbstaiteAvecClasseAbstraite;

public class PizzaFromage extends Pizza {
	public PizzaFromage(FabriqueIngredients fabrique) {
		nom = "pizza fromage";
		this.fabrique = fabrique;
		fabrique.creerIngredients();
		this.pate = fabrique.pate;
		this.sauce = fabrique.sauce;
		this.garniture = fabrique.garniture;
	}

}
