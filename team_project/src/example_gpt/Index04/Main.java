package example_gpt.Index04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            int starCount = 2 * i + 1;
            
            // TODO: 별 앞에 N-1만큼 공백을 출력
            for (int j = 0; j < N - i - 1; j++) {
				System.out.print(" ");
			}

            // TODO: starCount만큼 "*" 출력
            for (int j = 0; j < starCount; j++) {
				System.out.print("*");
			}
            
            // TODO: 줄바꿈
            System.out.println();
        }

        sc.close();
    }
}
