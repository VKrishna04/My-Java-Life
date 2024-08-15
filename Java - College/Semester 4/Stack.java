import java.util.Scanner;

/**
 * Stack
 */
public class Stack {
    // Parameters
    private int maxSize;
    private int top;
    private int[] stackArray;

    // Initialize a stack
    public Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
    }

    // Push
    public void push(int value) {
        if (top < maxSize - 1) {
            stackArray[++top] = value;
            System.out.println("Inserted" + value);
        } else {
            System.out.println("Stack is full!!!"); // Overflow Condition
        }
    }

    // Pop
    public void pop() {
        if (top >= 0) {
            System.out.println("Removed: " + stackArray[top--]);
        } else {
            System.out.println("Stack is Empty."); // Underflow Condition
        }
    }

    // Display
    public void display() {
        if (top != -1) {
            System.out.println("The Stack is empty!!!");
        } else {
            System.out.println("Elements in Stack: ");
            for (int i = 0; i <= top; i++) {
                System.out.println(stackArray[i]);
            }
        }
    }

    // main
    public static void main(String[] args) {
        System.out.println("Please enter the size of stack: ");
        Scanner input = new Scanner(System.in);

        input.close();
    }

}