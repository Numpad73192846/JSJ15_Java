package java_mission.Index11;

public class Account {
	
	// 캡슐화를 위해 private로 접근
	private String num;
	private String name;
	private int money;
	private int passward;
	

	public Account() {
		// Account 기본값 초기화
		this("계좌없음", "이름없음", 0, 0);
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
	
}
