package stacks;

import java.util.Stack;

public class Stacks {

    public static void main(String[] args) {
        
        Stack <Integer> stack = new Stack<Integer>();
        
        System.out.println("Empty stack: " + stack);
        System.out.println("Is it empty?: " + stack.isEmpty());
        
        // Adding elements:
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        
        // Iteraing over it:
        for (Integer miniStack: stack) {
            System.out.println(miniStack);
        }
        
        // Showing its contents:
        System.out.println("Stack: " + stack);
        System.out.println("Is it empty? " + stack.isEmpty());
        
        stack.pop(); // Removing last added element
        
        System.out.println("Is the number 3 in the stack? " + stack.search(3));
        System.out.println("Last added element: " + stack.peek());
    }
    
}
