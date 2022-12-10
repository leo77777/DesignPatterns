package fr.leo.dp.Command_2;

public class ChargeurDeTelecommande {

	public static void main(String[] args) {
		Telecommande telecommande = new Telecommande();

		Lampe lampeDeSejour = new Lampe("Séjour");
		Lampe lampeCuisine = new Lampe("Cuisine");
		// PorteGarage porteGarage = new PorteGarage();
		Stereo stereo = new Stereo("Séjour");

		System.out.println("Annuler: ");
		telecommande.annuler();
		CommandeAllumerLampe lampeSejourAllume = new CommandeAllumerLampe(lampeDeSejour);
		CommandeEteindreLampe lampeSejourEteindre = new CommandeEteindreLampe(lampeDeSejour);
		CommandeAllumerLampe lampeCuisineAllume = new CommandeAllumerLampe(lampeCuisine);
		CommandeEteindreLampe lampeCuisineEteindre = new CommandeEteindreLampe(lampeCuisine);
		// CommandeOuvrirPorteGarage porteGarageOuverte = new
		// CommandeOuvrirPorteGarage(porteGarage);
		CommandeAllumerStereoAvecCd stereoAvecCd = new CommandeAllumerStereoAvecCd(stereo);
		CommandeEteindreStereoAvecCd stereoEteinte = new CommandeEteindreStereoAvecCd(stereo);

		telecommande.setCommande(0, lampeSejourAllume, lampeSejourEteindre);
		telecommande.setCommande(1, lampeCuisineAllume, lampeCuisineEteindre);
		telecommande.setCommande(3, stereoAvecCd, stereoEteinte);

		// System.out.println(telecommande);

		telecommande.boutonMarchePresse(0);
		telecommande.boutonMarcheArret(0);
		telecommande.boutonMarchePresse(1);
		telecommande.boutonMarcheArret(1);
		System.out.println("");
		telecommande.boutonMarchePresse(3);
		telecommande.boutonMarcheArret(3);
		System.out.println("");
		// telecommande.boutonMarchePresse(2);
		// telecommande.boutonMarcheArret(2);
		System.out.println("Annuler: ");
		telecommande.annuler();

		System.out.println("");
		System.out.println(telecommande);

		System.out.println("");

		CommandeOuvrirPorteGarage copg1 = new CommandeOuvrirPorteGarage(new PorteGarage());

		// Telecommande teleCommande = new Telecommande();
		Ventilateur ventilateur = new Ventilateur("Séjour");
		CommandeVentilateurRapide ventilRapide = new CommandeVentilateurRapide(ventilateur);

		Commande[] listCommandes = { stereoAvecCd, copg1, lampeSejourAllume, ventilRapide };

		CommandeAllumerGroupe cg1 = new CommandeAllumerGroupe(listCommandes);
		cg1.executer();

		System.out.println("");
		cg1.annuler();

		System.out.println("");
		System.out.println("nouvelle touche telecommande");
		telecommande.setCommande(5, cg1, cg1);
		telecommande.boutonMarchePresse(5);
	}

}
