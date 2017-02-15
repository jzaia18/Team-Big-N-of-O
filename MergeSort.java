// Team Big N of o: Maggie Xia, Joshel Xiedeng, Jake Zaia
// APCS2 pd1
// HW07 -- What Does the Data Say?  
// 2017-02-14

/*======================================
  class MergeSort
  Implements mergesort on array of ints.

  Summary of Algorithm: 

  merge() takes two int[] inputs and returns an int[] output 
  that combines the elements of the two inputs in ascending order.

  sort() takes an int[] input and splits it into two smaller int[] 
  arrays, sorts them recursively, and then returns the merge() of 
  the sorted versions of the two arrays it originally split into.

  ======================================*/

public class MergeSort {

    /******************************************************
     * int[] merge(int[],int[]) 
     * Merges two input arrays
     * Precond:  Input arrays are sorted in ascending order
     * Postcond: Input arrays unchanged, and 
     * output array sorted in ascending order.
     ******************************************************/
    private static int[] merge( int[] a, int[] b ) 
    {

	int [] retArr = new int[a.length + b.length];
	
	int x = 0;//counter for array a
	int y = 0;//counter for array b
	
	int al = a.length;
	int bl = b.length;

	while ( x < al || y < bl ) {
	    
	    if ( x == al ) {//if array a is empty
		retArr[ x + y ] = b[y];
		y += 1;
	    }
	    else if ( y == bl ) {//if array b is empty
		retArr[ x + y ] = a[x];
		x += 1;
	    }
	    else if ( a[x] < b[y] ) {//comparing first element of each array
		retArr[ x + y ] = a[x];
		x += 1;
	    }
	    else if ( a[x] > b[y] ) {
		retArr[ x + y ] = b[y];
		y += 1;
	    }
	    else {//the elements are the same
		retArr[ x + y ] = a[x];
		x += 1;
	    }

	}

	return retArr;
	
    }//end merge()


    /******************************************************
     * int[] sort(int[]) 
     * Sorts input array using mergesort algorithm
     * Returns sorted version of input array (ascending)
     ******************************************************/
    public static int[] sort( int[] arr ) 
    {
	if ( arr.length == 1 ) {//base case
	    return arr;
	}

	//split arr into 2 approximately equally lengthed arrays
	int[] a = new int[arr.length / 2];
	int[] b = new int[arr.length - arr.length/2];
	
	//put first half of arr's elements into array a
	for ( int i = 0; i < a.length ; i++ ) {
	    a[i] = arr[i];
	}
	
	//put the rest of arr's elements into array b
	for ( int i = 0; i < b.length ; i++ ) {
	    b[i] = arr[(arr.length / 2) + i];
	}

	return merge( sort(a), sort(b) );//recursively sort() until base case is true
	
    }//end sort()



    //-------------------HELPERS-------------------------
    //tester function for exploring how arrays are passed
    //usage: print array, mess(array), print array. Whaddayasee?
    //mess can modify the content of the actual array instead of the content of a copy
    public static void mess( int[] a ) {
	for( int i = 0 ; i<a.length; i++ )
	    a[i] = 0;
    }

    //helper method for displaying an array
    public static void printArray( int[] a ) {
	System.out.print("[");
	for( int i : a )
	    System.out.print( i + ",");
	System.out.println("]");
    }
    //---------------------------------------------------

    public static void populate(int []  a){
	int al = a.length;
	for (int i = 0; i < al; i++){
	    a[i] = (int) Math.random() * 101;
	}
    }

    //main method for testing
    public static void main( String [] args ) {

	/*
	int[] arr0 = {0};
	int[] arr1 = new int [10];
	int[] arr2 = new int [100];
	int[] arr3 = new int [1000];
	int[] arr4 = new int [10000];
	int[] arr5 = new int [100000];

	populate(arr1);
	populate(arr2);
	populate(arr3);
	populate(arr4);
	populate(arr5);
	populate(arr6);*/

	/*System.out.println("\nTesting mess-with-array method...");
	printArray( arr3 );
	mess(arr3);
	printArray( arr3 );

	System.out.println("\nMerging arr1 and arr0: ");
	printArray( merge(arr1,arr0) );

	System.out.println("\nMerging arr4 and arr6: ");
	printArray( merge(arr4,arr6) );

	System.out.println("\nSorting arr4-7...");
	printArray( sort( arr4 ) );
	printArray( sort( arr5 ) );
	printArray( sort( arr6 ) );
	printArray( sort( arr7 ) );*/

    }//end main()

}//end class MergeSort
