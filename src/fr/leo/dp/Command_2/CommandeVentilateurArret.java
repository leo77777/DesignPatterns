package fr.leo.dp.Command_2;

public class CommandeVentilateurArret extends CommandeVentilateur {

	public CommandeVentilateurArret(Ventilateur ventilateur) {
		super(ventilateur);
	}

	@Override
	public void executer() {
		derniereVitesse = ventilateur.getVitesse();
		ventilateur.arret();
	}

}
