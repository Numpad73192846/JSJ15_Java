package chapter_16.thread;

class MyRunnable implements Runnable {
	
	@Override
	public void run() {
		for (int i = 0; i <= 200; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + i + "\t");
		}
	}
	
}

public class MyRunnableTest {

	public static void main(String[] args) {
		System.out.println("main start");
		
		Thread thread1 = new Thread(new MyRunnable());
		Thread thread2 = new Thread(new MyRunnable());
		
		thread1.start();
		thread2.start();
		
		System.out.println("main end");
	}

}
