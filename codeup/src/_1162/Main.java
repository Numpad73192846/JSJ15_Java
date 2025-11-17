package _1162;

import java.io.PrintStream;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		
		System.setOut(new PrintStream(System.out, true, "UTF-8"));
		
		Scanner sc = new Scanner(System.in);
		int y = sc.nextInt();
		int m = sc.nextInt();
		int d = sc.nextInt();
		
		int sum = y - m + d;
		
		String arr[] = Integer.toString(sum).split("");
		
		if( arr[arr.length - 1].equals("0")) {
			System.out.println("대박");
		}
		else {
			System.out.println("그럭저럭");
		}
		sc.close();
	}
	
}
