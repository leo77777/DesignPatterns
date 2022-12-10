package fr.leo.dp.Fabrique_2;

import java.util.ArrayList;
import java.util.List;

public class Client {

	private List<Shape> shapes;
	public Client() {
		this.shapes = new ArrayList<Shape>();
	}

	public void drawAllShapes() {
		for (Shape shape : shapes)
			shape.draw();
	}

	public void readShapes(String[] shapes2) {
		for (String string : shapes2)
			this.shapes.add(Shape.create(string));
	}
}
