package example_gpt.Index11;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Bank_gpt {

	// 관리자 비밀번호 선언
	private static int adminPassward = 1111;
	private static List<Account_gpt> accountList = 	new ArrayList<Account_gpt>();
	
	static {
		accountList.add( new Account_gpt("2222-9072","한로하", 256000, 5678) );
	}
	
	public static Account_gpt createdAccount(String num, String name, int money, int passward) {
		Account_gpt account = new Account_gpt(num, name, money, passward);
		accountList.add(account);
		return account;
	}
	
	public static List<Account_gpt> getAccountList() {
		accountList.sort( Comparator.comparing(Account_gpt::getName));
		return accountList;
	}
	
	public static Account_gpt findAccount(String num) {
		for (Account_gpt acc : accountList) {
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
		Bank_gpt.adminPassward = adminPassward;
	}
	
}
