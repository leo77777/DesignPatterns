package fr.leo.dp.Command_2;

public class CommandeVentilateurLent extends CommandeVentilateur {

	public CommandeVentilateurLent(Ventilateur ventilateur) {
		super(ventilateur);
	}

	@Override
	public void executer() {
		derniereVitesse = ventilateur.getVitesse();
		ventilateur.lent();
	}

}
