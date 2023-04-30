package threadCodes;

public class RunnableThreadDemo implements Runnable {
	@Override
	public void run() {//this is a ticket selling factory, now if two threads(boys) are booking tickets by calling this method, means same method is executed many times by different threads
		for(int i=0;i<1000;i++) {
			System.out.println("1st Thread");
		}
	}
	public static void main(String[] args) {
		RunnableThreadDemo r1 = new RunnableThreadDemo();
		Thread t1 = new Thread(r1);
		t1.start();
		RunnableThreadDemo r2 = new RunnableThreadDemo();//creating an object of child class. run() method is also loaded inside child class.Now, address of the object is passed as argument inside Thread constructor in next Line.
		Thread t2 = new Thread(r2);//here child class reference "r2" is send as argument to Thread class constructor to tell Thread that it has to start child class's run() method.
		t2.start();
		for(int i=0;i<1000;i++) {
			System.out.println("2nd Thread");
		}
	}
//	Question 1:when we click start() then stack is created for thread. Then what happens and how JVM starts the run()method of child class?
//	Qstn 2: When Thread sends the reference variable of the child's Object Address  to the Thread class constructor, then what happens internally?
}
