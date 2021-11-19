/* Taking input from user using BufferedReader class
 * 
 * To do this three steps :
 * from where you are taking user input : 
 * How
 * 
 * 
 * 
 * 
 */
	   



package inputandoutput;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class InputFromUserExample2 
{

	public static void main(String[] args) throws Exception
	{
	   System.out.println("Enter input");
	   
	   
	   InputStreamReader i1 = new InputStreamReader(System.in);  //Passing the object of inputstream and converting it into stream

	   BufferedReader br = new BufferedReader(i1);  //Passing InputStreamReader object into buffer
	   
	   /*
	    * You can write above two lines using a single line
	    */
	   
	   BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
	   
	   //And then using BufferedReader object, Take input from user
	   
	   /*
	    *  readLine returns String but you are storing it in int so either you can change the datatype of n1  from
	    *  int to String OR you can typecast it using parseInt method. as parseInt Method is a static method 
	    *  we need to call it using a class Integer. Because parseInt is method declared in Integer class.
	
	    */
	   int n1 = Integer.parseInt(br1.readLine());  
	   System.out.println(n1);
	   /*
	    * if you give any number as input for example :  45
	    * it will be taken as string like this "45" and then using parseInt method is converted into int like this 45
	    * 
	    */

}
}