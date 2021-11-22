package multithreading;


public class MultiThreadingExample6
{

	public static void main(String[] args) throws Exception 
	{		
  
		Thread t1 = new Thread(() -> {
		
		for(int i=1;i<=5;i++)
		{
			System.out.println("Hi");
			try {Thread.sleep(1000);  } catch (Exception e) {e.printStackTrace();}
		}
	
});
	
	Thread t2 = new Thread(() -> {
		
		for(int i=1;i<=5;i++)
		{
			System.out.println("Hello");
			try {Thread.sleep(1000);  } catch (Exception e) {e.printStackTrace();}
		}
	
});
	
	
	
	
    t1.start();
    try {Thread.sleep(10);  } catch (Exception e) {e.printStackTrace();}
    t2.start();
		
    
    /*isAlive() method will detect if thread is active or dead*/
    System.out.println(t1.isAlive());
    System.out.println(t2.isAlive());
    
    
    
    /*
     * join() method will make sure that one thread wait until other thread is executing.
     * When t1 and t2 are done with their job, they will combine with main thread.
       And this join is waiting for that particular poin.
     * it will execute next statement and that is printing bye.
     * 
     */
    t1.join();  //join() method throws exception hence adding throws declaration
    t2.join();
    
    /*
     * Once your thread job is done, it will be dead.
     * so you will get false as ouput when you check thread status using isAlive() method
     */
    System.out.println(t1.isAlive());
    System.out.println(t2.isAlive());
    
    System.out.println("Bye");
	}

}
