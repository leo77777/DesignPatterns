package fr.leo.dp.Proxy_2;
public class Driver {

	public static void main(String[] args) {
		Proxy p = new Proxy();
		System.out.println(p.calcul());

		System.out.println("");
		MetierImplementation m1 = new MetierImplementation();
		m1.calcul();
		System.out.println(m1.calcul());
	}
}
