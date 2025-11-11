package java_mission.Index12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
	
	private static List<Lotto> lottoList = new ArrayList<Lotto>();
	
	public static List<Lotto> getLottoList() {
		Collections.sort(lottoList);
		return lottoList;
	}
	
	public static Lotto createLotto(int num) {
		Lotto lotto = new Lotto(num);
		lottoList.add(lotto);
		return lotto;
	}
	
	public static void main(String[] args) {
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		
		int N;
		
		System.out.print("몇 게임? ");
		N = sc.nextInt();

		for (int i = 0; i < N; i++) {
			System.out.print("[" + (i + 1) + " 게임]: " );
			
			for (int j = 0; j < 6; j++) {
				createLotto(random.nextInt(45) + 1);
				
				for (int k = 0; k < args.length; k++) {
					
				}
			}
		}
		
	}
	
}
