package fr.leo.dp.Command_2;

public class Telecommande {
	Commande[] commandesMarche;
	Commande[] commandesArret;
	Commande derniereCommande;

	public Telecommande() {
		commandesMarche = new Commande[7];
		commandesArret = new Commande[7];
		Commande pasDeCommande = new PasDeCommande();
		for (int i = 0; i < 7; i++) {
			commandesMarche[i] = pasDeCommande;
			commandesArret[i] = pasDeCommande;
		}
		derniereCommande = new PasDeCommande();
	}

	public void setCommande(int emp, Commande comMarche, Commande comArret) {
		commandesMarche[emp] = comMarche;
		commandesArret[emp] = comArret;
	}

	public void boutonMarchePresse(int emp) {
		commandesMarche[emp].executer();
		derniereCommande = commandesMarche[emp];
	}

	public void boutonMarcheArret(int emp) {
		commandesArret[emp].executer();
		derniereCommande = commandesArret[emp];
	}

	@Override
	public String toString() {
		StringBuffer stringBuf = new StringBuffer();
		stringBuf.append("\n------Télécommande----------\n");
		for (int i = 0; i < commandesMarche.length; i++)
			stringBuf.append("[emp " + i + "] " + commandesMarche[i].getClass().getName() + " "
					+ commandesArret[i].getClass().getName() + "\n");
		return stringBuf.toString();
	}

	public void annuler() {
		derniereCommande.annuler();
	}
}
