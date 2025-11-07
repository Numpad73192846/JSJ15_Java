package java_mission.Index12;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

	
	static List<Lotto> lottoList = new ArrayList<Lotto>();
	
	public static Lotto createdLottoNum(int num) {
		Lotto lotto = new Lotto(num);
		lottoList.add(lotto);
		return lotto;
	}
	
	public static void clearingLottoList() {
		lottoList.removeAll(lottoList);
	}

	public static List<Lotto> getLottoList() {
		return lottoList;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int randomNum[] = new int[6];
		
		int N = sc.nextInt();
		
		for (int i = 0; i < N; i++) {
			
			for (int j = 0; j < randomNum.length; j++) {
				 randomNum[j] = random.nextInt(45) + 1;
				 for (int k = 0; k <= j; k++) {
					 if( randomNum[j] == randomNum[k] ) {
						 randomNum[j] = random.nextInt(45) + 1;
						 break;
					 }
				}
				 j--;
				createdLottoNum(randomNum[j]);
			}
			for (Lotto lot : lottoList) {
				System.out.print(lot.getNum() + " ");
			}
			clearingLottoList();
			System.out.println();
		}
	sc.close();
	}
	
}
