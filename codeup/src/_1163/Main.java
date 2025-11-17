package _1163;

import java.io.PrintStream;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		
		System.setOut(new PrintStream(System.out, true, "UTF-8"));
		
		String temp;
		int n;
		
		Scanner sc = new Scanner(System.in);
		int y = sc.nextInt();
		int m = sc.nextInt();
		int d = sc.nextInt();
		
		int sum = y + m + d;
		
		String arr[] = Integer.toString(sum).split("");
		
		temp = arr[arr.length - 3];
		
		n = Integer.valueOf(temp);
		
		if( n % 2 == 0 ) {
			System.out.println("대박");
		}
		else {
			System.out.println("그럭저럭");
		}
		sc.close();
	}
	
}
