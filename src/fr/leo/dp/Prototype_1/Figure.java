package fr.leo.dp.Prototype_1;
public abstract class Figure implements Cloneable{	
	protected Point p1;
	protected Point p2;
	
	protected Figure(Point p1, Point p2) {
		super();
		this.p1 = p1;
		this.p2 = p2;
	}
	
	@Override
	protected Figure clone() throws CloneNotSupportedException {
		Figure f = (Figure) super.clone();
		f.p1 = (Point) p1.clone();
		f.p2 = (Point) p2.clone();
		return f;
	}
	
	public abstract double surface();
	
	@Override
	public String toString() {
		return super.toString() + "\n" + "p1=" + p1 + ", p2=" +p2;
		
	}
}
