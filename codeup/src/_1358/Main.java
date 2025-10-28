package _1358;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean sw = true; 
		int count = 0;
		int k = 0;
		
		for (int i = 0; i < n; i++) {
			if ( sw == true ) {
				for (int j = 0; j <= i; j++) {
					for (; k < n-count; k++) {
						System.out.print(" ");
					}
					System.out.print("*");
				}
				k = count;
			}
			count++;
			sw = !sw;
			System.out.println();
		}
		sc.close();
	}
}
