package fr.leo.dp.AdapterBis;

import fr.leo.dp.AdapterBis_2.StandardAAdaptee;

public class Adaptateur2 implements Standard{
	
	private StandardAAdaptee adaptee = new StandardAAdaptee(); 

	@Override
	public void operation(int nb1, int nb2) {
		int resulat = adaptee.operation2(nb1, nb2);
		adaptee.operation3(resulat);				
	}
}
