package fr.leo.dp.Proxy_2;

public class MetierImplementation implements IMetier {

	@Override
	// @Transcational // cette m�thode est transactionelle
	// Derriere Spring va automatiquement g�n�rer la classe Proxy
	public double calcul() {
		return 6.4;
	}

}
