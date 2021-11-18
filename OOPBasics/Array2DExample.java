package OOPBasics;

public class Array2DExample {

	public static void main(String[] args) {
		// instead of creating 4 separate variables, We have used 1array of 4 variables
		int a[] = { 1, 2, 3, 4 };

		int b[] = { 5, 6, 7, 8 };

		int c[] = { 5, 6, 7, 8 };

		// Instead of creating three separate can we create a one big array ?
		// YES : That's 2D array

		int d[][] = { 
				          { 1, 2, 3, 4 }, 
				          { 2, 4, 6, 8 }, 
				          { 5, 6, 7, 8 },

		            };

		// Printing 2D Array

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(" " + d[i][j]);
			}

			System.out.println();

		}
	
	    //You can also access one specific element.
		System.out.println("*********************");
		System.out.println(d[1][2]);
	
	    //IN 2D ARRAY, YOU CAN HAVE ARRAYS OF SAME SIZE.
		
		int d1[][] = { 
		          { 1, 2, 3 }, 
		          { 2, 4, 6, 8 }, 
		          { 5, 6, 7, 8,5},

          };
		
		System.out.println("*********************");
		
		//In above array column size is not fixed, so how we can access this array ?
		//This array is called Jagged array
		
		
		System.out.println("Printing Jagged array elements");
		for(int i=0;i<d1.length;i++)  //instead of rows we will take length so it will give number of arrays within array
		{
			for(int j=0;j<d1[i].length;j++)  //will give all the elements of array[i]
			{
				System.out.print(" "+d1[i][j]);
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
	}

}
