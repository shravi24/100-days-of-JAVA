package InterfaceExample;


interface Demo2
{
	int num=9;
	
	void abc();         
	
	
	static void show()     
	{
		System.out.println("in xyz method from Demo2");
	}
}

class DemoImp2 implements Demo2
{
	public void abc()
	{
		//num=10; // Error By default the variables inside the interface are final.Cannot change the value once assigned
	}
	
}
public class StaticMethodInterfaceExample
{

	public static void main(String[] args) 
	{
		Demo2.show();       //Static method is called using interface name. No need to have object
		
		

	}

}
