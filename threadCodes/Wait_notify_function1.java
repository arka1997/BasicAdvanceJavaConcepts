package threadCodes;

public class Wait_notify_function1{

	public static void main(String[] args) {
		Wait_notify_function2 a1 = new Wait_notify_function2();//here we create an object of that class which extends Thread and call reference variable
		a1.start();
		synchronized(a1){
			try {
				a1.wait();//this methods makes the main() thread to wait and lets the other execute synchronize block completely.
						  //And then at the end we use notify() method to resume the main() Thread, then main() Thread executes and prints "total".
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println(a1.total);
	}

}
// class Wait_notify_func extends Thread{
//	int total = 0;
//	public synchronized void run() {
//		for(int i=0;i<20;i++) {
//			total += 10;
//		}
//		notify();//global function that belongs to Object class, and it's like a lock, suppose 1st Thread which is the main thread started executing but soon it was paused using wait() function.And Thread 2 starts executing this total block, and then when loop ends, then it goes to the notify() block and hands over the key to synchronise block. Which then allows the main Thread() to complete it's execution and print the total value  
//	}
//}


