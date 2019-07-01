
# Lecture - Insertion Sort

Insertion sort is a type of sorting algorithm that sorts through an array/list of elements by each iteration of an element. Comparisons are done to the previous visited elements. 

## Learning Objectives
* Insertion sort algorithm and its implementation

## Lecture Flow
* Insertions sort brief description
  - visualization of the algorithm
* Time complexity of the sort

## Diagram
![Alt text](https://cdncontribute.geeksforgeeks.org/wp-content/uploads/insertionsort.png)

## Algorithm
1. Compare the current element (x) to the adjacent element (y).
2. If the comparison reveals y < x, switch the elements.
3. Repeat these steps until end of list is reached. 

## Pseudocode

    InsertionSort(int[] arr)
  
    FOR i = 1 to arr.length
    
      int j <-- i - 1
      int temp <-- arr[i]
      
      WHILE j >= 0 AND temp < arr[j]
        arr[j + 1] <-- arr[j]
        j <-- j - 1
        
      arr[j + 1] <-- temp

## Readings and References

#### Watch

* https://www.youtube.com/watch?v=JU767SDMDvA

#### Read
* https://www.interviewbit.com/tutorial/insertion-sort-algorithm/
* https://www.geeksforgeeks.org/insertion-sort/

#### Bookmark

* https://www.hackerearth.com/practice/algorithms/sorting/insertion-sort/tutorial/  

