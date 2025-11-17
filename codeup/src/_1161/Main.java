package _1161;

import java.io.PrintStream;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		
		System.setOut(new PrintStream(System.out, true, "UTF-8"));
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if( a % 2 != 0) {
			System.out.print("홀수");
		}
		else if( a % 2 == 0) {
			System.out.print("짝수");
		}
		System.out.print("+");
		if( b % 2 != 0) {
			System.out.print("홀수");
		}
		else if( b % 2 == 0) {
			System.out.print("짝수");
		}
		System.out.print("=");
		if( (a % 2 != 0 && b % 2 != 0) || (a % 2 == 0 && b % 2 == 0)) {
			System.out.print("짝수");
		}
		else if( (a % 2 == 0 && b % 2 != 0) || (a % 2 != 0 && b % 2 == 0)) {
			System.out.print("홀수");
		}
		sc.close();
	}
	
}
