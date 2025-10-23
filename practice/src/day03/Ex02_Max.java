package day03;

import java.util.Scanner;

public class Ex02_Max {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		// 입력을 받기위해 객체 생성
		int n = sc.nextInt();						// 지역변수 n이 정수인 입력값을 받음
		int arr[] = new int[n];						// 입력 받은 정수만큼 배열의 요소 생성
		int max = Integer.MIN_VALUE;				// 최댓값을 저장할 지역변수 선언
		
		for (int i = 0; i < arr.length; i++) {		
			arr[i] = sc.nextInt();					// 배열의 각 요소마다 데이터 입력 ※index주소 0~n-1까지 입력을 받음
		}
		
		for (int i = 0; i < arr.length; i++) {
			if ( max < arr[i] ) {					// max에 저장된 값이 배열의 저장되는 값보다 작으면 실행하도록 조건 설정
				max = arr[i];						// 조건에 만족하면 max의 값이 배열의 저장되는 값으로 바뀜
			}
		}
		System.out.println("최댓값 : " + max);
		sc.close();
	}
}
