package fr.leo.dp.FabriqueAbstaite_1;

public class PizzaFromage extends Pizza {

	public PizzaFromage(FabriqueIngredients fabrique) {
		nom = "pizza fromage";
		this.fabrique = fabrique;

		pate = fabrique.creerPate();
		sauce = fabrique.creerSauce();
		garniture = fabrique.creerGarniture();
	}

}
