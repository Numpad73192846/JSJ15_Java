package example_gpt.Index10;

public class Rectangle extends Figure implements Rotatable{
	
	double width, height;

	public Rectangle() {
		this(0.0, 0.0);
	}

	public Rectangle(double width, double height) {
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
		return width * height;
	}
	
	@Override
	double getPerimeter() {
		return (width + height) * 2;
	}
	
	@Override
	public void rotate(double angle) {
		System.out.println((int)angle + "도 회전");
	}
	
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}

}
