package example_gpt.Index02;

import java.util.Scanner;

// ※GPT가 본 이 문제의 핵심
// 입력 받은 N의 마지막 홀수/짝수를 구하는 것
// 입력 받은 N이 홀수이든 짝수이든 작동하는 식을 만들기 위함
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        // TODO: 홀수 식과 합
        // 예: 1+3+5+7+9=25
        String oddExpr = "";
        int oddSum = 0;

        // TODO: 짝수 식과 합
        String evenExpr = "";
        int evenSum = 0;
        
        // N의 마지막 홀수/짝수를 구하는 식 ※삼항 연산자를 사용
        // 삼항 연산자 (조건) ? A : B;
        // : 조건이 참이면 A 거짓이면 B를 반환
        int lastOdd = (N % 2 == 0) ? N - 1 : N;		// 마지막 홀수를 구하는 규칙
        int lastEven = (N % 2 == 0) ? N : N - 1;	// 마지막 짝수를 구하는 규칙

        // TODO: 반복문 1~N 돌면서 홀수/짝수 구분해서 식 만들고 합 구하기
        for (int i = 1; i <= N; i++) {
			if( i % 2 != 0 ) {
				oddExpr += Integer.toString(i);
				oddSum += i;
				if (i == lastOdd) {
				    oddExpr += "=" + oddSum;
				}
				else {
				    oddExpr += "+";
				}
			}
			else {
				evenExpr += Integer.toString(i);
				evenSum += i;
				if (i == lastEven) {
				    evenExpr += "=" + evenSum;
				} else {
				    evenExpr += "+";
				}
			}
		}
        
        // TODO: 식 출력
        System.out.println(oddExpr);
        System.out.println(evenExpr);

        // TODO: 약수 출력 (1 2 5 10)
        for (int i = 1; i <= N; i++) {
			if( N % i == 0 ) {
				System.out.print(i + " ");
			}
		}

        sc.close();
    }
}

