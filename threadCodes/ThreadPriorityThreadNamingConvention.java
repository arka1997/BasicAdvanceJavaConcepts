package threadCodes;

public class ThreadPriorityThreadNamingConvention extends Thread{
	
	String name;
	ThreadPriorityThreadNamingConvention(String name){
		this.name = name;
	}
	
	@Override
	public void run() {
//		depending on which constructor is called, the value is set.
		System.out.println(this.name);
	}
	
	public static void main(String[] args) {
		//creating first Thread
		ThreadPriorityThreadNamingConvention t1 = new ThreadPriorityThreadNamingConvention("Debanjan");

		//Creating 2nd Thread
		ThreadPriorityThreadNamingConvention t2 = new ThreadPriorityThreadNamingConvention("Bisu");
		
		t1.setPriority(1);//setting priority to 1st Thread
		t2.setPriority(10);//setting priority to 2nd Thread
		
		//Now the Thread with highest priority can send a request to Thread Scheduler first compared to other Threads, but still it depends on the Thread Scheduler (with 90% chance) if it will accept the request or execute the other Threads
		System.out.println("Priority of 1st Thread: "+t1.getPriority());
		System.out.println("Priority of 2nd Thread: "+t2.getPriority());
		
		//Giving new names to the Threads
		t1.setName("MyThread1");
		t2.setName("MyThread2");
		System.out.println("Name of 1sT Thread: "+t1.getName());
		System.out.println("Name of 2nd Thread: "+t2.getName());
		
		t1.start();
		t2.start();
	}

}
