package example_gpt.Index09;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] unit = {50000,10000,5000,1000,500,100,50,10,5,1};
        int[] total = new int[10];  // 전체 화폐 합산

        List<String> nameList = new ArrayList<>();
        List<Integer> moneyList = new ArrayList<>();

        // 🔥 입력부터 받고 → QUIT 나오면 중지
        while(true) {
            String name = sc.next();
            if(name.equals("QUIT")) break;
            int money = sc.nextInt();

            nameList.add(name);
            moneyList.add(money);
        }

        // 🔥 입력이 끝나고 나서 헤더 출력 (요구사항)
        System.out.println("성명 출장비 오만원 만원 오천원 천원 오백원 백원 오십원 십원 오원 일원");

        // 🔥 인원별 계산 및 출력
        for(int idx=0; idx<nameList.size(); idx++){
            int money = moneyList.get(idx);

            System.out.print(nameList.get(idx) + " " + money);

            for(int i=0;i<10;i++){
                int cnt = money / unit[i];   // 각 화폐 매수
                total[i] += cnt;            // 전체 합계 누적
                money %= unit[i];           // 나머지 금액 Update

                System.out.print(" " + cnt);
            }
            System.out.println();
        }

        // 🔥 전체 합계 출력
        System.out.print("전체 화폐매수 : ");
        for(int i=0;i<10;i++){
            System.out.print(total[i] + " ");
        }
        
        sc.close();
    }
}
