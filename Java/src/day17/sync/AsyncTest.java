package day17.sync;

class Bank {
	
	private int maney = 10000;

	public int getManey() {
		return maney;
	}

	public void setManey(int maney) {
		this.maney = maney;
	}
	
	// 입금
	public void saveMoney(int save) {
			int m = this.getManey();
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
			
			setManey(m + save);
	}
	
	// 출금
	public void minusMoney(int minus) {
			int m = this.getManey();
			
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			setManey(m - minus);
	}
	
}

class Person1 extends Thread {

	@Override
	public void run() {
		System.out.println("사람1은 3000원을 입금합니다.");
		AsyncTest.myBank.saveMoney(3000);
		System.out.println("잔액 : " + AsyncTest.myBank.getManey());
		
	}
	
}

class Person2 extends Thread {
	
	@Override
	public void run() {
		System.out.println("사람2는 1000원을 출금합니다.");
		AsyncTest.myBank.minusMoney(1000);
		System.out.println("잔액 : " + AsyncTest.myBank.getManey());
	}
	
}

public class AsyncTest {

	public static Bank myBank = new Bank();
	
	public static void main(String[] args) throws InterruptedException {
	
		Person1 person1 = new Person1();
		person1.start();		// money : 10000
		
		Thread.sleep(200);
		
		Person2 person2 = new Person2();
		person2.start();		// money 		: 10000
								// money(0.2초) 	: 9000
								// money(3초)	: 13000
		System.out.println("잔액 : " + AsyncTest.myBank.getManey());
	}
	
}
