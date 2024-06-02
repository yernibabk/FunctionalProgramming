package learning.threads;

import java.util.stream.IntStream;

public class FP01Threads {

	public static void main(String[] args) {
		
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				IntStream.range(0, 10000).forEach(i -> System.out.println(Thread.currentThread().getId()+ ":" + i + ":"+Thread.currentThread().getName()));
				
			}
		};
		
		
		Runnable runnable2 = () -> IntStream.range(0, 10000).forEach(i -> System.out.println(Thread.currentThread().getId()+ ":" + i + ":"+Thread.currentThread().getName()));

		
		Thread thread = new Thread(runnable2);
		thread.setName("1st Thread");
		thread.start();
		
		Thread thread1 = new Thread(runnable2);
		thread1.setName("2st Thread");
		thread1.start();
		
		Thread thread2 = new Thread(runnable2);
		thread2.setName("3st Thread");
		thread2.start();
		
//		Thread thread = new Thread(runnable);
//		thread.setName("1st Thread");
//		thread.start();
//		
//		Thread thread1 = new Thread(runnable);
//		thread1.setName("2st Thread");
//		thread1.start();
//		
//		Thread thread2 = new Thread(runnable);
//		thread2.setName("3st Thread");
//		thread2.start();
	}

}
