package java_mission;

public class Index03 {
	public static void main(String[] args) {
		
		int ten;
		int one;
		boolean tenT; 
		boolean oneT;
		
		for (int i = 1; i <= 100; i++) {
			ten = i / 10;	// 정수로 값을 받으니 10나눠도 소수점이 날라간다
			one = i % 10;	// 십의 자리 날리기
			tenT = ( ten == 3 || ten == 6 || ten == 9 );
			oneT = ( one == 3 || one == 6 || one == 9 );

			if( tenT && oneT ) {
				System.out.println("**");
			}
			else if( tenT || oneT ) {
				System.out.println("*");
			}
			else System.out.println( i );
		}
	}
}
