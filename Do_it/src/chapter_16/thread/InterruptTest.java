package chapter_16.thread;

public class InterruptTest extends Thread {

	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
				Thread.sleep(3000);
				System.out.print(i + "\t");
			}
		} catch (InterruptedException e) {
			System.out.println("wake up");
		}
		System.out.println("end");
	}
	
	public static void main(String[] args) throws InterruptedException {
		InterruptTest test = new InterruptTest();
		
		test.start();
		Thread.sleep(3000);
		// 인터럽트
		// : Not Runnable인 상태의 스레드를 Runnable상태가 되도록 요청하는 것
		// * Runnable 		상태: 작업 중지 요청
		// * Not Tunnalbe 	상태: Runnable 상태로 변경
		test.interrupt();
		
	}
	
}
