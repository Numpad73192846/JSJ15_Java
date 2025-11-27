package example_gpt.Index10;

public class Circle extends Figure implements Colorable {

	double radius;

	public Circle() {
		this(0.0);
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return Math.PI * radius * radius;
	}

	@Override
	double getPerimeter() {
		return 2 * Math.PI * radius;
	}
	
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}

	@Override
	public void fillColor(String Color) {
		System.out.println(Color + "으로 채움");
	}

	
}
