package _04_Thread_Pool;

import java.util.concurrent.ConcurrentLinkedQueue;

public class Worker implements Runnable {
	ConcurrentLinkedQueue<Task> queue;

	Worker(ConcurrentLinkedQueue<Task> queue) {
		this.queue = queue;
	}

	public void run() {
		synchronized (queue) {
			while (queue.size() > 0) {
				queue.remove().perform();
			}
		}
	}

}