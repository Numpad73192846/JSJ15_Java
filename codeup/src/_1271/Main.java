package _1271;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// * 최댓값
		// 입력 : 5
		//		 1 2 3 4 5
		// 변수 : n, input, max
		// 조건 : 입력받은 값이랑 최댓값을 저장할 변수랑 비교 조건
		// 		 (input > max) : max = input
		// 반복 : N번만큼 반복하면서 입력
		// 출력 : 최댓값 -> max
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int max = 0;
		
		for (int i = 0; i < n; i++) {
			int input = sc.nextInt();
			if (input > max) max = input;
		}
		System.out.println(max);
		sc.close();
	}	
}
