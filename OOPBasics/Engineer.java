package OOPBasics;

import com.app.StudentExample;

public class Engineer extends  StudentExample
{
	public void show()
	{
		marks =80;  //protected members can be accessible 
		
		age=30;      //error
	}
}


