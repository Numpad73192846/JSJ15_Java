package day02;

public class Ex21_GuguAll {
	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {
				System.out.println(j + "x" + i + "=" + (i * j));
				System.out.println("\t"); 		// 탭(공백)
			}
			System.out.println();
		}
	}
}
