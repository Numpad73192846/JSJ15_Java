package _1153;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 입력 : 3 6
		// 변수 : a b
		// 조건 : 
		//		 1) (a > b)		: >
		//		 2) (a < b)		: <
		//		 3) (a == b)	: =
		// 반복 : X
		// 출력 : >, <, =
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		String anwser = "";
		
//		if( a > b ) System.out.println(">");
//		else if( a < b ) System.out.println("<"); 
//		else System.out.println("=");
		
		if( a > b ) anwser = ">";
		else if( a < b ) anwser = "<";
		else anwser = "=";
		System.out.println(anwser);
		
		sc.close();
	}
}
