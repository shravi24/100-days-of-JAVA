/*
 * Collection is a group of objects.
*/

package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionExample1 
{

	public static void main(String[] args) 
	{
		/*
		 * Creating a reference of Collection interface 
		 * and Creating an object of ArrayList class which
		 * implements Collection interface.
		 */ 
		Collection values = new ArrayList();
		
		/*
		 * Adding the values to Collection using add method
		 * add method is present in Collection interface.
		 */
		values.add(4);
		values.add(6);
		values.add(8);
		
		/*Simple way to print all the values*/
		//System.out.println(values);
		
		System.out.println("***********************************");
		
		/*Printing indiviual values one by one
		 *In array, we were using index number.
		 *But Collection does not work with indexnumber.
		 *Hence, for this you can use Iterator, which fetches 
		 *value from Collection one by one.
		 */
		 
	
		
		Iterator it = values.iterator();
		
		/*Here interface name is Iterator and method name
		 * to print values one by one is also iterator().
		 * The difference is that interface starts with capital I
		 * and method starts with lowercase i 
		 */
		
		System.out.println(it.next()); //next() will fetch the next value.
     	System.out.println(it.next());
		System.out.println(it.next());
		//System.out.println(it.next());  //Gives exception. Because there are only three elements in Collection
		
		
		/*
		 * Above can be the problem. How do we knoe that Collection has this amount of 
		 * elements.Hence use while() loop instead.
		 */
		
		System.out.println("***********************************");
		
		while(it.hasNext())    //hasNext() to detect if we have next element or not . This method will return true or false.
		{
			System.out.println(it.next());
		}


		
		
	}

}
