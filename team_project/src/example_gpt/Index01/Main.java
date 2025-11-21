package example_gpt.Index01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // TODO: 1) 영어, 수학, 자바 점수를 각각 정수로 입력받아 변수에 저장하시오.
        int eng = sc.nextInt();
        int math = sc.nextInt();
        int java = sc.nextInt();

        // TODO: 2) 총점 계산
        int sum = eng + math + java;

        // TODO: 3) 평균 계산 (소수로 계산될 수 있게)
        double avg = (double)sum / 3.0;

        // TODO: 4) 예시와 같은 형식으로 출력
        System.out.println("영어 점수 : " + eng);
        System.out.println("수학 점수 : " + math);
        System.out.println("자바 점수 : " + java);
        System.out.println("총점 : " + sum);
        System.out.println("평균 : " + avg);

        sc.close();
    }
}

