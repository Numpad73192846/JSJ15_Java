package example_gpt.Index11;

import java.util.Scanner;

public class Main_gpt {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Account_gpt newAccount, acc;
		
		String num, name;
		int money, passward, answer, depositAmount, enterPassword, withdrawalAmount;
		
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
			
			if( menuNo == 6 ) { 
				System.out.println("시스템을 종료합니다.");
				break;
			}
			else if( menuNo < 1 || menuNo > 6) {
				System.err.println("1~6사이의 번호를 입력해주세요.");
				continue;
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
					passward = sc.nextInt();
					sc.nextLine();
					
					newAccount = Bank_gpt.createdAccount(num, name, money, passward);
					System.out.println("'" + newAccount.getName() + "'님의 계좌가 개설되었습니다.");
					
					break;
				case 2:
					System.out.println("============ 입금 ============");
					System.out.print("계좌번호>> ");
					num = sc.nextLine();
					
					acc = Bank_gpt.findAccount(num);
					
					if( acc == null ) {
						System.err.println("입금하시려는 계좌가 존재하지 않습니다.");
						break;
					}
					else if ( acc.getNum().equals(num) ) {
						System.out.print("임금액>> ");
						depositAmount = sc.nextInt();
						sc.nextLine();
						
						System.out.println("'"+ acc.getName() + "'님에게 입금하는게 맞으십니까?");
						System.out.println("1. 예");
						System.out.println("2. 아니요");
						System.out.println("입력>> ");
						answer = sc.nextInt();
						sc.nextLine();
						
						if( answer == 1) {
							money = acc.getMoney();
							money += depositAmount;
							acc.setMoney(money);
							System.out.println("'김조은'님의 계좌에 " + depositAmount + " 원이 입금되었습니다.");
							break;
						}
						else if(answer == 2) break;
					}
				case 3:
					System.out.println("============ 출금 ============");
					System.out.print("계좌번호>> ");
					num = sc.nextLine();
					
					acc = Bank_gpt.findAccount(num);
					
					if( acc == null ) {
						System.err.println("출금하시려는 계좌가 존재하지 않습니다.");
						break;
					}
					else if( acc.getNum().equals(num) ) {
						System.out.print("비밀번호>> ");
						enterPassword = sc.nextInt();
						sc.nextLine();
						
						if( acc.getPassward() != enterPassword ) {
							System.err.println("비밀번호가 다릅니다!");
							break;
						}
						else if( acc.getPassward() == enterPassword ) {
							System.out.print("출금액>> ");
							withdrawalAmount = sc.nextInt();
							sc.nextLine();
							
							if( acc.getMoney() < withdrawalAmount ) {
								System.err.println("출금액이 계좌의 잔액보다 큽니다");
								break;
							}
							else {
								money = acc.getMoney();
								money -= withdrawalAmount;
								acc.setMoney(money);
								System.out.println("'김조은'님의 계좌에" + withdrawalAmount + " 원이 출금되었습니다.");
								break;
							}
						}
					}
				case 4:
					System.out.println("============ 계좌조회 ============");
					System.out.print("계좌번호>> ");
					num = sc.nextLine();
					
					acc = Bank_gpt.findAccount(num);
					
					if( acc == null ) {
						System.err.println("조회하시려는 계좌가 존재하지 않습니다.");
						break;
					}
					else if( acc.getNum().equals(num) ) {
						System.out.print("비밀번호>> ");
						enterPassword = sc.nextInt();
						sc.nextLine();
						
						if( acc.getPassward() != enterPassword ) {
							System.err.println("비밀번호가 다릅니다!");
							break;
						}
						else if( acc.getPassward() == enterPassword ) {
							System.out.println("'" + acc.getName() + "'님의 계좌잔액은 " + acc.getMoney() + " 원 입니다.");
							break;
						}
					}
				case 5:
					System.out.println("============ 계좌목록 ============");
					System.out.println("관리자 비밀번호>>> ");
					enterPassword = sc.nextInt();
					sc.nextLine();
					
					if( Bank_gpt.getAdminPassward() != enterPassword ) {
						System.err.println("비밀번호가 다릅니다!");
						break;
					}
					else if ( Bank_gpt.getAdminPassward() == enterPassword ) {
						System.out.println("예금주\t\t계좌번호\t\t잔고");
						for (Account_gpt a : Bank_gpt.getAccountList()) {
							System.out.println(a.getName() + "\t\t" + a.getNum() + "\t" + a.getMoney() );
						}
					}
			}
			
		} while (menuNo != 6);
		
		sc.close();
	}

}
