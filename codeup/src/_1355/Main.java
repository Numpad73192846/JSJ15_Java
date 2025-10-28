package _1355;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = 0;
		
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				if(i >= 1 && k == 0 ) {
					for (; k < i; k++) {
						System.out.print(" ");
					}
				}
				System.out.print("*");
			}
			k = 0;
			System.out.println();
		}
		
		sc.close();
	}
}
