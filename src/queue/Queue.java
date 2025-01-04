package queue;

public class Queue {
    public int[] queue;
    public int front;
    public int rear;  // Changed 'end' to 'rear' for clarity

    public Queue(int size) {
        front = -1;
        rear = -1;
        queue = new int[size];
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public boolean isFull() {
        return rear == queue.length - 1; // Queue is full if rear reaches last index
    }

    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is full");
            return; // Exit if queue is full
        }

        if (isEmpty()) { // First element, set front to 0
            front = 0;
        }

        queue[++rear] = value; // Increment rear, then add value
        System.out.println(value + " enqueued into queue");
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1; // Or throw exception, indicates empty
        }

        int value = queue[front]; // Get the value from the front
        System.out.println(value + " dequeued from queue");

        if (front == rear) { // Only one element in queue, reset queue
            front = rear = -1;
        } else {
            front++; // move the front to point to the next element.
        }

        return value; // Return dequeued value
    }

    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.print("Queue: ");
        for (int i = front; i <= rear; i++) { // Changed loop bounds
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        } else {
            return queue[front];
        }
    }
}