package threadCodes;

public class JoinDemo extends Thread{
	public void run() {
		for(int i=0;i<100;i++) {
			System.out.println("1st thread");
		}
	}
	public static void main(String[] args) {
		JoinDemo t1 = new JoinDemo();
		t1.start();
		
		try {
			//so this join() method is used with threads to set the execution of threads in a sorted order like if we write "t1.join() ->"\n" -> t2.join() -> "\n" -> t3.join()", then this means we set thread to run in this order, first t1 Thread will run, then t2 Thread and then t3 Thread.
			t1.join();//this join() thread will force t1 to execute first, and then second thread will start to execute after waiting
		}catch(Exception e) {
			System.out.println(e);
		}
		for(int j=0;j<1000;j++) {
			System.out.println("2nd Thread");
		}
	}
}
//join() helps to decide which thread to run first, if we write t1.join(), then t1 thread will run first and then t2 thread runs.
//synchronize keyword means, suppose there are two threads, out of that any one of the thread will enter the synchronize block. we cannot predict which one will enter, but that thread which enters first has to execute the whole synchronize code first upto the end. then the second thread can start.