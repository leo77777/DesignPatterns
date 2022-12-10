package fr.leo.dp.Command_4;	
public class CommandLireFichier implements Command {
	
	private RecepteurImpl3 recepteur;	
	String nomFichier = "";

	protected CommandLireFichier(RecepteurImpl3 recepteur, String nomFichier) {
		super();
		this.recepteur = recepteur;
		this.nomFichier = nomFichier;
	}
	@Override
	public void executer() {
		recepteur.LireUnFichier(nomFichier);
	}
}
