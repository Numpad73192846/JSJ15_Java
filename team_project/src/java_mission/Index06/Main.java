package java_mission.Index06;

import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		int n, temp;
		int lotto[] = new int[6];
		
		System.out.print("몇 게임? ");
		n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.print("[" + (i + 1) + "게임] : ");
			
			for (int j = 0; j < lotto.length; j++) {
				lotto[j] = random.nextInt(45) + 1;
				for (int k = 0; k <= j; k++) {
					if ( lotto[j] == lotto[k] ) {
						lotto[j] = random.nextInt(45) + 1;
						break;
					}
				}
			}
			
			for (int j = 0; j < lotto.length-1; j++) {
				for (int k = 0; k < lotto.length-1; k++) {
					if ( lotto[k] > lotto[k+1] ) {
						temp = lotto[k];
						lotto[k] = lotto[k+1];
						lotto[k+1] = temp;
					}
				}
			}
			
			for (int j = 0; j < lotto.length; j++) {
				System.out.print(lotto[j] + " ");
			}
			System.out.println();
		}
		sc.close();
	}
}
