package basics;

public class Variables {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        // int 1var =9; //error variable name cannot start with number.
        int var1 =9; //valid You can place number anywhere within variable name except start.
		System.out.println(var1);
        
        int _1$a =900000000; //Variable name can start with undercore.
    	int $var2 =70;       //Variable name can start with dollar.
		System.out.println(_1$a+" "+$var2);
        
		//int &var3 =8;      //Special characters like & is not allowed.
        
        
		double d1 = 5; //implicit Conversion. 5 is integer value stored in double format . O/P : 5.0
		System.out.println(d1);
		
	    //int k =5.6;   //throw error. Will need Explicit Conversion
		int k = (int)5.6;   //Explicit Conversion
		System.out.println(k);
		
		//long var = 500000000000000;   //throw error
	    long var4 = 500000000000000l;  //valid for storing big integer value use long data type .remember to mention l at the end 
		System.out.println(var4);
		
		
		
		int a = 'a';             //can store character value .Will give ASCII code for character a as the output
		char b = 89;             //can store integer  value in character variable .Will give ASCII value for integer a as the output
		System.out.println(a);   //97 -ASCII value for a 
		System.out.println(b);   // Y - ASCII code for 89
		
		
		
	}

}
