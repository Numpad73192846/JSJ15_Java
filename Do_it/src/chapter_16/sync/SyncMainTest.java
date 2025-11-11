package chapter_16.sync;

class Bank {
	private int money = 10000;
	
	// synchronized
	// : 하나의 스레드가 메서드를 수행하는 동안 
	//   그 메서드가 속해있는 객체름 잠가 다른 스레드를 접근할 수 없게 한다.
	public synchronized void saveMoney(int save) {
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

	public int getMoney() {
		return money;
	}
	
	public void setMoney(int money) {
		this.money = money;
	}
}

class Park extends Thread {
	
	public void run() {
		synchronized (SyncMainTest.myBank) {
			
			System.out.println("예금 작업을 시작합니다.");
			SyncMainTest.myBank.saveMoney(3000);
			System.out.println("saveMoney(3000) 작업이 진행되어 잔액이 " + SyncMainTest.myBank.getMoney() + "입니다.");
			
		}
	}
	
}

class ParkWife extends Thread {
	
	public void run() {
		synchronized (SyncMainTest.myBank) {
			
			System.out.println("출금 작업을 시작합니다.");
			SyncMainTest.myBank.minusMoney(1000);
			System.out.println("minusMoney(1000) 작업이 진행되어 잔액이 " + SyncMainTest.myBank.getMoney() + "입니다.");
			
		}
	}
	
}
public class SyncMainTest {

	public static Bank myBank = new Bank();
	
	public static void main(String[] args) throws InterruptedException {
		Park p = new Park();
		p.start();
		
		Thread.sleep(200);
		ParkWife pw = new ParkWife();
		pw.start();
	}
	
}
