package multithreading;

public class MultiThreadingExample4 
{

	public static void main(String[] args) 
	{

//	Runnable obj1 = new Runnable()
//			{
//		public void run()
//		{
//			for(int i=1;i<=5;i++)
//			{
//				System.out.println("Hi");
//				try {Thread.sleep(1000);  } catch (Exception e) {e.printStackTrace();}
//			}
//			
//		}};
		
		/* Runnable interface has only one abstract method means it is Functional Interface.  
		   so you can implement Lambda Expression
		 */
		
		Runnable obj1 = () -> {
				
				for(int i=1;i<=5;i++)
				{
					System.out.println("Hi");
					try {Thread.sleep(1000);  } catch (Exception e) {e.printStackTrace();}
				}
			
		};
		
		
		
//		Runnable obj2 = new Runnable() {
//			public void run()
//			{
//				
//				for(int i=1;i<=5;i++)
//				{
//					System.out.println("Hello");
//					try {Thread.sleep(1000);  } catch (Exception e) {e.printStackTrace();}
//				}
//			}
//		};
//		
		
		Runnable obj2 = () -> {
			
			for(int i=1;i<=5;i++)
			{
				System.out.println("Hello");
				try {Thread.sleep(1000);  } catch (Exception e) {e.printStackTrace();}
			}
		
	};
		
		
			

	
	Thread t1 = new Thread(obj1);
	
	Thread t2 = new Thread(obj2);
	
	
	
	
    t1.start();
    try {Thread.sleep(10);  } catch (Exception e) {e.printStackTrace();}
    t2.start();
		
	}

}
