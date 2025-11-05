package _1443;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n, i, j, temp, key;
		
		try (Scanner sc = new Scanner(System.in)) {
			n = sc.nextInt();
			
			int a[] = new int[n];
			
			for (i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}
			
			for (i = 1; i < n; i++) {
				key = a[i];
				j = i - 1;
				if( a[j] > a[i] ) {
					temp = a[j+1];
					a[j+1] = a[j];
					a[j] = temp;
				}
				else if ( a[j] < a[i] ) {
					a[j+1] = key;
				}
			}
			
			for (i = 0; i < n; i++) {
				System.out.printf("%d\n", a[i]);
			}
			
			sc.close();
		}
	}
	
}
