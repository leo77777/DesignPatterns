package fr.leo.dp.Decorator_2;

public class DecorateurConcretImp2 extends DecorateurAbstrait {

	public DecorateurConcretImp2(ComposantAbstrait composant) {
		super(composant);
	}

	@Override
	public void operation() {
		System.out.println("Decorateur 2, avant j'ajoute X"); 
		composant.operation();
		System.out.println("Decorateur 2, aprés j'ajoute Y");		
	}
}
