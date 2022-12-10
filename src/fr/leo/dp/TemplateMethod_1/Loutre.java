package fr.leo.dp.TemplateMethod_1;

public class Loutre implements Comparable<Loutre> {
	String name;

	protected Loutre(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Loutre o) {
		return this.name.compareTo(o.name);
	}
}
