package day05.Ex01_Inheritance;

public class Jiwoo {

	public static void main(String[] args) {
		// 객체 생성
		Pikachu pikachu = new Pikachu();
		pikachu.energe = 100;
		pikachu.type = "전기";
		// 출력문에 객체를 출력 시, toString() 메소드가 반환한 문자열이 출력된다.
		System.out.println(pikachu);
		
		System.out.println("::::: 피카츄 :::::");
		System.out.println("에너지 : " + pikachu.energe);
		System.out.println("타입 : " + pikachu.type);
		System.out.println("공격 A : " + pikachu.aAttack());
		System.out.println("공격 B : " + pikachu.bAttack());
		System.out.println();
		
		Pikachu pikachu20 = new Pikachu(150, "진화");
		System.out.println("::::: 피카츄 (Lv.20) :::::");
		System.out.println("에너지 : " + pikachu20.energe);
		System.out.println("타입 : " + pikachu20.type);
		System.out.println("공격 A : " + pikachu20.aAttack());
		System.out.println("공격 B : " + pikachu20.bAttack());
		System.out.println();
		
		Raichu raichu = new Raichu();		
		System.out.println("::::: 라이츄 (Lv.20) :::::");
		System.out.println("에너지 : " + raichu.energe);
		System.out.println("타입 : " + raichu.type);
		System.out.println("공격 A : " + raichu.aAttack());
		System.out.println("공격 B : " + raichu.bAttack());
		System.out.println("공격 C : " + raichu.cAttack());
		System.out.println();
		
		
		
	}
}
