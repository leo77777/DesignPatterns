package fr.leo.dp.Prototype_1;
public class Rectangle extends Figure {

	protected Rectangle(Point p1, Point p2) {
		super(p1, p2);
	}

	@Override
	public double surface() {
		int L = p1.x - p2.x;
		int H = p1.y - p2.y;
		
		return L*H;
	}

	@Override
	public String toString() {
		return "Rectangle " + super.toString() ;
	}
}
