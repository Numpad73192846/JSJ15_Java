package chapter_16.thread;

public class SleepTest extends Thread {

	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
				// 현재 스레드를 지정한 시간 만큼 Not Runnable상태로 변경
				// 그동안 CPU에서 처리할 수 없게 되기 때문에 지정시간 만큼 지연된다.
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
			System.out.print(i + "\t");
		}
	}
	
	public static void main(String[] args) {
		SleepTest test = new SleepTest();
		test.start();
	}
	
}
