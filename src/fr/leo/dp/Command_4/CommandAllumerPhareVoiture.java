package fr.leo.dp.Command_4;	
public class CommandAllumerPhareVoiture implements Command {
	
	private RecepteurImpl3 recepteur;	

	protected CommandAllumerPhareVoiture(RecepteurImpl3 recepteur) {
		super();
		this.recepteur = recepteur;
	}
	@Override
	public void executer() {
		recepteur.AllumerPhareVoiture();
	}
}
