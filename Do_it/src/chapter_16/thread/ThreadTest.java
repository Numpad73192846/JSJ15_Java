package chapter_16.thread;

/**
 * 스레드 구현 방법1
 * : Thread 클래스 상속하기
 */
class MyThread extends Thread {
	
	/**
	 * 스레드가 실행할 코드를 정의
	 * : MyThread라는 스레드를 객체로 생성하여 start() 메소드 호출 시, 실행할 코드를 정의한다.
	 */
	public void run() {
		
		// 200번 반복하며 현재 점유하고 있는 스레드를 확인
		for (int i = 0; i <= 200; i++) {
			System.out.print(Thread.currentThread().getName() + ":" + i + "\t");
		}
		
	}
	
}

public class ThreadTest {

	public static void main(String[] args) {
		// 현재 실행 중인 메인 스레드 정보 출력
		System.out.println(Thread.currentThread());
		
		// 새로운 스레드 1
		MyThread thread1 = new MyThread();
		// 새로운 스레드 1이 생성되어 run() 메소드를 실행
		thread1.start();
		
		// 새로운 스레드 2
		MyThread thread2 = new MyThread();
		// 새로운 스레드 2가 생성되어 run() 메소드를 실행
		thread2.start();
		
		/*
		 * 스레드는 동시에 수행되는 것처럼 보이지만,
		 * 실제로는 CPU가 아주 빠른 속도로 스레드를 교체하면서 명령어 처리를 수행한다.
		 * *CPU는 한 시점에서 하나의 스레드만 실행할 수 있다.
		 * 
		 * 시분할 처리:	CPU
		 * 병렬 처리:	GPU
		 */
	}
	
}
