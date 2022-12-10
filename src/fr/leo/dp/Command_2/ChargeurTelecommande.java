package fr.leo.dp.Command_2;

public class ChargeurTelecommande {
	public static void main(String[] args) {
		Telecommande teleCommande = new Telecommande();
		Ventilateur ventilateur = new Ventilateur("Séjour");

		CommandeVentilateurMoyen ventilMoyen = new CommandeVentilateurMoyen(ventilateur);
		CommandeVentilateurRapide ventilRapide = new CommandeVentilateurRapide(ventilateur);
		CommandeVentilateurArret ventilateurEteint = new CommandeVentilateurArret(ventilateur);

		teleCommande.setCommande(0, ventilMoyen, ventilateurEteint);
		teleCommande.setCommande(1, ventilRapide, ventilateurEteint);
		System.out.println(teleCommande);

		System.out.println();
		teleCommande.boutonMarchePresse(0);
		teleCommande.boutonMarcheArret(0);
		teleCommande.annuler();
		teleCommande.boutonMarchePresse(1);
		teleCommande.annuler();
	}
}
