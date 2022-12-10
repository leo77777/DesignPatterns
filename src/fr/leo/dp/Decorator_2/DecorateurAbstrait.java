package fr.leo.dp.Decorator_2;

public abstract class DecorateurAbstrait implements ComposantAbstrait {	
	protected ComposantAbstrait composant;

	public DecorateurAbstrait(ComposantAbstrait composant) {
		super();
		this.composant = composant;
	}
}
