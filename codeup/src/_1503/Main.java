package _1503;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		int k = 1;
		boolean sw = true;
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int arr [][] = new int [n][n];
		
		
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
			arr [i][j] = k++;
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(sw == true) {
					System.out.print(arr[i][j] + " ");
				}
				else if (sw == false) {
					System.out.print(arr[i][n-(j+1)] + " ");
				}
			}
			sw = !sw;
			System.out.println();
		}
		sc.close();
		
	}
}
