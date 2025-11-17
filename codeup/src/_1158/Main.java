package _1158;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n = sc.nextDouble();
		
		if ( (n >= 60 && n <= 70) || (n >= 30 && n <= 40) ) {
			System.out.println("win");
		}
		else {
			System.out.println("lose");
		}
		
		sc.close();
	}
	
}
