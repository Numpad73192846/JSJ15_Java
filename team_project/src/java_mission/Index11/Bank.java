package java_mission.Index11;

import java.util.ArrayList;
import java.util.List;

public class Bank {

	private static String adminPassward;
	private static List<Account> accountList = new ArrayList<Account>();

	public Bank() {
		setAdminPassward("1111");
	}

	public void setAdminPassward(String adminPassward) {
		Bank.adminPassward = adminPassward;
	}

	public static String getAdminPassward() {
		return adminPassward;
	}
	
	public static List<Account> getAccountList() {
		return accountList;
	}
	
	public static Account createAccount(String num, String name, int money, String passward) {
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
