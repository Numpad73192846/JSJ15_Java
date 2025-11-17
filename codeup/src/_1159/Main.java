package _1159;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n = sc.nextDouble();
		
		if ( (50 <= n && n <= 70) || n % 6 == 0 ) {
			System.out.println("win");
		}
		else {
			System.out.println("lose");
		}
		
		sc.close();
	}
	
}
