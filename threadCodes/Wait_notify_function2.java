package threadCodes;

public class Wait_notify_function2 extends Thread{
		int total = 0;
		public synchronized void run() {
			for(int i=0;i<20;i++) {
				total += 10;
			}
			notify();//global function that belongs to Object class, and it's like a lock, suppose 1st Thread which is the main thread started executing but soon it was paused using wait() function.And Thread 2 starts executing this total block, and then when loop ends, then it goes to the notify() block and hands over the key to synchronise block. Which then allows the main Thread() to complete it's execution and print the total value  
		}
}
