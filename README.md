# Data Structures and Algorithms

This repository is a collection of code with some basic solutions on some common programming problems. Programming language used in this repo is Javascript and Java. 

## Table of Contents
1. [Reverse an Array](#reverse-an-array)
2. [Shift an Array](#shift-an-array)
2. [Binary Search](#binary-search)

## Reverse an Array

### Challenge
Write a function called reverseArray which takes an array as an argument. Without utilizing any of the built-in methods available to your language, return an array with elements in reversed order.

### Approach & Efficiency
My apporach was to loop through the array half its length and exchange the values on opposite ends of the array. It has a time-complexity of O(n). 

### Solution
![Alt text](./assets/array_reverse.jpg?raw=true "Array Reverse Code Challenge")

### [Code](./code-challenges/array_reverse)

<hr>

## Shift an Array

### Challenge
Write a function called insertShiftArray which takes in an array and the value to be added. Without utilizing any of the built-in methods available to your language, return an array with the new value added at the middle index.

### Approach & Efficiency
My apporach was to create a new array 1 element more than the length of the passed in array. I also created an integer variable to store the middle index, dividing length to half. After creating a new array with the proper length for the shift, I looped through the array assigning the same values as the values on the same index of the passed in array for up to half its length. On current index in loop equalling to the middle index, I assign the passed in integer parameter. In continuation, the rest of the array will be assigned same as the values on the passed in array but setting its index minus 1 to accomodate the inserted middle element. This has a time-complexity of O(n) because of its linear approach. 

### Solution
![Alt text](./assets/array_shift.jpg?raw=true "Array Shift Code Challenge")

### [Code](./code-401-challenges/src/main/java/code/challenges/ArrayShift.java)

<hr>

## Binary Search

### Challenge
Write a function called BinarySearch which takes in 2 parameters: a sorted array and the search key. Without utilizing any of the built-in methods available to your language, return the index of the array’s element that is equal to the search key, or -1 if the element does not exist.

### Approach & Efficiency
My approach to this problem is to first get the min, max, and mid index of the given array. Upon initial assignments of these variables, create a while loop to interate the array in half segments while the search of the key is not found. Inside the loop, we must create a condition to check if the the current middle index element is the saem as they search key entered, and if it is, exit loop or return out of the function with the mid index. If the current middle index element is not the same as the key, check if else it is greater than the search key, if it is, assign max with mid minus 1 to segement our loop cutting the higher portion. And if else the key is greater than the middle index element, assign the min with the mid plus 1. With these if-conditionals creating segmentations on the array, our while loop will have a flag or exit case of if min is greater than or equal to the max -- this identifies the sorted array as having no value equaling the given search key. When the while loop exits, return -1 to let the call back function know the array does not contain the search key given. This has a time-complexity of O(log n).

### Solution
![Alt text](./assets/array_binary_search.jpg?raw=true "Array Shift Code Challenge")

### [Code](./code-401-challenges/src/main/java/code/challenges/BinarySearch.java)

