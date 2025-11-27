package example_gpt.Index10;

public class Triangle extends Figure {
	
	double width, height;

	public Triangle() {
		this(0.0, 0.0);
	}

	public Triangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	@Override
	public double getArea() {
		return (width * height) / 2;
	}
	
	@Override
	double getPerimeter() {
		return width*3;
	}

	@Override
	public String toString() {
		return "Triangle [width=" + width + ", height=" + height + "]";
	}

}
