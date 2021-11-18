package OOPBasics;

class Calci1
{
    int num1;
	int num2;
	int result;
	
	
	/*
	 * 1. Constructor name is same as class name.
	 * 2. Constructor does not return anything
	 * 3. Whenever you create an object, the constructor is called automatically. 
	 * 
	*/
	
	public Calci1()
	{
		num1 =5;   //assigning the values 
		num2 =5;
	}
	
	
	/*
	 * We can have two constructors in same class but
	 * but signature should be different.
	 * 
	 * 
	 * 
	 */
	
	
	//public Calci1(){}  will throw error 
	
	public Calci1(int n)
	{
		num1 = n;
		num2 = n;
	}
	
	public Calci1(double d,float f)
	{
		num1 = (int)d;   //casting double value tp int
		num2 = (int)f;   //casting float value to int
	     
		//Casting is required as we are trying store double and float value into int.
	
	}
	
	
	
}



public class ConstructorExample2 {

	public static void main(String[] args) {
	
		/*
		 * Calling Default No argument constructor
		 */
		
		/*
		Calci1 obj = new Calci1();  // It will call default no argument constructor
		
		System.out.println(obj.num1);
		System.out.println(obj.num2);
		*/
		
		//----------------Type 2-----------------------------------------------------------
		
		/*
		 * Calling Constructor with one parameter
		*/
		
		/*
		Calci1 Obj1 = new Calci1(7); 
		System.out.println(Obj1.num1);
		System.out.println(Obj1.num2);
	    */
		
		/*
		 * 7 value is sent while calling ocnstructor 
	     * so it will check if there is any consructor defined which takes one integer argument.And calls that constructor.
		 * Here the value sent that is 7 will get stored into n
		 * And then we will assign n to num1 and num2.
		 *
		 */
		
		//---------------------Type 3---------------------------------------
		
		Calci1 Obj2 = new Calci1(7.5,8.0f);
		System.out.println(Obj2.num1);
		System.out.println(Obj2.num2);
	
	
	}

}
