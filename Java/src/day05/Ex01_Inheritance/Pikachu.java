package day05.Ex01_Inheritance;

public class Pikachu {

	// 변수
	public int energe;
	public String type;
	
	// 생성자
	// * 기본 생성자
	public Pikachu() {
//		energe = 100;
//		type = "전기";	
		this(100, "전기");
	}                  
	
	// * 메소드(생성자) 오버로딩
	public Pikachu(int energe) {
		this( energe, "전기");
	}
	
	public Pikachu(int energe, String type) {
		this.energe = energe;
		this.type = type;
	}

	// 메소드
	public String aAttack() {
		return "십만볼트";
	}
	

	public String bAttack() {
		return "전광석화";
	}

	@Override
	public String toString() {
		return "Pikachu [energe=" + energe + ", type=" + type + "]";
	}
	
	
}
