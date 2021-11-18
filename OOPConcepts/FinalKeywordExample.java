/*
 * When you use final with :
 * 1. Variable : It becomes constant.You can assign the value to final variable only once.
 * 2. Method   : Cannot overide the final method
 * 3. Class    : Final class cannot be extended.
*/



package OOPConcepts;

final class P
{
	//int i =0;
	
	final int i =0;  //constant
	
	final int DAY;
	
	public P()
	{
		// i =10;  //Initial value of i is zero.changing the value of i. Allowed until i variable is not declared using final modifier.
		
		DAY =10;   //Assigning the value to DAY final variable inside the constructor
		
		//DAY = 12;  //Cannot be assigned twice
	}	
	
	public final void show()
	{
		//DAY =9;  //Error : Cannot assign the value to final variable inside the method.
	    System.out.println("Final method show()");
	}

	
}

/*//P1 cannot extend P as P is final class.
 * class P1 extends P {
 * 
 * }
 */

class U
{
	public final void show()
	{
		System.out.println("Final method in U Class");
	}
}

class U1 extends U
{
	/*//Cannot oevrride final method
	 * public void show() {
	 * 
	 * }
	 */

}



public class FinalKeywordExample 
{

	
	public static void main(String[] args)
	{
		
		P obj1 = new P();
		
		System.out.println(obj1.i);   
		System.out.println(obj1.DAY);
		
		

	}

}
