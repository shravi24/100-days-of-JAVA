package multithreading;

public class MultiThreadingExample5
{

	public static void main(String[] args) 
	{		
//		Runnable obj1 = () -> {
//				
//				for(int i=1;i<=5;i++)
//				{
//					System.out.println("Hi");
//					try {Thread.sleep(1000);  } catch (Exception e) {e.printStackTrace();}
//				}
//			
//		};
//		
//		
//	
//		Runnable obj2 = () -> {
//			
//			for(int i=1;i<=5;i++)
//			{
//				System.out.println("Hello");
//				try {Thread.sleep(1000);  } catch (Exception e) {e.printStackTrace();}
//			}
//		
//	};
//		
		
		/*
		 * Runnable interface has only one abstract method means it is Functional Interface. 
         * so you can implement Lambda Expression
		 * You can further reduce by directly passing this anonymous class implementation while creating object of thread.
		 * 
		*/

	
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
		
	}

}
