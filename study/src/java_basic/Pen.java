package java_basic;

public class Pen {

	String color;
	int length;
	
	public Pen(String color, int length) {
		this.color = color;
		this.length = length;
	}

	public void write(String text) {
		System.out.println(color + "색 팬이 " + text + "를 쓴다");
	}

	public void printInfo() {
		System.out.println("팬의 색: " + color + ", 팬의 길이: " + length );
	}
	
	public static void main(String[] args) {
		
		Pen redPen = new Pen("red", 15);
		Pen bluePen = new Pen("blue", 20);
		
		redPen.write("바보");
		redPen.printInfo();
		
		bluePen.write("바보");
		bluePen.printInfo();
	}
}
