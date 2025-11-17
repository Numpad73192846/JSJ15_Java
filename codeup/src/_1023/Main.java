package _1023;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		String arr[] = n.split("\\.");
		
		String i = arr[0];
		String d = arr[1];
		
		System.out.println(i + "\n" + d);
		sc.close();
	}
	
}
