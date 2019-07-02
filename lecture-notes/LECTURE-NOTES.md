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
1. Divide: 
  We divide the given array into 2, the pivot being the midpoint of the given array. This can be done and carried out using recursion for all the trickled down half arrays until there are no more half arrays to split into 2.

2. Conquer: 
  We sort and merge the divided arrays from the bottom going to the top and get the result - the sorted array.

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

