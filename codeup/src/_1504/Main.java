package _1504;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = 1;
		int arr [][] = new int [n][n];
		boolean sw = true;
		
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if( sw == true ) {
					arr [j][i] = k++;
				}
				else if (sw == false) {
					arr [n-(j+1)][i] = k++;
				}
			}
			sw = !sw;
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
					System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();
		
	}
}