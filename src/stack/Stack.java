package stack;

public class Stack {
    int[] stack;
    int top;

    public Stack(int size) {
        stack = new int[size];
        top = -1;
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == stack.length - 1);
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full");
        } else {
            stack[++top] = value;
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            return stack[top--];
        }
        return 0;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            return stack[top];
        }
        return 0;
    }
}
