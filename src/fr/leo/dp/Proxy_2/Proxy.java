package fr.leo.dp.Proxy_2;

public class Proxy implements IMetier {

	// On peut faire comme ci dessous (cr�er une instance de "metier"),
	// mais il vaut mieux cr�er une instance de "metier"
	// uniquement quand on passe dans la m�thode calcul()
	// => private MetierImplementation metier = new MetierImplementation();

	private MetierImplementation metier;

	@Override
	public double calcul() {

		// Il vaut mieux faire comme ci dessous,
		// car ainsi on cr�� une instance de la classe "MetierImplementation"
		// uniquement si on appelle cette m�thode !
		if (metier == null)
			metier = new MetierImplementation();
		
		System.out.println("Avant on ouvre une transaction ...");
		double res;
		try {
			res = metier.calcul();
			System.out.println("calcul r�ussit, je valide la transaction");
		} catch (Exception e) {
			System.out.println("calcul rat�, rollback");
			throw e;
		}
		return res;
	}
}
