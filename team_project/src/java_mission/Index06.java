package java_mission;

import java.util.Scanner;

public class Index06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int count = 1;
		int rand;
		int arr[] = new int[6];
		
		System.out.print("몇 게임? ");
		n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			arr[i] = (int)(Math.random() * 45 + 1);
			System.out.println("[" + count + "게임] : " + arr[i]);
		}
		
		
		
		sc.close();
	}
}
