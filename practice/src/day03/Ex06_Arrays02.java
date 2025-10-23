package day03;

import java.util.Scanner;

public class Ex06_Arrays02 {

	public static void main(String[] args) {
		
		int arr [][] = new int [3][];
		arr[0] = new int[2];
		arr[1] = new int[4];
		arr[2] = new int[3];
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		for (int[] a : arr) {
			for (int b : a ) {
				System.out.print(b + " ");
				
			}
			System.out.println();
		}
		int three[][][] = { { {1,2}, {3,4} }, { {5,6}, {7,8} }, { {9,10}, {11,12} } };
		
		for (int[][] two : three) {
			for (int [] one : two ) {
				for (int nem : one) {
					System.out.print(nem + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
		sc.close();
	}
}
