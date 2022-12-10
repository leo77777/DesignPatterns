package fr.leo.dp.Proxy_2;

public class Proxy implements IMetier {

	// On peut faire comme ci dessous (créer une instance de "metier"),
	// mais il vaut mieux créer une instance de "metier"
	// uniquement quand on passe dans la méthode calcul()
	// => private MetierImplementation metier = new MetierImplementation();

	private MetierImplementation metier;

	@Override
	public double calcul() {

		// Il vaut mieux faire comme ci dessous,
		// car ainsi on créé une instance de la classe "MetierImplementation"
		// uniquement si on appelle cette méthode !
		if (metier == null)
			metier = new MetierImplementation();
		
		System.out.println("Avant on ouvre une transaction ...");
		double res;
		try {
			res = metier.calcul();
			System.out.println("calcul réussit, je valide la transaction");
		} catch (Exception e) {
			System.out.println("calcul raté, rollback");
			throw e;
		}
		return res;
	}
}
