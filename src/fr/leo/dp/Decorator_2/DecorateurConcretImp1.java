package fr.leo.dp.Decorator_2;

public class DecorateurConcretImp1 extends DecorateurAbstrait {

	public DecorateurConcretImp1(ComposantAbstrait composant) {
		super(composant);
	}

	@Override
	public void operation() {
		System.out.println("Decorateur 1, avant j'ajoute A"); 
		composant.operation();
		System.out.println("Decorateur 1, aprés j'ajoute B");		
	}
}
