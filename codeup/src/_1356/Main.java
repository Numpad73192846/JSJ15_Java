package _1356;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("*");
				if( i > 0 && i < n-1) {
					for (int k = 0; k < n-2; k++) {
						System.out.print(" ");
					}
					j = n-1;
					System.out.print("*");
				}
			}
			System.out.println();
		}
		sc.close();
	}
}
