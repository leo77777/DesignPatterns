package fr.leo.dp.Command_2;

public class CommandeVentilateurMoyen extends CommandeVentilateur {

	public CommandeVentilateurMoyen(Ventilateur ventilateur) {
		super(ventilateur);
	}

	@Override
	public void executer() {
		derniereVitesse = ventilateur.getVitesse();
		ventilateur.moyen();
	}

}
