package java_mission.Index02;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int sum1 = 0;
		int sum2 = 0;
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for (int i = 1; i <= N; i++) {
			if( i % 2 == 1) {
				System.out.print( i );
				sum1 += i;
				if( i < N-1 ) {
					System.out.print( "+" );
				}
				else if ( i == N-1 ) System.out.print( "=" + sum1);
			}
		}
		System.out.println();
		for (int i = 1; i <= N; i++) {
			if( i % 2 == 0) {
				System.out.print( i );
				sum2 += i;
				if( i < N-1 ) {
					System.out.print( "+" );
				}
				else if ( i == N ) System.out.print( "=" + sum2);
			}
		}
		System.out.println();
		for (int i = 1; i <= N; i++) {
			if( N % i == 0) {
				System.out.print( i );
				if( i < N-1 ) {
					System.out.print( " " );
				}
			}
		}
		sc.close();
	}
}
