package _1157;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n = sc.nextDouble();
		
		if ( n >= 50 && n <= 60 ) {
			System.out.println("win");
		}
		else {
			System.out.println("lose");
		}
		
		sc.close();
	}
	
}
