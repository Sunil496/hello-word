import java.util.Arrays;

public class  A {

	//using  Single  loop Sort an array ascending order with interger eleemnts,
	
			public static int [ ] sortArrays (int [ ] arr) {

			int  length = arr.length;


			// sorting using a single loop

			for (int j =0;  j< length-1;   j++)  {

			if (arr [ j ] > arr [ j + 1] ) {
			int temp = arr [ j ];
			arr [ j ] = arr [ j + 1];
			arr [ j +1] = temp;

			j =  -1;

			     }

			}

			       return arr; 

			}

			  
			public static void main (String args [ ] ) {

			int arr [ ] =  {1,2,3,4,1,0}; 

                  System.out.println("orginal array :" + Arrays .toString(arr));


			arr =  sortArrays(arr);
                
		    System.out.println("Sorted array :" + Arrays .toString(arr));
	
	}

}
