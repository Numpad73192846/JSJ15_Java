package day03;

public class Ex01_Array {

	public static void main(String[] args) {
		
		int arr[];						// arr이라는 배열 선언
		arr = new int[5];				// arr은 5개의 배열을 가진다
		int arr2[] = new int[5];
		int arr3[] = {1,2,3,4,5};
		
		arr[0] = 1;		// arr의 배열의 데이터 저장
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		
		int N = arr.length;
		System.out.println("배열의 길이 : " + N);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
