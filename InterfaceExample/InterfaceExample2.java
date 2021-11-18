/*
 The first way to create an object of interface is by creating a class 
 that implements interface and then you create an object of this class and 
 then call the methods using object. The second way is by using anonymous inner classes.
*/

package InterfaceExample;



interface Abc
{
	void show();
}


//class Implimenter implements Abc
//{
//	public void show()
//	{
//		System.err.println("Hey there");
//	}
//}
public class InterfaceExample2 
{

	public static void main(String[] args) 
	{
		
//		Abc obj = new Implimenter();  //obj
//		
//		obj.show();
		
		/*
		 * You cannot create an object of interface. So the first way was to create a another class 
		 * and override the method. 
		 * But this class only purpose is to override the method. Then in this case we can use anonymous classes.
		*/
		
		Abc obj = new Abc()
				{
			      public void show()
			         {
				         System.err.println("Hey there");
			         }
				};
		
	    obj.show();
		
		
	}

}
