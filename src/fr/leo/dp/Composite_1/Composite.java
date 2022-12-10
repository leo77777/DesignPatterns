package fr.leo.dp.Composite_1;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Composant{
	
	public Composite(String nom) {
		super(nom);
	}

	private List<Composant> composants = new ArrayList<Composant>();
	
	@Override
	public void operation() {
		String tab = "";
		for (int i = 0; i < niveau; i++) tab = tab + "----";
		System.out.println(tab + " Composite: " + nom);
		for (Composant composant : composants) {
			composant.operation();
		}
	}
	
	public void	add(Composant comp) {
		comp.niveau = this.niveau + 1;
		composants.add(comp);
	}
	
	public void remove(Composant comp) {
		if ((composants != null) && (!composants.isEmpty())) {
			composants.remove(comp);			
		}
	}

	public List<Composant>	getChilds() {			
		return composants;
	}
}
