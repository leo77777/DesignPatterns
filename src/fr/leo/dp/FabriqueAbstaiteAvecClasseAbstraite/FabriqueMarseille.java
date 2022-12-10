package fr.leo.dp.FabriqueAbstaiteAvecClasseAbstraite;

import fr.leo.dp.FabriqueAbstaite.garnitures.Garniture2;
import fr.leo.dp.FabriqueAbstaite.pate.PateSemoule;
import fr.leo.dp.FabriqueAbstaite.sauce.SauceTomate;

public class FabriqueMarseille extends FabriqueIngredients {

	public FabriqueMarseille() {
		nomFabrique = "Fabrique de Marseille";
	}

	@Override
	public void creerIngredients() {
		this.pate = new PateSemoule();
		this.sauce = new SauceTomate();
		this.garniture = new Garniture2();
	}

}
