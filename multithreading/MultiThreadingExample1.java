package multithreading;
import java.lang.Runtime;

//Create a thread class by extending Thread Class
class Hi extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Hi");
			
			
			//Thread.sleep(500);  //Error because Checked Exception need to handle it by using try catch or using throws declaration
			
			//Will wait for 500ms means 0.5 or half second and then prints the next output
			try {Thread.sleep(1000);  } catch (Exception e) {e.printStackTrace();}
		}
		
	}
}
class Hello extends Thread
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
public class MultiThreadingExample1 
{

	public static void main(String[] args) 
	{
		
	//System.out.println(Runtime.getRuntime().availableProcessors());

	Hi obj1 = new Hi();
	Hello obj2 = new Hello();
	
	/* 
	 * Without extending by thread class, this will first print Hi 5 times then Hello 5 times.
	 * I want to print Hi Hello One after the other. Then I need to use Multithreading concept.
	 * 
	 * Just by saying extends thread will not make it possible to run simultaneously.
	 * When you extend thread class, your class will become thread class and object becomes thread
     *  Using that object, we need to start the thread.
	 */
	
	obj1.start();
	
	/*
	 * If you are getting some overlapping between these outputs, then you can include
	 * Thread.sleep()
	 */
	try {Thread.sleep(10);  } catch (Exception e) {e.printStackTrace();}
	
	obj2.start();
	
	/*
	 *start always calls run method so whatever logic you write that should be within 
	 *run so In this example, I had made show method, but to achieve parallel execution methods
	 *from these two different classes Hi and Hello, i will rename that show method 
	 *to run so that whenever we start the thread it will call the run method automatically 
	 */
	
	
	/*
	 * obj1.show(); obj2.show();
	 */
		
	}

}
