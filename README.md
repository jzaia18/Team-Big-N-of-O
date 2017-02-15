# **Team-Big-N-of-O**

### MergeSort Algo:
  * merge() takes two int[] inputs and returns an int[] output that combines the elements of the two inputs in ascending order.
  * sort() takes an int[] input and splits it into two smaller int[] arrays, sorts them recursively, and then returns the merge() of the sorted versions of the two arrays it originally split into.

### MergeSortTester Algo:
  * Create randomly populated integer arrays of increasing length and testing them using System.currentTimeMillis() and then comparing their runtimes

### Finding Runtime (in milliseconds):
```javascript
 long beginTime = System.currentTimeMillis();
 //code...
 //code...
 //code...
 long endTime = System.currentTimeMillis(); 
 long difference = endTime - beginTime;
 System.out.println( difference );
