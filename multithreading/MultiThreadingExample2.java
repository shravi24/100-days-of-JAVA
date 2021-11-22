package multithreading;

/*
 * Runnable is a Functional Interface.
 * That's why it has only one method that is run
 */
class Hi1 implements Runnable
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Hi");
			try {Thread.sleep(1000);  } catch (Exception e) {e.printStackTrace();}
		}
		
	}
}
class Hello1 implements Runnable
{
	public void run()
	{
		
		for(int i=1;i<=5;i++)
		{
			System.out.println("Hello");
			try {Thread.sleep(1000);  } catch (Exception e) {e.printStackTrace();}
		}
	}
}
public class MultiThreadingExample2 
{

	public static void main(String[] args) 
	{
		
	
//	Hi1 obj1 = new Hi1();
//	Hello1 obj2 = new Hello1();
	
	/*Above can be written as :*/		
	Runnable obj1 = new Hi1();
	Runnable obj2 = new Hello1();
		
		
	/*Above is valid because classes Hi and Hello are implementing Runnable interface
	 * And you can create reference of interface (in this case Runnable) and object of class.
	 */
	
	
	/*
	 * Here We are creating a thread class by implementing Runnable interface
	 * The start method is no there in our own class, not there in Runnable interface
	 * so from where it will get start method ?
	 */
	//obj1.start(); error because Runnable interface does not have start method.
	//obj2.start(); error because Runnable interface does not have start method.
	
	
	//Create object of Thread class as Thread class contains start method.
	
	/* If you dont pass obj1 and obj2 while creating object of Thread class,
	 * then when you do t1.start() it will call run method of Thread class.
	 * But we want to call the run method of our class :
	 * Hence we need to link obj1 and obj2 with Thread class objects.
	 * by passing obj1 and obj2 while creating objects of Thread class.
	 * obj1 and obj2 are objects of Runnable. 
	 * Why they are called objects of Runnable ?
	 * Because your class Hi and Hello are implementing Runnable interface.
	 * so these objects are of Hi and Hello class that means Runnable interface.
	 * 
	 */
	Thread t1 = new Thread(obj1);
	
	Thread t2 = new Thread(obj2);
	
	
	
	
    t1.start();
    try {Thread.sleep(10);  } catch (Exception e) {e.printStackTrace();}
    t2.start();
		
	}

}
