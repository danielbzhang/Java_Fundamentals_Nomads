package labs_examples.datastructures.stack.labs;

import java.util.Stack;

/**
 *      Demonstrate your mastery of Java's built-in Stack class by completing the following:
 *
 *      1) instantiate a new Stack
 *      2) demonstrate the use of EVERY method in the Stack class - there are 5
 */

class StackExample{
    public static void main(String[] args) {
        Stack<String> myStack = new Stack<>();

        if(myStack.empty()) {
            System.out.println("My stack is empty.");
        }

        myStack.push("Nick");
        myStack.push("Bob");
        myStack.push("Hello");

        System.out.println("Size of my stack: " + myStack.size());

        System.out.println("Peek: " + myStack.peek() + "\n");
        
        myStack.pop();
        myStack.pop();

        System.out.println("Size of my stack after pop: " + myStack.size());
    }
}
