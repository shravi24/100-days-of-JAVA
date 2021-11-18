package OOPBasics;
class Student
{
	int rollno;
	String name;
	
}

public class ArrayOfObjects {

	public static void main(String[] args) {
	
		Student s1= new Student();
		Student s2= new Student();
		Student s3= new Student();
		Student s4= new Student();
		
		//Above I have created 4 objects of class Student. 
		//Instead of above method I can make use of array of objects
		
		Student s[] = {s1,s2,s3,s4};
		Student a[] = new Student[4];  //This can also be done
		
		
		//Do practice on array of objects.
		
	}

}
 