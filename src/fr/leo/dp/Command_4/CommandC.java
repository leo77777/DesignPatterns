package fr.leo.dp.Command_4;	
public class CommandC implements Command {
	
	private RecepteurImpl2 recepteur;	

	protected CommandC(RecepteurImpl2 recepteur) {
		super();
		this.recepteur = recepteur;
	}
	@Override
	public void executer() {
		recepteur.action3();
	}
}
