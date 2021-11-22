package multithreading;


public class MultiThreadingExampl8
{

	public static void main(String[] args) throws Exception 
	{		
  
		Thread t1 = new Thread(() -> {
		
		for(int i=1;i<=5;i++)
		{
			System.out.println("Hi "+Thread.currentThread().getPriority());
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

	//t1.setPriority(1);   //setting priority to 1 that is minimum
	//t2.setPriority(10);  //setting priority to 10 that is maximum
	
	//You can also use inbuit constants to set priority
	
	//t2.setPriority(Thread.NORM_PRIORITY);  //You can also set priority to Normal. If you dont set any priority then by default, thread will get this priority
	
	t1.setPriority(Thread.MIN_PRIORITY);
	
	
	t2.setPriority(Thread.MAX_PRIORITY);
	
	
//	System.out.println(t1.getPriority());
//	System.out.println(t2.getPriority());
    t1.start();
    try {Thread.sleep(10);  } catch (Exception e) {e.printStackTrace();}
    t2.start();


    t1.join();  
    t2.join();

 
    
    System.out.println("Bye");
	}

}
