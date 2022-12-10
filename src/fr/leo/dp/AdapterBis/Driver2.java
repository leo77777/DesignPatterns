package fr.leo.dp.AdapterBis;

public class Driver2 {

	public static void main(String[] args) {
		Standard standard = new StandardImpl1();
		standard.operation(7, 9);
		
		Standard standard2 = new Adaptateur1();
		standard2.operation(7, 9);
		
		Standard standard3 = new Adaptateur2();
		standard3.operation(7, 9);

	}

}
