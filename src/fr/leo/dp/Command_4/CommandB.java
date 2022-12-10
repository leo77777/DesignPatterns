package fr.leo.dp.Command_4;	
public class CommandB implements Command {
	
	private RecepteurImpl1 recepteur;	

	protected CommandB(RecepteurImpl1 recepteur) {
		super();
		this.recepteur = recepteur;
	}
	@Override
	public void executer() {
		recepteur.action2();
	}
}
