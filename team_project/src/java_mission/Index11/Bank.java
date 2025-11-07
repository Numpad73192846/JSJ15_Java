package java_mission.Index11;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Bank {

	// 관리자 비밀번호 선언
	private static int adminPassward = 1111;
	private static List<Account> accountList = 	new ArrayList<Account>();
	
	static {
		accountList.add( new Account("2222-9072","한로하", 256000, 5678) );
	}
	
	public static Account createdAccount(String num, String name, int money, int passward) {
		Account account = new Account(num, name, money, passward);
		accountList.add(account);
		return account;
	}
	
	public static List<Account> getAccountList() {
		accountList.sort( Comparator.comparing(Account::getName));
		return accountList;
	}
	
	public static Account findAccount(String num) {
		for (Account acc : accountList) {
			if(acc.getNum().equals(num)) {
				return acc;
			}
		}
		return null;
	}

	public static int getAdminPassward() {
		return adminPassward;
	}

	public static void setAdminPassward(int adminPassward) {
		Bank.adminPassward = adminPassward;
	}
	
}
