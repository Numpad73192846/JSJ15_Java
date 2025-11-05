package java_mission.Index09;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
	
	public static String Name(String str) {
		String person = "";
		String[] name = str.split(" ");
		person = name[0];
		return person;
	}
	
	public static int Money(String str) {
		String answer = "";
		for (char x : str.toCharArray()) {
			if (Character.isDigit(x)) {
				answer += x;
			}
		}
		return Integer.parseInt(answer);
	}
	
	public List<String> personlist() {
		List<String> personList = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		while(true) {
			String str = sc.nextLine();
			personList.add(str);
			if(str.contains("QUIT")) {
				personList.removeLast();
				break;
			}
		}
		
		sc.close();
		return personList;
	}
	
	public static void main(String[] args) {
		Main index09 = new Main();
		List<String> personlist = index09.personlist();
		String arr[] = new String[personlist.size()];
		String result[] = personlist.toArray(arr);
		
		int money = 50000;
		int countM = 0;
		int count = 0;
		int input;
		int sum[] = new int[10];
		boolean sw = true;
		
		System.out.println("성명 출장비\t오만원\t만원\t오천원\t천원\t오백원\t백원\t오십원\t십원\t오원\t일원");
		for (int i = 0; i < result.length; i++) {
			System.out.print(Main.Name(result[i]) + " " + Main.Money(result[i]) + "\t");
			input = Main.Money(result[i]);
			while(money >= 1) {
				countM = input / money;
				sum[count] += countM;
				System.out.print(countM + "\t");
				input = input % money;
				if ( sw == true ) {
					money = money / 5;
				}
				else if ( sw == false ) {
					money = money / 2;
				}
				sw = !sw;
				count++;
			}
			money = 50000;
			count = 0;
			System.out.println();
		}
		
		System.out.print("전체화폐매수:\t");
		for (int i = 0; i < 10; i++) {
			System.out.print(sum[i] + "\t");
		}
		
	}
}
