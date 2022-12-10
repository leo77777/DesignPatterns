package fr.leo.dp.Fabrique_2;

public class Main {

	public static void main(String[] args) {
		String[] shapes = { "#rect 1, 2, 100, 200", "#oval 1, 1, 100, 100", "#rect 100, 200, 1, 2",
				"#line 1, 2, 1, 2" };
		Client c = new Client();
		c.readShapes(shapes);
		c.drawAllShapes();
		System.out.println("ok");
	}
}
