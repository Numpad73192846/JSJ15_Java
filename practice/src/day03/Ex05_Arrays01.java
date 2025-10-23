package day03;

public class Ex05_Arrays01 {

	public static void main(String[] args) {
		// 배열 선언 및 생성
		int arr [][] = new int [2][3];
		
		// 배열의 데이터 값 입력
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3;
		arr[1][0] = 4;
		arr[1][1] = 5;
		arr[1][2] = 6;
		
		// 2차원 배열의 반복하기 위해 이중반복문 사용
		for (int i = 0; i < arr.length; i++) { // 첫번째 차원의 배열요소의 개수만큼 반복
			for (int j = 0; j < arr[i].length; j++) { // 두번째 차원의 배열요소의 개수만큼 반복
				System.out.println( arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
