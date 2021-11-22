package multithreading;


public class MultiThreadingExample7
{

	public static void main(String[] args) throws Exception 
	{		
  
		
		Thread t1 = new Thread(() -> {
		
		for(int i=1;i<=5;i++)
		{
			System.out.println("Hi");
			try {Thread.sleep(1000);  } catch (Exception e) {e.printStackTrace();}
		}
	
},"Hi-Thread");
	
	Thread t2 = new Thread(() -> {
		
		for(int i=1;i<=5;i++)
		{
			System.out.println("Hello");
			try {Thread.sleep(1000);  } catch (Exception e) {e.printStackTrace();}
		}
	
},"Hello-Thread");
	
	//t1.setName("Hi Thread");
	//t2.setName("Hello Thread");
	System.out.println(t1.getName());
	System.out.println(t2.getName());
	
	System.out.println(t1.isAlive());  //Thread is not started. Hence isAlive() method output will be false.
    t1.start();
    try {Thread.sleep(10);  } catch (Exception e) {e.printStackTrace();}
    t2.start();
	
    System.out.println(t1.isAlive());  //Thread is started Hence isAlive() method output will be true
    t1.join();  
    t2.join();
    System.out.println(t1.isAlive());   //Thread job is done, it will be dead. isAlive() method output will be false.
    System.out.println("Bye");
	}

}
