package practice;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Chapter20_3 {
	public static void main(String[] args) {
		Task task = new Task();
		ExecutorService pool = Executors.newSingleThreadExecutor();
		try {
			Future<Long> future = pool.submit(task);
			try {
				System.out.println("★スレッドの終了待ち");
				long sum = future.get();
				System.out.println("★計算完了=" + sum);
			} catch(InterruptedException | ExecutionException e) {
				e.printStackTrace();
			}
		} finally {
			pool.shutdown();
		}
	}
	
	static class Task implements Callable<Long>{
		@Override
		public Long call() throws Exception{
			long sum = 0;
			for (int i = 0; i < 10; i++) {
				sum += (i + 1);
				Thread.sleep(300);
				System.out.println("処理" + (i + 1) + "回目");
			}
			return sum;
		}
	}

}
