# **Team-Big-N-of-O**
##### *Maggie Xia, Jake Zaia, Joshel Xiedeng*

### MergeSort Algo:
  * merge() takes two int[] inputs and returns an int[] output that combines the elements of the two inputs in ascending order.
  * sort() takes an int[] input and splits it into two smaller int[] arrays, sorts them recursively, and then returns the merge() of the sorted versions of the two arrays it originally split into.

### MergeSortTester Algo:
  * Create randomly populated integer arrays of increasing length and testing them using System.nanoTime() and then comparing their runtimes.
  * Originally tried with using System.currentTimeMillis() and milliseconds, but it didn't work because they are too slow to accurately depict the changes in runtime when the test cases got longer.

### Finding Runtime (in nanoseconds):
To find the runtime of arrN...
```javascript
beginTime = System.nanoTime();
MergeSort.sort( arrN );
System.out.println( System.nanoTime() - beginTime );
