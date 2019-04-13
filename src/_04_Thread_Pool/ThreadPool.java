package _04_Thread_Pool;

import java.util.concurrent.ConcurrentLinkedQueue;

public class ThreadPool {
	Thread[] threads;
	ConcurrentLinkedQueue<Task> queue;

	ThreadPool(int i) {
		queue = new ConcurrentLinkedQueue<Task>();
		threads = new Thread[i];
		for (int j = 0; j < threads.length; j++) {
			threads[j] = new Thread(new Worker(queue));
		}

	}

	public void start() {
		for (Thread thr : threads) {
			thr.start();
		}
		for (Thread thr : threads) {
			try {
				thr.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void addTask(Task t) {
		queue.add(t);

	}
}
