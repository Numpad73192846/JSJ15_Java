package _1501;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = 1;
		int arr [][] = new int [n][n];
		
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + k++ + " ");
			}
			System.out.println();
		}
		sc.close();
		
	}
}