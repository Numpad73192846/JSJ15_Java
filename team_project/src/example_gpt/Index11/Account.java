package example_gpt.Index11;

public class Account implements Comparable<Account> {
	
	private String num;
	private String name;
	private int money;
	private int passward;
	
	public Account() {
		this("계좌없음", "이름없음", 0, 0000);
	}
	
	@Override
	public int compareTo(Account o) {
		String thisname = this.getName();
		String comName = o.getName();
		int result = thisname.compareTo(comName);
		return result;
	}

	public Account(String num, String name, int money, int passward) {
		this.num = num;
		this.name = name;
		this.money = money;
		this.passward = passward;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getPassward() {
		return passward;
	}

	public void setPassward(int passward) {
		this.passward = passward;
	}
	
	public void deposit(int amount) {
		if ( amount > 1_000_000 ) {
			System.err.println("1회 송금 제한액은 1,000,000원 입니다.");
			return;
		}
		if ( money + amount > 1_000_000_000 ) {
			System.err.println("최대 예금액은 1,000,000,000원 입니다.");
			return;
		}
		money += amount;
	}
	
	public void withdraw(int amount) {
		if ( amount > 1_000_000 ) {
			System.err.println("1회 최대 출금액은 1,000,000원 입니다.");
		}
		if ( money < amount ) {
			System.err.println("계좌에 잔액이 부족합니다.");
		}
		money -= amount;
	}
	
}
