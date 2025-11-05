package java_mission.Index11;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Bank bank = new Bank();
		
		
		int menuNo;
		
		do {
			System.out.println("===================================");
			System.out.println("1. 계좌등록");
			System.out.println("2. 입금");
			System.out.println("3. 출금");
			System.out.println("4. 계좌조회");
			System.out.println("5. 계좌목록");
			System.out.println("6. 종료");
			System.out.println("===================================");
			System.out.print("입력>> ");
			menuNo = sc.nextInt();
			sc.nextLine();
			
			switch (menuNo) {
				case 1:
					
					System.out.print("계좌번호>> ");
					bank.num = sc.nextLine();
					System.out.print("예금주>> ");
					bank.name = sc.nextLine();
					System.out.print("최초예금액>> ");
					bank.money = sc.nextInt();
					System.out.print("비밀번호>> ");
					bank.passward = sc.nextInt();
					System.out.println("'" + bank.name + "'님의 계좌가 개설되었습니다.");
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					System.out.println("============ 계좌조회 ============");
					System.out.print("계좌번호>> " + bank.num + "\n");
					System.out.print("비밀번호>> " + bank.passward + "\n");
					System.out.print("'" + bank.name + "'님의 계좌잔액은 " + bank.money + "원 입니다.");
					break;
				case 5:
					break;
			}
			
		} while (menuNo != 0);
		
		sc.close();
	}
	
}
