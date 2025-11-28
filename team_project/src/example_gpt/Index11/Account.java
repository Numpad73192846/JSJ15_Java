package example_gpt.Index11;

// 계좌 관리 => 입금, 출금, 잔액 관리
public class Account implements Comparable<Account> {
	
	final int MAX_AMOUNT = 1000000000;
	final int MAX_LIMIT = 1000000;
	
	String accountNum;
	String name;
	long amount;
	String passward;
	
	public Account() {
		this("계좌없음","이름없음",0,"0000");
	}

	public Account(String accountNum, String name, long amount, String passward) {
		this.accountNum = accountNum;
		this.name = name;
		this.amount = amount;
		this.passward = passward;
	}

	public boolean deposit(int money) {
		if( MAX_LIMIT < money ) {
			System.err.println("1회 최대 송금액은 1,000,000원 입니다.");
			return false;
		}
		if( MAX_AMOUNT < amount + money ) {
			System.err.println("계좌의 최대 잔액은 1,000,000,000원 입니다.");
			return false;
		}
		amount += money;
		return true;
	}
	
	public boolean withdraw(int money) {
		if( MAX_LIMIT < money ) {
			System.err.println("1회 최대 출금액은 1,000,000원 입니다.");
			return false;
		}
		if( amount < money ) {
			System.err.println("계좌의 잔액이 부족합니다.");
			return false;
		}
		amount -= money;
		return true;
	}
	
	@Override
	public int compareTo(Account o) {
		String thisname = this.getName();
		String comName = o.getName();
		int result = thisname.compareTo(comName);
		return result;
	}

	public String getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getAmount() {
		return amount;
	}
	
	public String getPassward() {
		return passward;
	}

	public void setPassward(String passward) {
		this.passward = passward;
	}
	
}
