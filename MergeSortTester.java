/*======================================
  class MergeSortTester

  ALGORITHM:

  
  Create randomly populated integer arrays
  of increasing length and testing them using
  System.nanoTime() and then comparing
  their runtimes

  BIG-OH CLASSIFICATION OF ALGORITHM:
  O(n*log(n))

  Mean execution times for dataset of size n:
  Batch size: 1000
  (Time in nanoseconds)
  n=1       time:    81,685
  n=10      time:    15,762
  n=100     time:    10,617
  n=1000    time:    73,392
  n=10000   time:   764,313
  n=100000  time: 8,360,916
  n=<huge>  time: n*log(n)

  ANALYSIS:
  Where n>100, our times are exactly as expected,
  being slightly greater than 10x as long.
  However, for smaller arrays the time appears to
  follow no partiular pattern and in fact does the
  opposite of what is expected, presumably due to the
  JVM needing to warm up.
  ======================================*/

public class MergeSortTester {

    /******************************
     * execution time analysis 
     * Using System.nanoTime() to 
     * find how long it takes to run our
     * test cases
     ******************************/

    public static void populate( int []  a ) {
	int al = a.length;
	for ( int i = 0; i < al; i++ ) {
	    a[i] = (int) Math.random() * 101;
	}
    }


    public static void main( String[] args ) {
        
	long beginTime;
        
	int[] arr0 = {0};
	int[] arr1 = new int [10];
	int[] arr2 = new int [100];
	int[] arr3 = new int [1000];
	int[] arr4 = new int [10000];
	int[] arr5 = new int [100000];

	populate( arr1 );
	populate( arr2 );
	populate( arr3 );
	populate( arr4 );
	populate( arr5 );

	beginTime = System.nanoTime();
	for (int i = 0; i < 1000; i ++){
	    MergeSort.sort( arr0 );
	}
	System.out.println("Time for an array of size 1: " + ((System.nanoTime() - beginTime )) / 1000);

        beginTime = System.nanoTime();
	for (int i = 0; i < 1000; i ++){
	    MergeSort.sort( arr1 );
	}
	System.out.println("Time for an array of size 10: " + ((System.nanoTime() - beginTime )) / 1000);

	beginTime = System.nanoTime();
	for (int i = 0; i < 1000; i ++){
	    MergeSort.sort( arr2 );
	}
	System.out.println("Time for an array of size 100: " + ((System.nanoTime() - beginTime )) / 1000);

	beginTime = System.nanoTime();
	for (int i = 0; i < 1000; i ++){
	    MergeSort.sort( arr3 );
	}
	System.out.println("Time for an array of size 1000: " + ((System.nanoTime() - beginTime )) / 1000);

	beginTime = System.nanoTime();
	for (int i = 0; i < 1000; i ++){
	    MergeSort.sort( arr4 );
	}
	System.out.println("Time for an array of size 10000: " + ((System.nanoTime() - beginTime )) / 1000);

	beginTime = System.nanoTime();
	for (int i = 0; i < 1000; i ++){
	    MergeSort.sort( arr5 );
	}
	System.out.println("Time for an array of size 100000: " + ((System.nanoTime() - beginTime )) / 1000);
	    
	
    }//end main

}//end class
