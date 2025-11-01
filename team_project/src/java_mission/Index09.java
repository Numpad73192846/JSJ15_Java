package java_mission;

import java.util.Scanner;

public class Index09 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		
		Index09.input(a);
		System.out.println("성명 출장비 오만원 만원 오천원 천원 오백원 백원 오십원 십원 오원 일원");
		
		sc.close();
	}

	private static void input(String string) {
		System.out.println(string);
	}
}
