package example_gpt.Index06;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);	// 입력 받기 위한 객체
        Random random = new Random();			// 랜덤 수를 뽑기 위한 객체

        System.out.print("몇 게임? ");
        int N = sc.nextInt();					// 몇 게임을 할 건지 입력을 받음

        for (int i = 1; i <= N; i++) {

            HashSet<Integer> set = new HashSet<>();	// 따로 중복제거를 하지 않기 위해 HashSet 사용

            // for문이 아닌 HashSet에 6개가 들어가기 전까지 반복할 수 있도록 while문 사용
            while(set.size() < 6) {
                set.add(random.nextInt(45) + 1);
            }

            List<Integer> lotto = new ArrayList<>(set);
            Collections.sort(lotto);

            System.out.println("[" + i + " 게임] : " + lotto);
        }
        sc.close();
    }
}
