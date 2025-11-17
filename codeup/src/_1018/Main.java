package _1018;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		
		String arr[] = n.split(":");
		
		String h = arr[0];
		String m = arr[1];
		
		System.out.println(h + ":" + m);
		
		sc.close();
	}
	
}
