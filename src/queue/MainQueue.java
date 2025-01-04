package queue;

public class MainQueue {
    public static void main(String[] args) {
        Queue queue = new Queue(3);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println(queue.peek());
    }
}
