package fr.leo.dp.Decorator_1;

import java.awt.Color;


public class SrollBarDecorator extends Decorator {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SrollBarDecorator(GraphicalComponent next) {
		super(next);
		System.out.println("voila une belle scrollBar");
		next.setBackground(Color.YELLOW);
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
