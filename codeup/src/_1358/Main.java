package _1358;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		int count2 = 0;
		boolean sw = true;		// 홀수 열 판단을 위해 선언
		for (int i = 0; i < n; i++) {
			if ( sw == true ) {
				for (int j = 0; j <= i; j++) {
					if( count2 == 0 ) {
						for (int k = 0; k < (n / 2) - count; k++) {
							System.out.print(" ");
						}
						count2++;
					}
					System.out.print("*");
				}
				count++;
				if( i < n - 1 )System.out.println();
			}
			count2 = 0;
			sw = !sw;
		}
		sc.close();
	}
}