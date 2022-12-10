package fr.leo.dp.Decorator_1;

public class TextField extends GraphicalComponent {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void paint() {
		// for (String l : lines)
		// this.append(l);
	}

	@Override
	public GraphicalComponent addContent(Object l) {
		assert (l instanceof String);
		this.append((String) l);
		this.lines.add((String) l);
		if (lines.size() == 2) {
			System.out.println("je change de type");
			return new SrollBarDecorator(this);
		}
		return this;
	}
}
