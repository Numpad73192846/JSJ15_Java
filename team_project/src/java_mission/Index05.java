package java_mission;

import java.util.Scanner;

public class Index05 {
	
	static void PrintLine(int n) {
		String ck1 = "'황금올리브 반반한 치킨'";
		String ck2 = "'뿌잉클 치킨'";
		String ck3 = "'처갓집에서 호식이가 만든 치킨'";
		if( n == 1 ) {
			System.out.println();
			System.out.println(ck1 + "이(/가) 주문되었습니다.");
			System.out.println();
		}
		if( n == 2 ) {
			System.out.println();
			System.out.println(ck2 + "이(/가) 주문되었습니다.");
			System.out.println();
		}
		if( n == 3 ) {
			System.out.println();
			System.out.println(ck3 + "이(/가) 주문되었습니다.");
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n;
		int count = 0;
		
		do {
			System.out.println("********** 치킨 메뉴판 **********");
			System.out.println("1. 황금올리브 반반한 치킨");
			System.out.println("2. 뿌잉클 치킨");
			System.out.println("3. 처갓집에서 호식이가 만든 치킨");
			System.out.println("0. 종료");
			System.out.print("********** 번호 : ");
			n = sc.nextInt();
			
			if( n == 0 ) {
				System.out.println();
				System.out.println("총 " + count + " 개의 상품이 주문되었습니다.");
				break;
			}
			
			switch (n) {
			case 0:
				break;
			case 1:
				Index05.PrintLine(n);
				break;
			case 2:
				Index05.PrintLine(n);
				break;
			case 3:
				Index05.PrintLine(n);
				break;
			default:
				System.out.println();
				System.out.println("(0~3) 사이의 번호를 입력해주세요.");
				System.out.println();
				break;
			}
			
			if( n <= 3 ) {
				count++;
			}
			
		} while ( n != 0 );
		sc.close();
		
	}
}
