package fr.leo.dp.FabriqueAbstaiteAvecClasseAbstraite;

import fr.leo.dp.FabriqueAbstaite.garnitures.Garniture3;
import fr.leo.dp.FabriqueAbstaite.pate.PateFine;
import fr.leo.dp.FabriqueAbstaite.sauce.SauceMoutarde;

public class FabriqueParis extends FabriqueIngredients {

	public FabriqueParis() {
		nomFabrique = "Fabrique de Paris";
	}

	@Override
	public void creerIngredients() {
		this.pate = new PateFine();
		this.sauce = new SauceMoutarde();
		this.garniture = new Garniture3();
	}

}
