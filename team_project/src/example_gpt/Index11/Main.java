package example_gpt.Index11;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank();

        int menu;
        String accountNum, name, passward;
        long money;

        while (true) {
            // TODO: 메뉴 출력
            System.out.println("===================================");
            System.out.println("1. 계좌등록");
            System.out.println("2. 입금");
            System.out.println("3. 출금");
            System.out.println("4. 계좌조회");
            System.out.println("5. 계좌목록");
            System.out.println("6. 종료");
            System.out.println("===================================");
            System.out.print("입력>> ");
            menu = sc.nextInt();
            sc.nextLine();

            if (menu == 6) {
                System.out.println("시스템 종료");
                break;
            }

            switch (menu) {

                case 1:
                	System.out.print("계좌번호>> ");
                	accountNum = sc.nextLine();
                	System.out.print("예금주>> ");
                	name = sc.nextLine();
                	System.out.print("최초예금액>> ");
                	money = sc.nextInt();
                	System.out.print("비밀번호>> ");
                	passward = sc.nextLine();
                    bank.createAccount(accountNum, name, money, passward);
                    System.out.println("'"+name + "'님의 계좌가 개설되었습니다.");
                    break;

                case 2:
                	System.out.print("계좌번호>> ");
                	accountNum = sc.nextLine();
                	System.out.print("입금액>> ");
                	money = sc.nextInt();
                	
                	bank.deposit(accountNum, money);
                
                    break;

                case 3:
                    // TODO: 출금
                    break;

                case 4:
                    // TODO: 계좌 조회
                    break;

                case 5:
                    // TODO: 계좌 목록 출력
                    break;

                default:
                    System.err.println("1~6 사이의 번호를 입력하세요.");
            }
        }

        sc.close();
    }
}
