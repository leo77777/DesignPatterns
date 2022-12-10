package fr.leo.dp.Command_3;

public class Driver {

	public static void main(String[] args) {

		CommandCalculAdditionner cca = new CommandCalculAdditionner(new Calcul());
		calculer(2, 2, cca);

		CommandCalculMultiplier ccm = new CommandCalculMultiplier(new Calcul());
		calculer(2, 5, ccm);


	}

	public static void calculer(int a, int b, CommandCalcul cca) {
		System.out.println("Voici le r�sultat au carr�: " + cca.executer(a, b));
	}

	public static void calculer2(int a, int b, Calcul c) {
		System.out.println("Voici le r�sultat au carr�: " + c.somme(a, b));
	}
}
