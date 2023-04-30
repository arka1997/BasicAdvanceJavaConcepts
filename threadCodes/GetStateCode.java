package threadCodes;

public class GetStateCode extends Thread {
	@Override
	public void run() {
		System.out.println("Test");
	}
	public static void main(String[] args) {
		GetStateCode g1 = new GetStateCode();
		
		//this will print "NEW" as new Thread is created here but not started yet
		System.out.println(g1.getState());//getState is a method of Thread for getting the current state of Thread,like, if it is a new Thread created OR running OR terminated.
		
		g1.start();//from here the THread will start its running, so "RUNNABLE" OR "Ready To Run"
		System.out.println(g1.getState());
		
		try {
			Thread.sleep(5000);//here sleep mode sets the current thread  to sleep or pause for 5 seconds.
		} catch (Exception e) {
			
		}
		
		//here at the end the lifespan of Thread ends and its "TERMINATED" or killed
		System.out.println(g1.getState());
	}

}
