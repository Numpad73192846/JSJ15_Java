package day02;

public class Ex16_WhileSum {
	public static void main(String[] args) {
		// 1부터 100까지 합계를 구하시오.
		// 1+2+3+...+99+100 = ???
		
		int a = 1;
		int sum = 0;
		
		while( a <= 100) {
			// 방법 1
			// sum += a;
			// a++;
			
			// 방법 2
			// sum = sum + a++;
			
			// 방법 3
			sum += a++;
		}
		
		System.out.println("결과 : "+ sum);
	}
}
