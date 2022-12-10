package fr.leo.dp.Decorator_1;

import java.util.LinkedList;
import java.util.List;

import javax.swing.JTextArea;

public abstract class GraphicalComponent extends JTextArea {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	List<String> lines = new LinkedList<>();

	public abstract void paint();

	public abstract GraphicalComponent addContent(Object l);
}
