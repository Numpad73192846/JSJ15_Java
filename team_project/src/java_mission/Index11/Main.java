package java_mission.Index11;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		String num, name, passward, enterPassword;
		int menuNo, money, depositAmount, withdrawalAmount;

		Scanner sc = new Scanner(System.in);
		Account account, newAccount;
		
		
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
			
			if( menuNo < 1 || menuNo > 6 ) {
				System.err.println("1~6사이의 번호를 입력해주십시오.");
				continue;
			}
			else if( menuNo == 6 ) {
				System.out.println("시스템을 종료합니다.");
				break;
			}
			
			switch (menuNo) {
			case 1:
				System.out.print("계좌번호>> ");
				num = sc.nextLine();
				System.out.print("예금주>> ");
				name = sc.nextLine();
				System.out.print("최초예금액>> ");
				money = sc.nextInt();
				System.out.print("비밀번호>> ");
				passward = sc.nextLine();
				sc.nextLine();
				
				newAccount = Bank.createAccount(num, name, money, passward);
				
				System.out.println("'" + newAccount.getName() + "'님의 계좌가 개설되었습니다.");
				
				break;
			case 2:
				System.out.println("================= 입금 ================");
				System.out.print("계좌번호>> ");
				num = sc.nextLine();
				
				account = Bank.findAccount(num);
				
				if( account == null ) {
					System.err.println("입력하신 계좌번호가 없습니다.");
					break;
				}
				else if( account.getNum().equals(num) ) {
					System.out.print("입금액>> ");
					depositAmount = sc.nextInt();
					sc.nextLine();
					
					System.out.println("'" + account.getName() + "'님에게 입금하는게 맞으십니까?");
					
					
					System.out.println("1. 예");
					System.out.println("2. 아니요");
					System.out.print("입력>> ");
					menuNo = sc.nextInt();
					sc.nextLine();

					switch (menuNo) {
					case 1:
						money = account.getMoney();
						money += depositAmount;
						account.setMoney(money);
						System.out.println("'" + account.getName() + "'님의 계좌에 " + depositAmount + " 원이 입금되었습니다.");
						break;
					case 2:
						System.out.println("취소되었습니다.");
						break;
					}
					break;
				}
			case 3:
				System.out.println("================= 출금 ================");
				System.out.print("계좌번호>> ");
				num = sc.nextLine();
				
				account = Bank.findAccount(num);
				
				if( account == null ) {
					System.err.println("입력하신 계좌번호가 없습니다.");
					break;
				}
				else if( account.getNum().equals(num) ) {
					System.out.print("비밀번호>> ");
					enterPassword = sc.nextLine();
					
					if( !account.getPassward().equals(enterPassword) ) {
						System.err.println("비밀번호가 다릅니다!");
						System.out.println(account.getPassward());
						break;
					}
					else if( account.getPassward().equals(enterPassword) ) {
						System.out.print("출금액>> ");
						withdrawalAmount = sc.nextInt();
						sc.nextLine();
						
						if( withdrawalAmount > account.getMoney() ) {
							System.err.println("잔액이 부족합니다.");
							break;
						}
						else {
							money = account.getMoney();
							money -= withdrawalAmount;
							account.setMoney(money);
							System.out.println("'" + account.getName() + "'님의 계좌에 " + withdrawalAmount + " 원이 출금되었습니다.");
							break;
						}
						
						
					}
				}
			case 4:
				System.out.println("================= 계좌조회 ================");
				System.out.print("계좌번호>> ");
				num = sc.nextLine();
				
				account = Bank.findAccount(num);
				
				if( account == null ) {
					System.err.println("입력하신 계좌번호가 없습니다.");
					break;
				}
				else if( account.getNum().equals(num) ) {
					System.out.print("비밀번호>> ");
					passward = sc.nextLine();
					
					if( !account.getPassward().equals(passward) ) {
						System.err.println("비밀번호가 다릅니다!");
						break;
					}
					else if( account.getPassward().equals(passward) ) {
						System.out.println("'" + account.getName() + "'님의 계좌잔액은 " + account.getMoney() + " 원 입니다.");
					}
				}
			case 5:
				System.out.print("관리자 비밀번호>> ");
				passward = sc.nextLine();
				sc.nextLine();
				
				if( passward != Bank.getAdminPassward() ) {
					System.err.println("비밀번호가 틀립니다.");
					
					break;
				}
				else if( passward == Bank.getAdminPassward() ) {
					System.out.println("================= 계좌목록 ================");
					
					break;
				}
			}
		} while(true);
		
		sc.close();
	}
	
}
