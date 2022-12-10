package fr.leo.dp.FabriqueAbstaite_1;

import fr.leo.dp.FabriqueAbstaite.garnitures.Garniture;
import fr.leo.dp.FabriqueAbstaite.pate.Pate;
import fr.leo.dp.FabriqueAbstaite.sauce.Sauce;

public interface FabriqueIngredients {

	Pate creerPate();

	Sauce creerSauce();

	Garniture creerGarniture();

}
