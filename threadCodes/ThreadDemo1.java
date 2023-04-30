package threadCodes;

public class ThreadDemo1 extends Thread{
	@Override
	public void run() {
		for(int i=0;i<1000;i++) {
			System.out.println("1st thread");
		}
	}
	public static void main(String[] args) {
		ThreadDemo1 t1 = new ThreadDemo1();
		t1.start();
try {
	t1.join();
} catch (Exception e) {
	// TODO: handle exception
}
		Thread t2 = new Thread();//for running the main thread, we have to create another thread and then start main() Thread
		t2.start();
		for(int i=0;i<1000;i++) {
			System.out.println("2nd thread");
		}
	}

}
