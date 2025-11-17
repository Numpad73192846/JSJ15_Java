package _1154;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum;
		
		if( a < b ) {
			sum = b - a;
			System.out.println(sum);
		}
		else if ( a > b ) {
			sum = a - b;
			System.out.println(sum);
		}
		else {
			sum = a - b;
			System.out.println(sum);
		}
		sc.close();
	}
	
}
