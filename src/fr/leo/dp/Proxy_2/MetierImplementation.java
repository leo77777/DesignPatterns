package fr.leo.dp.Proxy_2;

public class MetierImplementation implements IMetier {

	@Override
	// @Transcational // cette méthode est transactionelle
	// Derriere Spring va automatiquement générer la classe Proxy
	public double calcul() {
		return 6.4;
	}

}
