package example_gpt.Index10;

public class FigureTest {
	public static void main(String[] args) {
		Triangle triangle = new Triangle(10, 20);
		Rectangle rectangle = new Rectangle(10, 20);
		Circle circle = new Circle(5);
		
		System.out.print("원 넓이 = " + circle.getArea() + " 둘레 = " + circle.getPerimeter() + " → ");
		circle.fillColor("빨간색");
		System.out.println("사각형 넓이 = " + rectangle.getArea() + " 둘레 = " + rectangle.getPerimeter() + " → ");
		rectangle.rotate(45);
		System.out.println("삼각형 넓이 = " + triangle.getArea() + " 둘레 = " + triangle.getPerimeter());
	}
}
