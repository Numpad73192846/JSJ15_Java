package java_mission.Index11;

import java.util.ArrayList;
import java.util.List;

public class Bank {

	static List<Account> accountList = 	new ArrayList<Account>();
	
	public static Account createdAccount(String num, String name, int money, int passward) {
		Account account = new Account(num, name, money, passward);
		accountList.add(account);
		return account;
	}
	
}
