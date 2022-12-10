package fr.leo.dp.FabriqueAbstaite_1;

public class PizzaPoivron extends Pizza {

	public PizzaPoivron(FabriqueIngredients fabrique) {
		nom = "pizza poivron";
		this.fabrique = fabrique;

		pate = fabrique.creerPate();
		sauce = fabrique.creerSauce();
		garniture = fabrique.creerGarniture();
	}

}
