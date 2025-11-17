package _1026;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String n = sc.nextLine();
		
		String arr[] = n.split(":");
		
		String h = arr[0];
		String m = arr[1];
		String s = arr[2];
		
		int mM;
		
		mM = Integer.valueOf(m);

		System.out.println(mM);
		
		sc.close();
	}
	
}
