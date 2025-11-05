package java_mission.Index01;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int eng;
		int math;
		int java;
		
		Scanner sc = new Scanner(System.in);
		eng = sc.nextInt();
		math = sc.nextInt();
		java = sc.nextInt();
		int sum = eng + math + java;
		double adv = (double) sum / 3;
		
		System.out.println("영어 점수 : " + eng);
		System.out.println("수학 점수 : " + math);
		System.out.println("자바 점수 : " + java);
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + adv);
		
		sc.close();
	}
}
