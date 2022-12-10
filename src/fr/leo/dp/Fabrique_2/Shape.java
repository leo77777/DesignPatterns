package fr.leo.dp.Fabrique_2;

public abstract class Shape {

	public static Shape create(String string) {
		if (string.startsWith("#rect"))
			return new Rectangle();
		else if (string.startsWith("#oval"))
			return new Oval();
		else if (string.startsWith("#line"))
			return new Line();
		else
			return null;
	}

	abstract public void draw();

}
