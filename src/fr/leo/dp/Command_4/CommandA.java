package fr.leo.dp.Command_4;	
public class CommandA implements Command {
	
	private RecepteurImpl1 recepteur;	

	protected CommandA(RecepteurImpl1 recepteur) {
		super();
		this.recepteur = recepteur;
	}
	@Override
	public void executer() {
		recepteur.action1();
	}
}
