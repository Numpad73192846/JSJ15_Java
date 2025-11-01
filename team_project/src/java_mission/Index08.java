package java_mission;

import java.util.Scanner;

public class Index08 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int count = 1;
		boolean sw = true;
		int arr[][] = new int [N][N];
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = count;
				count++;
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if ( sw == true ) {
					System.out.print(arr[i][j] + " ");
				}
				else if ( sw == false ) {
					System.out.print(arr[i][(N-1)-j] + " ");
				}
			}
			sw = !sw;
			System.out.println();
		}
			
		sc.close();
	}
}
