# My Java Life - College - Semester 4

## Subjects
### 19CSE212 - Data Structures and Algorithms



## Lab 19CSE212 Data Structure and Algorithms
### **Lab Report**
1. Lab I       [Introduction to Data Structure](#Lab-I) 
2. Lab II      [Array Data Structure](#Lab-II)
3. Lab III     [Linked List-I](#Lab III)
4. Lab IV      [Linked List-II](#Lab IV)
5. Lab V       [Stack](#Lab V)
6. Lab VI      [Queue](#Lab VI)
7. Lab VII     [Tree-I](#Lab VII)
8. Lab VIII    [Tree-II](#Lab VIII)
9. Lab IX      [Graph](#Lab IX)
10. Lab X      [Searching and Sorting](#Lab X)
11. Lab XI     [Hashing](#Lab XI)

## Lab Codes along with description in Chronological Order


### Lab 2
1. [Structure](Structure.java) - Implementing a structure(struct from  C Language) in Java.
2. [Union](Union.java) - Implementing Union(from C Language) in Java. 

### Lab 3
1. [Array Element Insertion](ArrayManipulation.java)
2. [ArrayList Element Insertion](ArrayListManipulation.java)


1. Insert an element into the array
2. Remove an element into the array
3. Sort the array element into the array
4. Maximum of array
5. Sum of array

Linked Lists




### Lab I 
5th of February, 2024
1. #### [Stack](Stack.java) Introduction to Data Structure
- Basic C program using loops, structure.
- This is a simple C program that uses loops and structures to create a basic program. 
- This program takes information about students, such as their name, roll number, and marks, and then calculates the average marks for the class.

2. #### [Union](Union.java)   Programs on unions, 1D array.
- This program demonstrates the use of unions in C.
- A union is a special data type available in C that allows to store different data types in the same memory location.
- You can define a union with many members, but only one member can contain a value at any given time. Unions provide an efficient way of using the same memory location for multiple-purpose.

3. #### [Structure Application: Database](StructureApplicationDatabase.java)   Structure Application: Database
- To design a small database type application using structure, pointer, array.
- Below is a simple C program that demonstrates a small database application using structures, pointers, and arrays. 
- In this example, we'll create a database of students with information such as name, roll number, and marks. 
- Users can add new students, display all students, and find a student by their roll number.

### Lab II 
12th of February, 2024 **Real world scenarios involving array.**
1. #### [Average Temprature Of Week](AvgTempratureOfWeek.c)
- In this program, an array named temperatures is used to store the temperatures for each day of the week. 
- The program prompts the user to input temperatures for each day, then displays the recorded temperatures and calculates the average temperature for the week.

2. #### [Matrix Multiplication](MatrixMultiplication.c) Implementation of multi-dimensional arrays and problems related to them like matrix multiplication.
- This program defines a function multiplyMatrices for matrix multiplication and another function displayMatrix for displaying matrices. 
- The main function initializes two 3x3 matrices, performs matrix multiplication, and then displays the original matrices and the result.

### Lab III
4th of March, 2024 **Linked Lists**
1. [Insert Element from Front](InsertAtFrontLL.java) Insert from front
- **Explanation:**
- The Node class represents a node in the linked list, containing data and a reference to the next node.
- The LinkedList class has a head pointer that points to the first node in the list.
- The insertAtBeginning method creates a new node with the provided data, sets its next pointer to the current head, and then updates the head pointer to point to the newly created node.
- The printList method iterates through the list starting from the head and prints the data of each node.
- In the main method, a linked list is created, and elements are inserted at the beginning using insertAtBeginning. Finally, the list is printed.

2. [Insert Element from End](InsertAtEndLL.java)Insert from end
- **Explanation:**
- The code structure is similar to the previous example, with the insertAtEnd method handling the insertion logic.
- The insertAtEnd method first checks if the list is empty. If so, it sets the head to the new node.
- Otherwise, it iterates through the list to find the last node using a last pointer.
- Once the last node is found, its next pointer is set to the new node, effectively adding it to the end of the list.

3. [Insert Element from any Position](InsertAtPositionLL.java)Insert from any position till here without inbuilt functions
- **Explanation:**
- The code structure is similar to the previous examples, with the insertAtPosition method handling the insertion logic at any given position.
- The insertAtPosition method takes the data to be inserted and the desired position as arguments.
- It first checks for an invalid position (negative index).
- If the position is 0, it inserts the new node at the beginning, similar to insertAtBeginning.
- Otherwise, it iterates through the list using a current node and a counter (count) to find the node at the position before the desired insertion point.
- If the position is beyond the list's length, it indicates an invalid position, and an error message is printed.
- Once the correct node is found, the new node's next pointer is set to the current node's next, and the current node's next pointer is set to the new node, effectively inserting it at the desired position.

4. [Insert Element from Switch Case with built-in Functions](InsertSwitchLL.java)Apply Switch case and create a java program for all types of insert operations on single linked list with built-in functions
- **Explanation:**
- The insert method takes the data and position as arguments.
- It uses a switch statement to handle different insertion scenarios:
- Case 0: Inserts at the beginning using insertAtBeginning.
- Case -1: Inserts at the end using insertAtEnd.
- Default: Checks for invalid positions (negative except -1) and throws an IllegalArgumentException. If the position is valid (non-negative), it calls insertAtPosition.
- The private helper methods (insertAtBeginning, insertAtEnd, and insertAtPosition) implement the logic for inserting at specific positions, similar to the previous examples.
- The printList method remains the same.
- In the main method, various insertion scenarios are tested, including valid and invalid positions. The program handles and prints error messages for invalid positions using exceptions (IllegalArgumentException and NoSuchElementException).
