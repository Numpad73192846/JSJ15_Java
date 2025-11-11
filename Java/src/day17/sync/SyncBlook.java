package day17.sync;

class Bank3 {
	private int money = 10000;
	
	public int getMoney() {
		return money;
	}
	
	public void setMoney(int money) {
		this.money = money;
	}

	// 입금 (* 메소드에 syschronized 적용)
	public synchronized void saveMoney(int save) {
		// * synchronized 블록
		// : syschronized(공유자원) { }
		synchronized (this) {
			
			int m = this.getMoney();
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
			
			setMoney(m + save);
			
		}
	}
	
	// 출금 (* 메소드에 syschronized 적용)
	public synchronized void minusMoney(int minus) {
		synchronized (this) {
			
			int m = this.getMoney();
			
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			setMoney(m - minus);
			
		}
	}

}

class Person5 extends Thread {
	
	public void run() {
		synchronized (SyncBlook.myBank) {
			
			System.out.println("사람1은 3000원을 입금합니다.");
			SyncBlook.myBank.saveMoney(3000);
			System.out.println("잔액 : " + AsyncTest.myBank.getManey());
			
		}
	}
	
}

class Person6 extends Thread {
	
	public void run() {
		synchronized (SyncBlook.myBank) {
			
			System.out.println("사람2는 1000원을 출금합니다.");
			SyncBlook.myBank.minusMoney(1000);
			System.out.println("잔액 : " + AsyncTest.myBank.getManey());
			
		}
	}
	
}
public class SyncBlook {

	public static Bank myBank = new Bank();
	
	public static void main(String[] args) throws InterruptedException {
		Person5 person5 = new Person5();
		person5.start();
		
		Thread.sleep(200);
		Person6 person6 = new Person6();
		person6.start();
	}
	
}
