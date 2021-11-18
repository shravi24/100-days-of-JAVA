package OOPBasics;


class Outer
{
	int a;                               //member variable
    public void show()                   //member method
	{
		System.out.println("Method within outer class"); 
		System.out.println("*********************************************");
		
	}
    
    class I1         //inner class      //member class
    {
    	public void display()
    	{
    		System.out.println("inside member inner class calling the method display");
    		System.out.println("*********************************************");
    	}
    }
    
}
public class MemberInnerClassExample1 
{
	

	public static void main(String[] args) 
	{

		Outer o1 = new Outer();
		
		o1.show();
		
		//If you try to create an object of inner class like this, it will thrpw an error.
		//I1 obj1 = new I1();  //error
		
		//Inner class i1 is within class outer so we will create of inner class like this and then call the method
	
		Outer.I1 obj1 = o1.new I1();
		obj1.display();
	
		
	
	}

}
