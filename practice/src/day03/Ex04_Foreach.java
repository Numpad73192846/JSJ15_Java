package day03;

public class Ex04_Foreach {

	public static void main(String[] args) {
		// 배열 선언 및 초기화
		// week이라는 배열, 값은 월요일~일요일까지 -> 데이터를 문자열로 받기 때문에 String사용
		String[] week = {"월요일", "화요일", "수요일", "목요일", "금요일", "토요일", "일요일"};
		
		// foreach문 사용
		// 문자열을 받아야 하기 때문에 String으로 day라는 변수를 선언 그와 동시에 week이라는 배열의 요소를 전부 반복
		for (String day : week) {
			// 배열 week의 [0]값부터 [6]까지 day에 대입되어 콘솔 창에 출력
			System.out.println(day + " ");
		}
		System.out.println();
		
		// for문 사용
		// 조건식을 배열 week의 길이만큼 반복하도록 설정
		for (int i = 0; i < week.length; i++) {
			// 배열 week의 [0]값부터 [6]값까지 출력
			System.out.print(week[i] + " ");
			
		}
		System.out.println();
	}
}
