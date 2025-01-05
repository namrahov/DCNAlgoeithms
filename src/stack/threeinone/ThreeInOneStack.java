package stack.threeinone;

public class ThreeInOneStack {
    public static void main(String[] args) {
        StackAll stacks = new StackAll(9);

        // Test Stack 1
        stacks.push1(10);
        stacks.push1(20);
        stacks.push1(30);
        // stacks.push1(40);

        System.out.println("Peek 1: " + stacks.peek1());
        System.out.println("Pop 1: " + stacks.pop1());
        System.out.println("Pop 1: " + stacks.pop1());
        System.out.println("Pop 1: " + stacks.pop1());
        //  System.out.println("Pop 1: " + stacks.pop1()); // This should give error


        // Test Stack 2
        stacks.push2(40);
        stacks.push2(50);
        stacks.push2(60);
        //   stacks.push2(70);

        System.out.println("Peek 2: " + stacks.peek2());
        System.out.println("Pop 2: " + stacks.pop2());
        System.out.println("Pop 2: " + stacks.pop2());
        System.out.println("Pop 2: " + stacks.pop2());
        //System.out.println("Pop 2: " + stacks.pop2()); //This should give error


        // Test Stack 3
        stacks.push3(70);
        stacks.push3(80);
        stacks.push3(90);



        System.out.println("Peek 3: " + stacks.peek3());
        System.out.println("Pop 3: " + stacks.pop3());
        System.out.println("Pop 3: " + stacks.pop3());
        System.out.println("Pop 3: " + stacks.pop3());
        // System.out.println("Pop 3: " + stacks.pop3()); // This should give error


        //Test expansion

        StackAll stack2= new StackAll(3);
        stack2.push1(1);
        stack2.push1(2);
        stack2.push1(3);
        stack2.push1(4);

        System.out.println("Peek 1 after expansion: " + stack2.peek1());


        StackAll stack3= new StackAll(4);
        stack3.push1(1);
        stack3.push1(2);
        stack3.push2(3);
        stack3.push2(4);
        stack3.push2(5);

        System.out.println("Peek 2 after expansion: " + stack3.peek2());

        StackAll stack4= new StackAll(5);
        stack4.push1(1);
        stack4.push2(2);
        stack4.push3(3);
        stack4.push3(4);
        stack4.push3(5);
        stack4.push3(6);
        System.out.println("Peek 3 after expansion: " + stack4.peek3());

    }
}
