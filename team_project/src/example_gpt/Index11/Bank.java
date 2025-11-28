package example_gpt.Index11;

import java.util.ArrayList;
import java.util.List;

// 계좌 생성 및 조회, 전체 예금
public class Bank {
	
	final long MAX_BANK_AMOUNT = 1000000000000L;
	final int MAX_ACCOUNT = 1000;
	
	private static List<Account> accountList = new ArrayList<>();
	private long totalAmount = 0L;
	
	public Bank() {
		createAccount("2222-9072", "한로하", 256000, "0000");
	}
	
	public Account createAccount(String accountNum, String name, long money, String passward) {
		Account account = new Account(accountNum, name, money, passward);
		accountList.add(account);
		
		return account;
	}
	
	public Account findAccount(String accountNum) {
		return null;
	}
	
    public boolean deposit(String num, int money) {
    	return null;
    }

    public boolean withdraw(String num, int money, String pw) {
    	return null;
    }

    public long getTotalAmount() {
    	return null;
    }

    public Account[] getAllAccounts() {
    	return null;
    }
}
