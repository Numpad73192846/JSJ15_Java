package example_gpt.Index10;

public class Pentagon extends Figure implements Colorable{
	double width;
	
	public Pentagon(double width) {
		this.width = width;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}

	@Override
	double getArea() {
		return (5 * Math.pow(width, 2)) / (4 * Math.tan(Math.PI / 5));
	}
	@Override
	double getPerimeter() {
		return 5 * width;
	}
	@Override
	public void fillColor(String Color) {
		System.out.print(Color + "으로 채움");
	}
	
	
}
