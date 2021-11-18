/*To implement security, generally the class varaibles are made private.
 * so that it will be not be directly accessible.
 * It will be accessible through methods(getters and setters defined) in class
*/


//Encapsulation : Binding data with methods.
//It means that only way to access the data(class varaibles) is through methods for which we have to make data members/varaibles as private. Thus implementing security.
//The data members, class or methods which are not declared using any access modifiers i.e. default access modifier are accessible  within the same package only.

package OOPConcepts;
class Student
{
	private int rollno;      //int varaible by default value is zero
	private String name;     //string variable value by default is null
	
	//You can directly generate getters and setters : right click ->source ->generate getters and setters.

	public int getRollno() 
	{
		return rollno;
	}
	public void setRollno(int rollno) 
	{
		System.out.println("User is accessing the value");            //can maintain logfile.
		this.rollno = rollno;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	
	/*
	 * //Getters and setters 
	 * public void setRollno(int n) //set the value of rollno
	 * { 
	 * rollno = n; 
	 * }
	 * 
	 * public int getRollno() 
	 * { 
	 * return rollno; 
	 * }
	 */
	
}
public class EnacapsulationExample1 
{

	public static void main(String[] args) 
	{
		
		Student s1 = new Student(); 
		
		/*
		 * s1.name = "Jack"; //directly accessible if  private access specifier is not specified. s1.rollno = 89;
		 * System.out.println(s1.name+" "+s1.rollno);
		 * System.out.println("------------------------");
		 */
		
		//After using getters and setters
		
		s1.setRollno(90);  //setting the value : value which is passed while calling set method is catched by parameter defined in brackets , in this case n= 90 and later it get assigned to rollno within the method
		System.out.println(s1.getRollno());  //retrieving the value using get method and printing using System.Out.

		s1.setName("Ronaldo");
		System.out.println(s1.getName());
	}

}
