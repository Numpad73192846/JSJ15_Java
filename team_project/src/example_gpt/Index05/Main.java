package example_gpt.Index05;

import java.util.Scanner;

public class Main {

    // TODO: 메뉴 출력용 static 메소드
    public static void printMenu() {
        System.out.println("********** 치킨 메뉴판 **********");
        System.out.println();
        System.out.println("1. 황금올리브 반반한 치킨");
        System.out.println();
        System.out.println("2. 뿌잉클 치킨");
        System.out.println();
        System.out.println("3. 처갓집에서 호식이가 만든 치킨");
        System.out.println();
        System.out.println("0.    종료");
        System.out.println();
        System.out.print("********** 번호 : ");
        // (주의: 번호 입력 프롬프트 형식은 예시와 비슷하게)
    }

    // TODO: 주문 처리용 static 메소드
    // 이 메소드는 선택한 menuNo에 대해 콘솔에 메시지를 출력하고,
    // 그 호출로 인해 증가한 주문 수(0 또는 1)를 반환하도록 설계하자.
    public static int processOrder(int menuNo) {
        int added = 0;
        // switch(menuNo) { case 1: ...; break; ... default: ... }
        // - case 1..3: 해당 메뉴 문구 출력, added = 1
        // - case 0: (아무것도 하지 않음: 종료 신호)
        // - default: 잘못된 입력 안내 문구 출력
        
        switch (menuNo) {
		case 1: System.out.println("'황금올리브 반반한 치킨'이(/가) 주문되었습니다.");
				added = 1;
				break;
		case 2: System.out.println("'뿌잉클 치킨'이(/가) 주문되었습니다.");
				added = 1;
				break;
		case 3: System.out.println("'처갓집에서 호식이가 만든 치킨'이(/가) 주문되었습니다.");
				added = 1;
				break;
		case 0: break;
		default: System.err.println("메뉴판에 없는 번호입니다.");
			
		}
        return added;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalOrders = 0;
        int input = -1;

        do {
            printMenu();                  // 메뉴판 보여주기
            input = sc.nextInt();         // 사용자 입력

            // TODO: processOrder 호출해서 totalOrders 누적하기
            totalOrders += processOrder(input);
            // (do-while은 input이 0이 될 때까지 반복)
        } while (input != 0);

        // 종료 시 출력 예시: "총 5 개의 상품이 주문되었습니다."
        System.out.println("총 " + totalOrders + " 개의 상품이 주문되었습니다.");
        sc.close();
    }
}

