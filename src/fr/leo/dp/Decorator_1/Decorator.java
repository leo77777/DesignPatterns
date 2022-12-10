package fr.leo.dp.Decorator_1;

public abstract class Decorator extends GraphicalComponent {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected GraphicalComponent next;

	public Decorator(GraphicalComponent next) {
		this.next = next;
	}
}
