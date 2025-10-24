package day05.Ex06_Static;

public class StaticMember {

	// static 변수
	static int a;
	static int b;
	// 인스턴스 변수
	int c;
	// static 상수
	static final double PI = 3.141592;
	
	// static 메소드
	public static int sum(int x, int y) {
		int sum = a + b + x + y;
		
		// static 레퍼런스에 static 필드에 없는 값은 만들 수 없어
		// sum += c;
		// c는 static 변수가 나이고 인스턴스 변수이기 때문에
		// 객체 생성 시 메모리가 할당되므로
		// static 메소드가 할당되는 시점에서는 접근할 수 없다.
		// 그래서 static 메소드에서는 인스턴스 멤보는 접근할 수 없다.
		
		return sum;
	}
	
	public static void main(String[] args) {
		// * static 메소드는 객체 생성없이 호출 가능
		int sum = sum(10, 20);
		// 다른 클래스에서 호출하는 경우
		StaticMember.sum(100, 200);
		
		a = 100;
		
		// 인스턴스 생성
		StaticMember s1 = new StaticMember();
		StaticMember s2 = new StaticMember();
		
		// StaticMember.a로 접근하는게 좋아
		int a1 = s1.a;
		int c1 = s1.c = 10;
		int a2 = s2.a;
		int c2 = s2.c = 20;
		
		// final 상소로 지정하는 키워드
		// : 한 번 값을 초기화한 후에는 변경할 수 없다.
		// PI = 100;
		
		System.out.println("a1 : " + a1);			// 100
		System.out.println("c1 : " + c1);			// 10
		System.out.println("a2 : " + a2);			// 100
		System.out.println("c2 : " + c2);			// 20
		
	}
}
