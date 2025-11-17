package _1025;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		
		String arr[] = n.split("");
		
		
		while(arr[0].length() < 5) {
			arr[0] = arr[0] + "0";
		}
		while(arr[1].length() < 4) {
			arr[1] = arr[1] + "0";
		}
		while(arr[2].length() < 3) {
			arr[2] = arr[2] + "0";
		}
		while(arr[3].length() < 2) {
			arr[3] = arr[3] + "0";
		}
		
		String num1 = arr[0];
		String num2 = arr[1];
		String num3 = arr[2];
		String num4 = arr[3];
		String num5 = arr[4];
		
		System.out.println("[" + num1 + "]");
		System.out.println("[" + num2 + "]");
		System.out.println("[" + num3 + "]");
		System.out.println("[" + num4 + "]");
		System.out.println("[" + num5 + "]");
		sc.close();
	}
	
}
