package _1019;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n =sc.nextLine();
		
		String arr[] = n.split("\\.");
		
		while(arr[0].length() < 4) {
			arr[0] = "0" + arr[0];
		}
		
		String y = arr[0];
		String m = arr[1];
		String d = arr[2];
		
		System.out.print(y + ".");
		if(arr[1].length() == 1) System.out.print("0");
		System.out.print(m+ ".");
		if(arr[2].length() == 1) System.out.print("0");
		System.out.print(d);
		
		sc.close();
	}
	
}
