package fr.leo.dp.Command_2;

public class TestTelecommande {

	public static void main(String[] args) {
		TelecommandeSimple telecommande = new TelecommandeSimple();

		Lampe lampe = new Lampe("");
		CommandeAllumerLampe lampeAllumee = new CommandeAllumerLampe(lampe);
		telecommande.setCommande(lampeAllumee);
		telecommande.boutonPresse();

		PorteGarage porteGarage = new PorteGarage();
		CommandeOuvrirPorteGarage ouvrirGarage = new CommandeOuvrirPorteGarage(porteGarage);
		telecommande.setCommande(ouvrirGarage);
		telecommande.boutonPresse();
		System.out.println("");
	}

}

