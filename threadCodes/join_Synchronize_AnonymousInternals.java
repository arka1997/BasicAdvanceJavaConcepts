package threadCodes;

public class join_Synchronize_AnonymousInternals {
	int balance = 0;
	
	
	public void account() {
		//Earlier in Runnable Interface we used to implement Runnable Interface first -> create class object for storing the run() method -> pass that object's address as argument to Thread Constructor,
		//Same way, Anonymous Class also implements Runnable Interface, and inside that class we override the incomplete run() method of Runnable, and pass the whole Anonymous class as an argument to Thread Constructor.Thus thread using Anonymous class is started.
		//1st Thread
		Thread t1 = new Thread( new Runnable(){  //here why we use new Runnable? Because here we create another anonymous class which implements runnable Interface and run method is also defined in it, now we create a thread object and pass these whole anonymous class as an argument to make thread know which class's run() method it has to start, as well as the add() method is also called inside it.
			@Override
			public void run() {
				add();
			}
		});//anonymous class is passed as an argument passed to the constructor of thread
		//Second Thread
		Thread t2 = new Thread( new Runnable() {
			@Override
			public void run() {
				sub();//if we don't write this keyword inside a non static method, then this keyword gets added automatically
			}
		});
		//after starting the thread
		t1.start();
		t2.start();
		//we now can join them
		//join is used to work in a synchronized manner, like thread1 executes for certain time, and thread2 starts executing from the place where thread1 has left.
		try {
			t1.join();
			t2.join();
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}
	public void add() {
		for(int i=0;i<1000;i++) {
			balance = this.balance + i;//here and for the first I haven't written this, but for the second I have. So, for the one which I haven't written, there compiler by default puts a this, to acces the global balance value
			System.out.println("1st thread");
		}
	}
	public void sub() {
		for(int i=0;i<1000;i++) {
			balance = this.balance - i;//here and for the first I haven't written this, but for the second I have. So, for the one which I haven't written, there compiler by default puts a this, to acces the global balance value
			System.out.println("2nd thread");
		}
	}
	
	public static void main(String[] args) {
		join_Synchronize_AnonymousInternals a1 = new join_Synchronize_AnonymousInternals();
		a1.account();
		
	}
}

