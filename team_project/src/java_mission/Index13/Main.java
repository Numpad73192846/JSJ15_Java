package java_mission.Index13;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
	
	private static Main instance;
	
	private Main() {}
    
    public static Main getInstance() {
        if (instance == null) {
            instance = new Main();
        }
        return instance;
    }
	
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
	
	public static void removeLotto() {
		lottoList.remove(0);
	}
	
	public static void clearingLottoList() {
		lottoList.clear();
	}
	
	public static void calendarLotto() {
		Calendar lottoCal = Calendar.getInstance(); 
		
		int weekday = lottoCal.get( Calendar.DAY_OF_WEEK );
		int time = lottoCal.get( Calendar.HOUR );
		int ampm = lottoCal.get( Calendar.AM_PM );
		
		boolean buyYn = false;
		if ( ampm == 0 && time >= 0 && time <= 6 ) {
			System.out.println("구입 가능한 시간이 아닙니다.");
		}
		else if( weekday == 7 && ampm == 1 && time >= 8 ) {
			System.out.println("구입 가능한 시간이 아닙니다.");
		}
		else {
			buyYn = true;
		}
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy/MM/dd(E) HH:mm:ss");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd(E)");
		
		String purchaseDate = sdf1.format( lottoCal.getTime() );
		System.out.println("발행일\t: " + purchaseDate);
		
		lottoCal.set(Calendar.AM_PM, 1);
		lottoCal.set(Calendar.HOUR, 9);
		lottoCal.set(Calendar.MINUTE, 0);
		lottoCal.set(Calendar.SECOND, 0);
		
		if( buyYn ) {
			lottoCal.add(Calendar.DATE, 7 - weekday);
			String drawDate = sdf1.format( lottoCal.getTime() ); 
			System.out.println("추첨일\t: " + drawDate);
		}
		else {
			System.err.println("구입 가능한 시간에 다시 오세요.");
		}
		
		lottoCal.add(Calendar.DAY_OF_MONTH, 1);
		lottoCal.add(Calendar.YEAR, 1);
		String drawDate = sdf2.format( lottoCal.getTime() ); 
		System.out.println("지급기한\t: " + drawDate);
		
	}
	
	public static void lottoNumOut(String arr[][], int gameCount, int count) {
		for (int j = gameCount - count; j < gameCount - count + 1; j++) {
			for (int k = 0; k < arr[j].length; k++) {
				if( arr[j][k].length() == 1 ) {
					System.out.print("0");
				}
				System.out.print(arr[j][k] + "    ");
			}
		}
	}
	
	public static void lottoWin(int res[],int res2[] ,String result, int gameCount, int count) {
			
			if( res[gameCount - count] == 3  ) {
				result = "(5등)";
				System.out.print(result);
			}
			else if( res[gameCount - count] == 4  ) {
				result = "(4등)";
				System.out.print(result);
			}
			else if( res[gameCount - count] == 5 ) {
				if( res2[gameCount - count] == 1 ) {
					result = "(2등)";
					System.out.print(result);
				}
				else if( res2[gameCount - count] == 0 ) {
					result = "(3등)";
					System.out.print(result);
				}
			}
			else if( res[gameCount - count] == 6 ) {
				result = "(1등)";
				System.out.print(result);
			}
			
			else {
				result = "(낙첨)";
				System.out.print(result);
			}
		}
	
	public static void winName(int gameCount, int count) {
		System.out.print((char)('A' + (gameCount - count)) + " ");
	}
	
	public static void lottoWinResult(String arr[][], String am[], int res[], int res2[], int gameCount,int count, String result) {
		winName(gameCount, count);
		System.out.print(am[gameCount - count] + " ");
		lottoNumOut(arr, gameCount, count);
		lottoWin(res, res2, result, gameCount, count);
		System.out.println();
	}
	
	public static void lottoResult(String arr[][], String am[], int res[], int res2[], int gameCount,int count, String result) {
		winName(gameCount, count);
		System.out.print(am[gameCount - count] + " ");
		lottoNumOut(arr, gameCount, count);
		System.out.println();
	}
	
	public void runLotto() {
		
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		
		int gameCount, count, n, num, temp;
		int countNum = 0;
		int countWin = 0;
		int countBonusWin = 0;
		String result = "";
		int win[] = new int[7];
		 
		System.out.print("몇 게임? ");
		gameCount = sc.nextInt();
		count = gameCount;
		
		String arr[][] = new String[gameCount][6];
		String am[] = new String[gameCount];
		int res[] = new int[gameCount];
		int res2[] = new int[gameCount];
		
		for (int i = 0; i < gameCount; i++) {
			System.out.print("[" + (i + 1) + " 게임] (1.자동 / 2.수동) : " );
			n = sc.nextInt();
			sc.nextLine();
			
			switch (n) {
			case 1:
				for (int j = 0; j < 6; j++) {
					createLotto(random.nextInt(45) + 1);
					for (int k = 0; k < j; k++) {
						if( lottoList.get(j).getNum() == lottoList.get(k).getNum() ) {
							lottoList.remove(k);
							createLotto(random.nextInt(45) + 1);
							k = -1;
						}
					}
				}
				
				for (int j = 0; j < 6; j++) {
					arr[i][j] = Integer.toString(getLottoList().get(j).getNum());
				}
				
				for (Lotto lot : getLottoList()) {
					System.out.print(lot.getNum() + " ");
				}
				am[i] = "자  동";
				clearingLottoList();
				System.out.println();
				break;
			case 2:
				System.out.print("① : ");
				num = sc.nextInt();
				lottoList.add(new Lotto(num));
				System.out.print("② : ");
				num = sc.nextInt();
				lottoList.add(new Lotto(num));
				System.out.print("③ : ");
				num = sc.nextInt();
				lottoList.add(new Lotto(num));
				System.out.print("④ : ");
				num = sc.nextInt();
				lottoList.add(new Lotto(num));
				System.out.print("⑤ : ");
				num = sc.nextInt();
				lottoList.add(new Lotto(num));
				System.out.print("⑥ : ");
				num = sc.nextInt();
				sc.nextLine();
				lottoList.add(new Lotto(num));
				
				for (int j = 0; j < 6; j++) {
					arr[i][j] = Integer.toString(getLottoList().get(j).getNum());
				}
				
				for (Lotto lot : getLottoList()) {
					System.out.print(lot.getNum() + " ");
				}
				
				am[i] = "수  동";
				clearingLottoList();
				System.out.println();
				break;
			}
			
			
			
		}
		System.out.println("\n\n\n");
		System.out.println("############ 인생역전 Lottoria ############");
		calendarLotto();
		for (int i = 0; i < gameCount; i++) {
			lottoResult(arr,am,res,res2,gameCount,count,result);
			count--;
		}
		System.out.println("----------------------------------------");
		System.out.println("금액\t\t\t\t  ￦5,000");
		System.out.println("########################################");
		System.out.println();
		for (int i = 0; i < win.length - 1; i++) {
			win[i] = random.nextInt(45) + 1;
			for (int j = 0; j < i; j++) {
				if( win[i] == win[j] ) {
					win[j] = random.nextInt(45) + 1;
					j = -1;
				}
			}
			for (int j = 0; j < i; j++) {
				if( win[i] < win[j] ) {
					temp = win[j];
					win[j] = win[i];
					win[i] = temp;
				}
			}
		}
		win[6] = random.nextInt(45) + 1;
		for (int j = 0; j < 6; j++) {
			if( win[6] == win[j] ) {
				win[6] = random.nextInt(45) + 1;
				j = -1;
			}
		}
		System.out.print("당첨 번호 : ");
		for (int i = 0; i < win.length - 1; i++) {
			System.out.print(win[i] + " ");
		}
		System.out.println();
		System.out.print("보너스 번호 : " + win[6]);
		System.out.println("\n\n\n\n");
		
		
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = 0; j < arr[i].length; j++) {
				
				if( countNum == 7 ) {
					res[i] = countWin;
					res2[i] = 0;
					countWin = 0;
					countNum = 0;
					break;
				}
				
				if( arr[i][j].equals(Integer.toString(win[countNum])) && countNum == 6 ) {
					countBonusWin++;
					res[i] = countWin;
					res2[i] = countBonusWin;
					countWin = 0;
					countNum = 0;
					countBonusWin = 0;
					break;
				}
				
				if( arr[i][j].equals(Integer.toString(win[countNum])) ) {
					countWin++;
					countNum++;
					j = 0;
					continue;
				}
				
				else if( j == 5 ) {
					countNum++;
					j = 0;
					continue;
				}
				
			}
		}
	
		count = gameCount;
		
		System.out.println("#################### 당첨 결과 ####################");
		for (int i = 0; i < gameCount; i++) {
			lottoWinResult(arr,am,res,res2,gameCount,count,result);
			count--;
		}
		System.out.println("################################################");
		
		sc.close();
	}
	
	public static void main(String[] args) {
		Main.getInstance().runLotto();
	}
	
}
