package example_gpt.Index11;

import java.util.ArrayList;
import java.util.List;

// 계좌 생성 및 조회, 전체 예금
public class Bank {
	
	final long MAX_BANK_AMOUNT = 1000000000000L;
	final int MAX_ACCOUNT = 1000;
	
	private List<Account> accountList = new ArrayList<>();
	private long totalAmount = 0L;
	
	public Bank() {
		createAccount("2222-9072", "한로하", 256000, "0000");
	}
	
	public Account createAccount(String accountNum, String name, long money, String passward) {
		if ( accountList.size() > MAX_ACCOUNT ) {
			System.out.println("생성 가능한 계좌 수를 초과하였습니다.");
			return null;
		}
		if ( money < 0 ) {
			System.out.println("최초 입금액은 0원 이상만 가능합니다.");
			return null;
		}
		if ( totalAmount + money > MAX_BANK_AMOUNT ) {
			System.out.println("은행이 보관 가능한 금액을 초과하였습니다.");
			return null;
		}
		Account account = new Account(accountNum, name, money, passward);
		accountList.add(account);
		totalAmount += money;
		return account;
	}
	
	public Account findAccount(String accountNum) {
		for (Account acc : accountList) {
			if (acc.getAccountNum().equals(accountNum)) {
				return acc;
			}
		}
		return null;
	}
	
    public boolean deposit(String num, int money) {
    	Account account = findAccount(num);
    	
    	if ( account == null ) {
            System.err.println("해당 계좌번호가 존재하지 않습니다.");
            return false;
    	}
    	
    	boolean success = account.deposit(money);
    	
    	if ( success == true ) {
    		totalAmount += money;
    		return true;
    	}
    	
    	return false;
    }

    public boolean withdraw(String num, int money, String pw) {
    	Account account = findAccount(num);
    	
    	if ( account == null ) {
            System.err.println("해당 계좌번호가 존재하지 않습니다.");
            return false;
    	}
    	
    	boolean success = account.withdraw(money);
    	
    	if ( success == true ) {
    		totalAmount -= money;
    		return true;
    	}
    	
    	return false;
    }

    public long getTotalAmount() {
    	return totalAmount;
    }

    public Account[] getAllAccounts() {
    	return null;
    }
}
