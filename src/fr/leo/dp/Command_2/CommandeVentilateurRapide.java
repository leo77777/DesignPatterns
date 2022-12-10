package fr.leo.dp.Command_2;

public class CommandeVentilateurRapide extends CommandeVentilateur {

	public CommandeVentilateurRapide(Ventilateur ventilateur) {
		super(ventilateur);
	}

	@Override
	public void executer() {
		derniereVitesse = ventilateur.getVitesse();
		ventilateur.rapide();
	}
}
