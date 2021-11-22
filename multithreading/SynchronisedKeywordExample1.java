package multithreading;
class Counter
{
	int count; 
	
	 public synchronized void increment()
	{
		count++;
	}
}
public class SynchronisedKeywordExample1 
{

	public static void main(String[] args) throws Exception 
	{
		
		Counter c = new Counter();
		
	    Thread t1 = new Thread(new Runnable()
	    		{
	    			public void run()
	    			{
	    				for(int i=1;i<=1000;i++)
	    				{
	    					c.increment();
	    				}
	    			}
	    	
	    	
	    		} );
		
	    
	      
	      Thread t2 = new Thread(new Runnable()
  		{
  			public void run()
  			{
  				for(int i=1;i<=1000;i++)
  				{
  					c.increment();
  				}
  			}
  	
  	
  		} );
	      
	      /*
	       * If you dont use join() then main thread will execute the next statement that is it will print the count value 
	       * so you will not get correct value, hence join() method is used so that main thread will wait until
	       * t1 thread executes, and then it will print the count value. 
	       */
	
	      
	      t1.start(); 
	      t2.start(); 
		    
	      /*
	       * Now we have two threads which will run for 1000 times each and
	       * we should get count value as 2000.
	       * But we are not getting it. Why ?
	       * It's because for some time t1 and t2 are accessing the method at the same time so we did not get correct output of 2000.
	       * means there should be something due to which when one thread is accssing method other thread should not access it.
	       * 
	       * So we need to make use of Synchronized keyword to make method or class, thread safe that means when one thread is executing
	       * one method, other thread cannot execute 
	       * 
	       */
	      t1.join();
          t2.join();

		 System.out.println("Count : "+c.count);

	}

}
