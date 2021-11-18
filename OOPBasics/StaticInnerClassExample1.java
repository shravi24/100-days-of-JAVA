package OOPBasics;

class Outer2
{
	static int a;                               
    static public void show()                  
	{
		System.out.println("static method within outer class"); 
		System.out.println("*********************************************");
		
	}
    
    static class I2         //static inner class 
    {
    	public void display()
    	{
    		System.out.println("inside static   inner class calling the method display");
    		System.out.println("*********************************************");
    	}
    }
    
}
public class StaticInnerClassExample1 
{
	

	public static void main(String[] args) 
	{

		//Outer2 o2 = new Outer2();
		
		//o2.show(); //no need to create an object. As this show() method is static you can call using class name.
		
		Outer2.show();   
		
		
		
		//Outer2.I2 obj2 = o2.new I2(); //no need to call using object name can use class name instead.
		
		
		//outerclassname.innerclassname objectname = new outerclassname.innerclassname();
		
		Outer2.I2 obj2 = new Outer2.I2();
		obj2.display();
	
		
	
	}

}
