package fr.leo.dp.Command_5;

public class Driver {

	public static void main(String[] args) {
		Recepteur1 r1 = new Recepteur1();
		Recepteur1 r3 = new Recepteur1();
		Recepteur2 r2 = new Recepteur2();

		Invocateur i1 = new Invocateur();

		i1.add("compter", new Compter(r1));
		i1.add("lire", new Lire(r1));
		i1.add("ecrire", new Ecrire(r1));
		i1.add("danser", new Danser(r2));
		i1.add("lire2", new Lire(r3));

		i1.invoquer("compter");
		i1.invoquer("lire");
		i1.invoquer("ecrire");
		i1.invoquer("danser");
		i1.invoquer("lire2");
	}
}
