package day07.Ex12_접근지정자.B;

import day07.Ex12_접근지정자.A.Person;

public class Student extends Person {

	// 생성자
	public Student() {
		super();
	}

	public Student(String name, int age, int height, int wight) {
		super(name, age, height, wight);
	}

	// 메소드
	public void defaultSetting() {
		name = "이름없음";				// public		: 모든 곳에서 접근 가능
		age = 20;						// protected	: 다른 패키지이지만 Person 상속 받아서 접근 가능
		// height = 170;				// default		: 같은 패키지가 아니면 접근 불가
		// weight = 60;					// private		: 선언한 클래스 내에서만 접근 가능
		setHeight(170);
		setWeight(60);
		
	}
	
}
