package threadCodes;

//here we prove that two threads if operating on same module then the second thread starts from that place where first thread stopped executing,
//so thus sir's example of making tea is proved. Where tea is our same module and thread are two boys operating on the same module(tea).
//Now if 1st Thread started boiling the water and went two sleep mode-> the 2nd Thread adds tea leaves and sugar and goes to sleep 
//-> Now 1st Thread wakes and adds milk to it and again sleeps. So, in this way, where 1st thread stopped working, 2nd Thread starts from there.
public class TeaMakingThreadsOperatesSameModulejoinAdd_Synchronised {
	int balance = 0;
	public void threadMethod() {
		Thread t1 = new Thread(new Runnable(){
			@Override
			public void run(){
				add();
			}
		});
		Thread t2 = new Thread(new Runnable(){
			@Override
			public void run(){
				add();
			}
		});
		t1.start();
		t2.start();
		try {
			t1.join();
		} catch (Exception e) {
			
		}
	}
	public synchronized void add() {
		for(int i=0;i<20;i++) {
			balance += 100;
			System.out.println(balance);
		}
	}
	public static void main(String[] args) {
		TeaMakingThreadsOperatesSameModulejoinAdd_Synchronised j1 = new TeaMakingThreadsOperatesSameModulejoinAdd_Synchronised();
		j1.threadMethod();

	}

}
