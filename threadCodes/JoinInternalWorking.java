package threadCodes;

		// Example illustrates multiple threads are executing
		// on the same Object at same time without synchronization.

		class Line
		{
			// if multiple threads(trains) will try to
			// access this unsynchronized method,
			// they all will get it. So there is chance
			// that Object's state will be corrupted.
			public void  getLine()
			{
				for (int i = 0; i < 3000; i++)
				{
		  			System.out.println(Thread.currentThread().getName());//printing which Thread is currently running as a proof of join. we see Thread-1 runs first and then Thread-0
					
				}
			}
		}

		class Train extends Thread
		{
			// reference to Line's Object.
			Line line;
			//here initialising the object address of "Line" class inside Constructor. The address is received from "JoinInternalWorking" class as an argument from "Train" Constructor
			Train(Line line)
			{
				this.line = line;
			}

			@Override
			public void run()
			{
				line.getLine();
			}
		}

		class JoinInternalWorking
		{
			public static void main(String[] args)
			{
				// Object of Line class that is shared
				// among the threads.
				Line obj = new Line();

				// creating the threads that are
				// sharing the same Object.
				Train train1 = new Train(obj);
				Train train2 = new Train(obj);

				// threads start their execution.
				train1.start();
				train2.start();
		      try{
		    	  //here we force the train2 Thread to start first. And after executing some lines, "train2" threads gets paused and then "train1" starts executing
		      	  train2.join();
		      }catch(Exception e){
		      }
			}
		}