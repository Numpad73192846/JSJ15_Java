package _1155;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if( n % 7 != 0 ) {
			System.out.println("not multiple");
		}
		else if( n % 7 == 0 ) {
			System.out.println("multiple");
		}
		
		sc.close();
	}
	
}
