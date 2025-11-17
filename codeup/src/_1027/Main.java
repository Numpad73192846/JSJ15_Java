package _1027;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		
		String arr[] = n.split("\\.");
		
		while(arr[0].length() < 4) {
			arr[0] = "0" + arr[0];
		}
		
		while(arr[1].length() < 2) {
			arr[1] = "0" + arr[2];
		}
		
		while(arr[2].length() < 2) {
			arr[2] = "0" + arr[2];
		}
		
		String y = arr[0];
		String m = arr[1];
		String d = arr[2];
		
		System.out.println(d + "-" + m + "-" + y);
		
		sc.close();
	}
	
}
