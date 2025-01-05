package stack.threeinone;

public class StackAll {
    private int[] stack;
    private int top1;
    private int top2;
    private int top3;
    private int size1;
    private int size2;
    private int size3;
    private int capacity;

    public StackAll(int size) {

        if(size < 3) {
            throw new IllegalArgumentException("Size must be at least 3");
        }

        capacity = size;
        stack = new int[size];
        // Calculate stack sizes ensuring that size1+size2+size3 = size
        size1 = size / 3;
        size2 = size / 3;
        size3 = size - size1 - size2;

        top1 = -1;
        top2 = size1 - 1;
        top3 = size1 + size2 - 1;
    }

    public boolean isEmpty1() {
        return top1 == -1;
    }

    public boolean isEmpty2() {
        return top2 == size1 - 1;
    }

    public boolean isEmpty3() {
        return top3 == size1 + size2 - 1;
    }

    public boolean isFull1() {
        return (top1 == size1 - 1);
    }

    public boolean isFull2() {
        return (top2 == size1 + size2 - 1);
    }

    public boolean isFull3() {
        return (top3 == capacity - 1);
    }

    public void push1(int value) {
        if (isFull1()) {
            System.out.println("Stack 1 is full");
            expandStack(1);

        }
        stack[++top1] = value;

    }
    public void push2(int value) {
        if (isFull2()) {
            System.out.println("Stack 2 is full");
            expandStack(2);
        }
        stack[++top2] = value;

    }
    public void push3(int value) {
        if (isFull3()) {
            System.out.println("Stack 3 is full");
            expandStack(3);
        }
        stack[++top3] = value;
    }


    public int pop1() {
        if (isEmpty1()) {
            throw new IllegalStateException("Stack 1 is empty");
        }
        return stack[top1--];
    }

    public int pop2() {
        if (isEmpty2()) {
            throw new IllegalStateException("Stack 2 is empty");
        }
        return stack[top2--];
    }

    public int pop3() {
        if (isEmpty3()) {
            throw new IllegalStateException("Stack 3 is empty");
        }
        return stack[top3--];
    }

    public int peek1() {
        if (isEmpty1()) {
            throw new IllegalStateException("Stack 1 is empty");
        }
        return stack[top1];
    }

    public int peek2() {
        if (isEmpty2()) {
            throw new IllegalStateException("Stack 2 is empty");
        }
        return stack[top2];
    }

    public int peek3() {
        if (isEmpty3()) {
            throw new IllegalStateException("Stack 3 is empty");
        }
        return stack[top3];
    }


    private void expandStack(int stackNumber) {

        int newCapacity = capacity * 2;
        int [] newStack = new int[newCapacity];

        int newSize1 = newCapacity / 3;
        int newSize2 = newCapacity / 3;
        int newSize3 = newCapacity - newSize1 - newSize2;



        int oldTop1 = top1;
        int oldTop2 = top2;
        int oldTop3 = top3;


        //copy existing stack to new stack
        for(int i=0; i <=oldTop1; i++) {
            newStack[i]= stack[i];
        }
        int j= newSize1;
        for(int i= size1; i<=oldTop2; i++) {
            newStack[j]= stack[i];
            j++;
        }

        j = newSize1+ newSize2;

        for(int i=size1 + size2; i<=oldTop3;i++){
            newStack[j] = stack[i];
            j++;
        }


        stack = newStack;
        capacity= newCapacity;

        top1 = oldTop1;
        top2 = newSize1 + oldTop2 - size1;
        top3 = newSize1 + newSize2 + oldTop3 - (size1+size2);


        size1 = newSize1;
        size2 = newSize2;
        size3 = newSize3;

    }



}