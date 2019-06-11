# Data Structures and Algorithms

This repository is a collection of code with some basic solutions on some common programming problems. Programming language used in this repo is Javascript and Java. 

## Table of Contents
1. [Reverse an Array](#reverse-an-array)
2. [Shift an Array](#shift-an-array)
3. [Binary Search](#binary-search)
4. [Singly Linked List](#singly-linked-list)
5. [Singly Linked List - Insertions (Extended)](#singly-linked-list-insertions)
6. [Singly Linked List - Kth From End (Extended)](#singly-linked-list-kth-from-end)
7. [Stacks & Queues](#stacks-and-queues)
7. [Queues With Stacks](#queues-with-stacks)

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
My approach to this problem is to first get the min, max, and mid index of the given array. Upon initial assignments of these variables, create a while loop to interate the array in half segments while the search key is not found. Inside the loop, we must create a condition to check if the the current middle index element is the same as the search key entered, and if it is, exit loop or return out of the function with the mid index. If the current middle index element is not the same as the key, check if else it is greater than the search key, if it is, assign max with mid minus 1 to segement our loop, cutting the higher portion. And if else the key is greater than the middle index element, assign the min with the mid plus 1. With these if-conditionals creating segmentations on the array, our while loop will have a flag or exit case of if min is greater than or equal to the max -- this identifies the sorted array as having no value equaling the given search key. When the while loop exits, return -1 to let the call back function know the array does not contain the search key given. This has a time-complexity of O(log n).

### Solution
![Alt text](./assets/array_binary_search.jpg?raw=true "Array Shift Code Challenge")

### [Code](./code-401-challenges/src/main/java/code/challenges/BinarySearch.java)

<hr>

# Singly Linked List
A Java implementation of a singly linked list.

## Challenge
Create a Node class that has properties for the value stored in the Node, and a pointer to the next Node.
Within your LinkedList class, include a head property. Upon instantiation, an empty Linked List should be created.
This object should be aware of a default empty value assigned to head when the linked list is instantiated.
Define a method called insert which takes any value as an argument and adds a new node with that value to the head of the list with an O(1) Time performance.
Define a method called includes which takes any value as an argument and returns a boolean result depending on whether that value exists as a Node’s value somewhere within the list.
Define a method called print which takes in no arguments and returns a collection all of the current Node values in the Linked List.
At no time should an exception or stack trace be shown to the end user. Catch and handle any such exceptions and return a printed value or operation which cleanly represents the state and either stops execution cleanly, or provides the user with clear direction and output.
Be sure to follow your language/frameworks standard naming conventions (e.g. C# uses PascalCasing for all method and class names).

## Approach & Efficiency
Created 2 java classes for this exercise, a class for the Node structure and a class for the Singly Linked List.
Insert function for the linked list was created with O(1) time because of its insertion to the head of the linked list.

## API
Linked List methods: 
insert(String x), includes(String x), print(): returns ArrayList<String>, setters/getters: getHead(),setHead(Node head)

# Singly Linked List Insertions
Extension exercise to other types of insertions to a singly linked list.

## Challenge
Write the following methods for the Linked List class:

* .append(value) which adds a new node with the given value to the end of the list
* .insertBefore(value, newVal) which add a new node with the given newValue immediately before the first value node
* .insertAfter(value, newVal) which add a new node with the given newValue immediately after the first value node


### Solution
Append
![Alt text](./assets/ll_insertionsAppend.jpg?raw=true)

Insert Before
![Alt text](./assets/ll_insertionsBefore.jpg?raw=true)

Insert After
![Alt text](./assets/ll_insertionsAfter.jpg?raw=true)

## Approach / Efficiency
Append -> Time Complexity is O(n)
InsertBefore -> Time Complexity is O(n)
InsertAfter -> Time Complexity is O(n)

## API
Linked List methods: 

append(String newValue), 
insertBefore(String searchValue, String newValue), 
insertAfter(String searchValue, String newValue)

<hr>

# Singly Linked List Kth From End

## Challenge
Write the following methods for the Linked List class:

### Solution
![Alt text](./assets/ll_kth_from_end.jpg?raw=true "Kth From End")

## Approach / Efficiency
Time Complexity -> O(1) 
This is because our approach has a linked list that has its own size variable that keeps count on every insert.
Space Complexity -> O(1)

## API
Method: .getKth(int k)

### [Code](./Data-Structures/src/main/java/Data/Structures/LinkedList.java)

<hr>

# Singly Linked List - Merge List
Extension exercise to merge two linked list together.

## Challenge
Write a function called mergeLists which takes two linked lists as arguments. Zip the two linked lists together into one so that the nodes alternate between the two lists and return a reference to the head of the zipped list. Try and keep additional space down to O(1). You have access to the Node class and all the properties on the Linked List class as well as the methods created in previous challenges.


### Solution
Append
![Alt text](./assets/ll_merge.jpg?raw=true)


## Approach / Efficiency
Time Complexity -> O(n)
Space Complexity -> O(1)

## API
Method: mergeLists(LinkedList one, LinkedList two) -> returns LinkedList

### [Code](./Data-Structures/src/main/java/Data/Structures/LinkedList.java)

<hr>

# Stacks and Queues
Java implementation of a stack and queue

## Challenge
* Create a Stack class that has a top property. It creates an empty Stack when instantiated.
This object should be aware of a default empty value assigned to top when the stack is created.
* Define a method called push which takes any value as an argument and adds a new node with that value to the top of the stack with an O(1) Time performance.
* Define a method called pop that does not take any argument, removes the node from the top of the stack, and returns the node’s value.
* Define a method called peek that does not take an argument and returns the value of the node located on top of the stack, without removing it from the stack.
* Create a Queue class that has a top property. It creates an empty Queue when instantiated.
This object should be aware of a default empty value assigned to front when the queue is created.
* Define a method called enqueue which takes any value as an argument and adds a new node with that value to the back of the queue with an O(1) Time performance.
* Define a method called dequeue that does not take any argument, removes the node from the front of the queue, and returns the node’s value.
* Define a method called peek that does not take an argument and returns the value of the node located in the front of the queue, without removing it from the queue.


## Approach & Efficiency
* Stack -> Push() and Pop() at O(1) time and space.
* Queue -> Enqueue() and Dequeue() at O(1) time and space.

## API
* Stack -> Push(), Pop(), Peek(), isEmpty(), isFull()
* Queue -> Enqueue(), Dequeue(), Peek(), isEmpty(), isFull()

<hr>

# Queues With Stacks
A queue implementation using 2 stacks

## Challenge
* Create a brand new PseudoQueue class. Do not use an existing Queue. Instead, this PseudoQueue class will implement our standard queue interface (the two methods listed below), but will internally only utilize 2 Stack objects. Ensure that you create your class with the following methods:

  - enqueue(value) which inserts value into the PseudoQueue, using a first-in, first-out approach.
  - dequeue() which extracts a value from the PseudoQueue, using a first-in, first-out approach.


## Approach & Efficiency
* Enqueue(String x)
  - Time Complexity: O(1) or O(n) if first stack is full
* Dequeue()
  - Time Complexity:  O(1) or O(n) if second stack is empty

## API
Enqueue(String x), Dequeue(), and Constructors

### Solution

![Alt text](./assets/queue_with_stacks.jpg?raw=true)

## [Code](./Data-Structures/src/main/java/queuewithstacks/PseudoQueue.java)

<hr>