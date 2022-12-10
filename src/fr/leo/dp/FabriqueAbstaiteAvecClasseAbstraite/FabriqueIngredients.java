package fr.leo.dp.FabriqueAbstaiteAvecClasseAbstraite;

import fr.leo.dp.FabriqueAbstaite.garnitures.Garniture;
import fr.leo.dp.FabriqueAbstaite.pate.Pate;
import fr.leo.dp.FabriqueAbstaite.sauce.Sauce;

public abstract class FabriqueIngredients {
	public String nomFabrique;

	public Pate pate;
	public Sauce sauce;
	public Garniture garniture;

	public abstract void creerIngredients();
}
