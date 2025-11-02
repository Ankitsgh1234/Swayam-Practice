package Stack;


    import java.util.Scanner;

class Stack {
    private static final int STACK_CAPACITY = 101;
    private char[] stackArray = new char[STACK_CAPACITY];
    private int topIndex = -1;

    void push(char character) {
        // If stack is full (check using isFull function)
        if(isFull()){
            System.out.println("Stack iss full");
            return;
        }
        // Then print "Stack is full"
        topIndex++;
        stackArray[topIndex]=character;
        // Otherwise add the next element at topIndex + 1 and update topIndex
    }

    char pop() {
        // If the stack is empty (check using isEmpty function)
        if(isEmpty()){
            System.out.println("Stack is empty");
            return (char)-1;
        }
        // Then print "Stack is empty" and return '-1'
        // Otherwise return the element at the topIndex
        char val=stackArray[topIndex];
        topIndex--;
        return val;
        // But reduce topIndex before returning the element
    }

    boolean isEmpty() {
        return topIndex == -1;
    }

    boolean isFull() {
        return topIndex >= STACK_CAPACITY - 1;
    }
}

public class P37_ImplementStackUsingArray {
    public static void main(String[] args) {
        String inputString = "Hello, World!";
        int inputLength = inputString.length();

        Stack charStack = new Stack();

        // Push each character onto the stack
        for (int i = 0; i < inputLength; i++) {
            char currentChar = inputString.charAt(i);
            charStack.push(currentChar);
        }

        // Pop the characters from the stack to construct the reversed string
        StringBuilder reversedString = new StringBuilder();
        while (!charStack.isEmpty()) {
            reversedString.append(charStack.pop());
        }

        System.out.println(reversedString.toString());
    }
}

