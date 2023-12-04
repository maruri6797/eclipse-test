package practice;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Chapter20_Ex {
	public static void main(String[] args) {
		Counter counter = new Counter();
		Task[] tasks = {
				new Task(counter),
				new Task(counter),
				new Task(counter),
				new Task(counter),
				new Task(counter),};
		Future<?>[] futures = new Future<?>[tasks.length];
		ExecutorService pool = Executors.newFixedThreadPool(tasks.length);
		try {
			for(int i = 0; i < tasks.length; i++) {
				futures[i] = pool.submit(tasks[i]);
			}
			for(Future<?> future : futures) {
				future.get();
			}
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
		pool.shutdown();
		System.out.println("結果＝" + counter.count);
	}
	
	static class Task implements Callable<Void>{
		Counter counter;
		public Task(Counter counter) {
			this.counter = counter;
		}
		
		@Override
		public Void call() throws Exception{
			System.out.println("start threadName = " + Thread.currentThread().getName());
			for (int i = 0; i < 10; i++) {
				Thread.sleep(50);
				counter.add(1);
			}
			System.out.println("end threadName = " + Thread.currentThread().getName());
			return null;
		}
	}
	
//	 スレッドセーフではない実装
	static class Counter {
		private long count = 0;

		public void add(long i) {
//			System.out.println("足し算をします threadName = " + Thread.currentThread().getName());
			count += i;
		}

		public void mul(long i) {
//			System.out.println("かけ算をします threadName = " + Thread.currentThread().getName());
			count *= i;
		}
	}

// スレッドセーフにした実装
//	static class Counter{
//		private long count = 0;
//		synchronized public void add(long i) {
//			count += i;
//		}
//		synchronized public void mul(long i) {
//			count *= i;
//		}
//	}
}
