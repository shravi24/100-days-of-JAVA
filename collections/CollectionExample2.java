package collections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionExample2 
{

	public static void main(String[] args) 
	{
	
		List values = new ArrayList();  //Creating a collection

		//Adding the  collection
		values.add(4); //Integer v = new Integer(4)
		values.add(6);
		values.add(8);
	
		values.add(2, 100);       //Can work with index number with List interface
		values.add("shraddha");   //Can add String data as well.
		values.add(8.09);  //Adding float data.
	
		System.out.println("Printing by simply using sysout");
		System.out.println(values);
		
		System.out.println("----------------------------------------");
		
		
		//Iterator fetches the values from Collection. Hence values.
		//iterator() method returns the object of Iterator interface.
		
//		Iterator i1 = values.iterator();
//		
//		while(i1.hasNext())
//		{
//			System.out.println("Value : "+i1.next());
//		}
	
	
	
	/*
	 * Since List interface cam work with index number, we can use normal for loop as well.
	 */
		System.out.println("Printing using For loop");
		for(int i=0;i<values.size();i++)
		{
			System.out.println("Value : "+values.get(i));
		}
	
		System.out.println("-----------------------------------------------");
	/*
	 * Using Enahnced for Loop
	 */
	
		System.out.println("Printing using ForEach loop");
		
		/*
		 * Type of element is Object not int,String :)
		 * And from where you are fetching : from values
		 */
		
		for(Object p : values)
		{
			System.out.println(p);
		}
	
	
	
	
	
	
	}

}
