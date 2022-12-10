package fr.leo.dp.AdapterBis;

public class StandardImpl1 implements fr.leo.dp.AdapterBis.Standard {

	@Override
	public void operation(int nb1, int nb2) {
		System.out.println("Standard: Résultat = "  + nb1*nb2);
	}
}
