/*======================================
  class MergeSortTester
  ALGORITHM:
  Create randomly populated integer arrays
  of increasing length and testing them using
  System.currentTimeMillis() and then comparing
  their runtimes
  BIG-OH CLASSIFICATION OF ALGORITHM:
  O(n*log(n))
  Mean execution times for dataset of size n:
  Batch size: <# of times each dataset size was run>
  n=1       time: 1487135833855 
  n=10      time: 1487135960436
  n=100     time: 1487135960436
  n=1000    time: 1487136084480
  n=10000   time: 1487136133488
  n=100000  time: 1487136213045
  n=<huge>  time: n*log(n)
  ANALYSIS:
  <INSERT YOUR RESULTS ANALYSIS HERE>
  ======================================*/

public class MergeSortTester {

    /******************************
     * execution time analysis 
     * Using System.currentTimeMillis() to 
     * find how long it takes to run our
     * test cases
     ******************************/

    public static void populate(int []  a){
	int al = a.length;
	for (int i = 0; i < al; i++){
	    a[i] = (int) Math.random() * 101;
	}
    }


    public static void main( String[] args ) {
	//int[] arr0 = {0};
	//int[] arr1 = new int [10];
	//int[] arr2 = new int [100];
	//int[] arr3 = new int [1000];
	//int[] arr4 = new int [10000];
	int[] arr5 = new int [100000];

	//populate(arr1);
	//populate(arr2);
	//populate(arr3);
	//populate(arr4);
	populate(arr5);
	
	//MergeSort.sort( arr0 );
	//MergeSort.sort( arr1 );
	//MergeSort.sort( arr2 );
	//MergeSort.sort( arr3 );
	//MergeSort.sort( arr4 );
	MergeSort.sort( arr5 );
	
	System.out.println ( System.currentTimeMillis() );
	    
	
    }//end main

}//end class
