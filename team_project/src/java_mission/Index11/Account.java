package java_mission.Index11;

public class Account {
	
	private String num;
	private String name;
	private int money;
	private String passward;
	
	public Account() {
		this("계좌없음", "이름없음", 0, "0000");
	}

	public Account(String num, String name, int money, String passward) {
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

	public String getPassward() {
		return passward;
	}

	public void setPassward(String passward) {
		this.passward = passward;
	}
	
}
