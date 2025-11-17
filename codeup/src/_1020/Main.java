package _1020;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		
		String arr[] = n.split("-");
		
		String f = arr[0];
		String l = arr[1];
		
		System.out.println(f + l);
		
		sc.close();
	}
	
}
