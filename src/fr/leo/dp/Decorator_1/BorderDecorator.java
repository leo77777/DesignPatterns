package fr.leo.dp.Decorator_1;

import java.awt.Color;

import javax.swing.BorderFactory;

public class BorderDecorator extends Decorator {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BorderDecorator(GraphicalComponent next) {
		super(next);
		System.out.println("bordure ajoutée...");
		next.setBorder(BorderFactory.createLineBorder(Color.CYAN));
	}
	
	@Override
	public void paint() {
		next.paint();
	}

	@Override
	public GraphicalComponent addContent(Object l) {
		next.addContent(l);
		return this;
	}

}
