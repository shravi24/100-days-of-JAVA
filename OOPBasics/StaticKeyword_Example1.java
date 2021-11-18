package OOPBasics;
class Employee
{
	int eid;
	int salary;
	// String ceo;
	
	static String ceo;
	
	public Employee()
	{
		System.out.println("in constructor");
		eid =1;
		salary =1;
		
		
		/*
		 * class is loaded in memory only once ..static variables are loaded in memory
		 * before object creation but this costructor is called everytime when object is
		 * created so everytim this static variable value is assigned to larry in this
		 * case but there is no need this .Instead we can create static block that's
		 * executed before object creation
		 */		
		
		//ceo ="larry";
	}
	
	
	static
	{
		System.out.println("in static");
		ceo ="larry";
	}
	
	public void show()
	{
		System.out.println(eid+" : "+salary+" : "+ceo);
	}
}
public class StaticKeyword_Example1 {

	static int i;
	public static void main(String[] args) {
	
	

		// i=9;   //throw an error cannot make refernce from static method to non-static variables 
		
		//Making i variable static
		System.out.println(StaticKeyword_Example1.i);   // can be accessed using class name 
		i=9;
		System.out.println(i);  // can be accessed direcly as well becacue its in same class and we are accessing from static method
		System.out.println("**************");
		Employee shraddha = new Employee();
		Employee shreya = new Employee();
		System.out.println("**************");
		shraddha.show();
		shreya.show();
		
		
		/*
		 * shraddha and shreya works in same company.so ceo will be same
		 * Before creatng an object, class is loaded in memory.
		 * when you create an object, memory is allocated for that object on heap.
		 * How much memory is defined by constructor of class.
		 * When you load the class, there is special memory called class loader 
		 * ceo for both is same right ? For example If you change the ceo for object shreya then 
		 * it will change for only shreya object not for shraddha object.
		 * If you want certain variables that are not object specific,that is the variable should be shared
		 * by all the instances/objects of the class so that if you make change using one object say shraddha 
		 * it will also reflect on other object shreya , if you want like this then make the variable as static.
		 * 
		 */
		
		/*
		Employee shraddha = new Employee(); //Object1 : shraddha
	    shraddha.eid =1;
	    shraddha.salary = 10000000;
	    shraddha.ceo ="david";     
	    
		Employee shreya = new Employee();  //Object2 : shreya
		shreya.eid =2;
		shreya.salary = 10000;
		shreya.ceo ="david";
		
		shraddha.ceo ="sheldon";
		*/
		
		//Making ceo as static varible 
		
		
		
		/*
		Employee shraddha = new Employee();
	    shraddha.eid =1;
	    shraddha.salary = 10000000;
	    
	    //You can access static variable by two methods :
	    
	    //1. By using object of the class.
	    shraddha.ceo ="david";
	    
	   //2. By using class name.
	    Employee.ceo ="danis";
	 
		Employee shreya = new Employee();
		shreya.eid =2;
		shreya.salary = 10000;
		shreya.ceo ="david";
		
		shraddha.ceo ="sheldon";
		*/

		
		
	}

}
