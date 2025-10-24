package _1441;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		int n, temp;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		int a[] = new int[n];
		
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - 1; j++) {
				if (a[j] > a[j+1]) {
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.printf("%d\n", a[i]);
		}
		sc.close();
	}
}
