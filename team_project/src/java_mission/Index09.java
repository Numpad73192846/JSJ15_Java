package java_mission;

import java.util.Scanner;


public class Index09 {
	
	public static String Name(String str) {
		String answer = "";
		String[] name = answer.split(" ");
		return name[0];
	}
	
	public static int Money(String str) {
		String answer = "";
		for (char x : str.toCharArray()) {
			if (Character.isDigit(x)) {
				answer += x;
			}
		}
		return Integer.parseInt(answer);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		System.out.println(Index09.Money(str));
		System.out.println(Index09.Name(str));
		System.out.println("성명 출장비 오만원 만원 오천원 천원 오백원 백원 오십원 십원 오원 일원");
		
		sc.close();
	}

}
