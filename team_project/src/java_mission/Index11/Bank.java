package java_mission.Index11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Bank {

	private static int adminPassward = 1111;
	private static List<Account> accountList = new ArrayList<Account>();
	
	static {
		createAccount("2222-9072", "한로하", 256000, 0000);
	}

	public void setAdminPassward(int adminPassward) {
		Bank.adminPassward = adminPassward;
	}

	public static int getAdminPassward() {
		return adminPassward;
	}
	
	public static List<Account> getAccountList() {
		Collections.sort(accountList);
		return accountList;
	}
	
	public static Account createAccount(String num, String name, int money, int passward) {
		Account account = new Account(num, name, money, passward);
		accountList.add(account);
		return account;
	}

	public static Account findAccount(String num) {
		for (Account account : accountList) {
			if( account.getNum().equals(num) ) {
				return account;
			}
		}
		return null;
	}
	
}
