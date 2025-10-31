package java_mission;

import java.util.Scanner;

public class Index04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 1;
		int count2 = 1;
		boolean sw = true;
		
		for (int i = 0; i < n; i++) {
			if(sw == true) {
				for (int j = 0; j < n - count2; j++) {
					System.out.print(" ");
				}
				count2++;
				for (int j = 0; j < count; j++) {
					System.out.print("*");
				}
				
			}
			else if(sw == false) {
				i--;
				count++;
				sw = !sw;
				continue;
			}
			count++;
			sw = !sw;
			System.out.println();
		}
		sc.close();
	}
}
