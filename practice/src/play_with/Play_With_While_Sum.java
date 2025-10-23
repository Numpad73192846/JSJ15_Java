package play_with;

import java.util.Scanner;

public class Play_With_While_Sum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("a~b까지 합을 계산하는 계산기");
		System.out.print("시작 숫자 : ");
		int a = sc.nextInt();
		System.out.print("종료 숫자 : ");
		int b = sc.nextInt();
		int sum = 0;
		
		while( a <= b) {
			sum += a++;
		}
		System.out.println("결과 : " + sum);
		sc.close();
	}
}
