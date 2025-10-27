package day06.review;

public class Ex02_369게임 {

	public static void main(String[] args) {
		// 정수 1~100까지 수를 반복하여 출력하면서,
		// 해당 수가 3또는 6또는 9가 될 때는
		// 자리수마다 369가 되는 개수만큼 정수 대신
		// "*"을 출력하는 프로그램을 작성하시오.
		// ex)
		// 13 : *
		// 66 : **
		// 순서도
		// 1. 정수 1~100까지 반복
		// 2. 입력된 정수에 3, 6, 9가 몇개 들어갔는지 판단 
		// 		2-1) 십의 자리수가 3, 6, 9인지 판단
		// 		2-2) 일의 자리수가 3, 6, 9인지 판단
		// 3. 3 ,6 ,9가 들어갔다면 들어간 개수 만큼 *을 출력
		
		for (int i = 1; i <= 100; i++) {
			// 십의 자리수 : i / 10  
			// 일의 자리수 : i % 10
			int ten = i / 10;
			int one = i % 10;
			
			boolean ten369 = (ten == 3 || ten == 6 || ten == 9);
			boolean one369 = (one == 3 || one == 6 || one == 9);
			
//			if( ten % 3 == 0 && one % 3 == 0 ) {	ten -> 일의 자리수가 나오면 0으로 출력 -> else if문에서 앞의 조건인 ten % 3 == 0이라는 조건을 충족 -> *을 출력
//				System.out.println("**");
//			}
//			else if ( ten % 3 == 0 || one % 3 == 0 ) {
//				System.out.println("*");
//			}
//			else {
//				System.out.println(i);
//			}
			if( ten369 && one369 ) {
				System.out.println("**");
			}
			else if ( ten369 || one369 ) {
				System.out.println("*");
			}
			else {
				System.out.println(i);
			}
		}
	}
}
