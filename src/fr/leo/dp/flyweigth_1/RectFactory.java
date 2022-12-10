package fr.leo.dp.flyweigth_1;

import java.awt.Color;
import java.util.HashMap;

public class RectFactory {

	private static final HashMap<Color, MyRect> rectsByColor = new HashMap<Color, MyRect>();

	public static MyRect getRect(Color color) {
		MyRect rect = rectsByColor.get(color);
		// Créé un objet seulement si ce n'est pas une couleur dèjà utilisée !
		if (rect == null) {
			rect = new MyRect(color);
			rectsByColor.put(color, rect);
			System.out.println("J'y passe !");
		}
		return rect;
	}
}
