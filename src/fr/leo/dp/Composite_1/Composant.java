package fr.leo.dp.Composite_1;

public abstract class Composant {
	protected String nom;	
	protected int niveau;	
	
	public Composant(String nom) {
		this.nom = nom;
	}
	
	public abstract void operation();		
}
