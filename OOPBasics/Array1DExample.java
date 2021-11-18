package OOPBasics;

public class Array1DExample
{
	public static void main(String arags[]) 
	{
		//array of integers
		//int nums[] = new int[];  //Error. Array size has to be mentioned
		
		int nums[] = new int[4];  //memory allocation for 4 elements on heap
	
	    System.out.println("By default array value is "+nums[2]); // bydefault array elements value is zero.
	
	    //Assigning values to array elements
	    
	    nums[0]=10;
	    nums[1]=10;
	    nums[2]=10;
	    nums[3]=10;
	    
	    //We can change the value after assigning
	    nums[2]=90;
	    System.out.println(nums[2]);
	    
	    //Array index out of bound exception
	    //nums[4]=8; //error cannot assign 
	    //System.out.println(nums[4]); //error this will give error as array sizs is defined as 4 so you can store from index 0 to index 3 total 4. but index 4 will not come under that.  
	
	    System.out.println("Printing the 1-D array elements using for loop");
	    for(int i=0;i<4;i++)
	    {
	    	System.out.println(nums[i]);
	    	
	    	//System.out.println("nums["+i+"]"+": "+nums[i]); //can print like this 
	    }
	    
	    //if you know the array elements, you can directly define the array values at the time of declaration
	    int nums1[] = {8,3,2,1};
	    System.out.println("***********");
	    for(int i=0;i<4;i++)
	    {
	    	//System.out.println(nums1[i]);
	    	
	    	System.out.println("nums1["+i+"]"+": "+nums1[i]); //can print like this 
	    }
	    
	    
	    
	    
	}

}
