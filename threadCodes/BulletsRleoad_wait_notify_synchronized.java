
package threadCodes;

class ThreadsStart extends Thread{
	public void gunFire(int bullets) {
		
		if(bullets == 0) {
			try {
				System.out.println("Invoking wait Method to stop firing as bullets are 0 and ready to be reloaded");
				wait();
				System.out.println("The process is complete");
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		System.out.println(bullets+"Bullets remaining");
		bullets--;
	}
	public void gunReload(int bullets) {
		System.out.println("Reloading 50 bullets again");
		bullets += 50;
		System.out.println("Now resuming the fire again after Reloading");
		notify();
	}
	public void callNotify() {
		notify();
		
	}

}

public class BulletsRleoad_wait_notify_synchronized{
	
	public static void main(String[] args) {
		ThreadsStart b1 = new ThreadsStart();
		//1st Thread for firing bullet
		new Thread() {
			@Override
			public void run()
			{
				b1.gunFire(50);
			}
		}.start();
		//2nd Thread for Reloading the gun
		//creating an anonymous class but syntax is different as we are not implementing Interface.
		new Thread() {
			@Override
			public void run() {
				b1.gunReload(50);
				
			}
		}.start();
		
		//creating object of this class to call one method of this class
		ThreadsStart b2 = new ThreadsStart();
//		b2.callNotify();
		}
}
