package _1442;

import java.util.Scanner;

public class Main {
		
	public static void main(String[] args) {
		int temp, min;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int a[] = new int [n];
		
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < a.length - 1; i++) {
			min = i;
			for (int j = i + 1; j < a.length; j++) {
				if ( a[min] > a[j] ) {
					temp = a[min];
				    a[min] = a[j];
				    a[j] = temp;
				}
				else continue;
			}
			temp = a[i];
			a[i] = a[min];
			a[min] = temp;
		}
		for (int i = 0; i < a.length; i++) {
			System.out.printf("%d \n", a[i]);
		}
		sc.close();
		

	}
}