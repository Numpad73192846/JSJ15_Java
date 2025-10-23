package _1253;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 입력 : 3 8 or 8 3
		// 변수 : a, b, temp
		// 조건 : 
		// 		1) a < b
		//	  	2) a > b
		// 반복 : a~b사이 만큼 반복
		// 출력 : 3 4 5 6 7 8
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int temp = Integer.MIN_VALUE;
		
//		if ( a < b ) {			
//			while ( a <= b ) {
//				System.out.print(a + " ");
//				a++;
//			}
//		}
//		else if ( a > b ) {
//			while ( b <= a ) {
//				System.out.print( b + " ");
//				b++;
//			}
//		}
		if ( a > b ) {
			temp = a;
			a = b;
			b = temp;
		}
		for (int i = a; i <= b; i++) {
			System.out.print(a + " ");
			a++;
		}
		
		sc.close();		
	}
}
