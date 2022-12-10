package fr.leo.dp.AdapterBis;

import fr.leo.dp.AdapterBis_2.StandardAAdaptee;

public class Adaptateur1 extends StandardAAdaptee implements Standard {

	@Override
	public void operation(int nb1, int nb2) {
		int resulat = operation2(nb1, nb2);
		operation3(resulat);
	}
}
