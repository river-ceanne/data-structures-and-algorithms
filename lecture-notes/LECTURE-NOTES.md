# Lecture - Merge Sort

Merge sort is one of the most efficient sorting algorithms and is base on the “divide and conquer” tactic.


## Learning Objectives
* Merge sort algorithm and its implementation

## Lecture Flow
* Merge sort brief description
  - visualization of the algorithm
* Time complexity of the sort

## Diagram
![Alt text](https://www.baeldung.com/wp-content/uploads/2018/09/mergesort1.png)

## Algorithm
1. Compare the current element (x) to the adjacent element (y).
2. If the comparison reveals y < x, switch the elements.
3. Repeat these steps until end of list is reached. 

## Pseudocode

    ALGORITHM Mergesort(arr)
    DECLARE n <-- arr.length
           
    if arr.length > 1
      DECLARE mid <-- n/2
      DECLARE b <-- arr[0...mid]
      DECLARE c <-- arr[mid...n]
      // break down the left side
      Mergesort(b)
      // break down the right side
      Mergesort(c)
      // merge the left and the right side together
      Merge(b, c, arr)

    ALGORITHM Merge(b, c, a)
      DECLARE i <-- 0
      DECLARE j <-- 0
      DECLARE k <-- 0

    while i < b && j < c
        if b[i] <= c[j]
            a[k] <-- b[i]
            i <-- i + 1
        else
            a[k] = c[j]
            j <-- j + 1
            
        k <-- k + 1

    if i = b.length
       add remaining items in array c to array a
    else
       add remaining items in array b to array a
       
    return a

## Readings and References

#### Watch

* https://www.youtube.com/watch?v=4VqmGXwpLqc

#### Read
* https://www.geeksforgeeks.org/merge-sort/
* https://www.baeldung.com/java-merge-sort

#### Bookmark

* https://www.hackerearth.com/practice/algorithms/sorting/merge-sort/tutorial/

