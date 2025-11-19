package Ex01;

import java.util.Scanner;

public class Ex01 {
	
	public static void main(String[] args) {
		
		String temp;
		
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		String arr[] = n.split(" ");
		
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if( Integer.valueOf(arr[i]) > Integer.valueOf(arr[j]) ) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if( Integer.valueOf(arr[i]) < Integer.valueOf(arr[j]) ) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		sc.close();
	}

}
