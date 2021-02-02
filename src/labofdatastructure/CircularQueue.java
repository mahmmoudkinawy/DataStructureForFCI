package labofdatastructure;

public class CircularQueue {

    private int front;
    private int rear;
    private int counter;
    private int maxSize;
    private int[] elements;

    public CircularQueue(int maxSize) {
        front = 0;
        rear = maxSize - 1;
        counter = 0;
        this.maxSize = maxSize;
        elements = new int[this.maxSize];
    }

    private boolean isEmpty() {
        return counter == 0;
    }

    private boolean isFull() {
        return counter == maxSize;
    }

    public void enqueue(int num) {
        if (isFull()) {
            System.out.println("Queue is full");
        } else {
            rear = (rear + 1) % elements.length;
            elements[rear] = num;
            counter++;
        }
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
        } else {
            front = (front + 1) % elements.length;
            counter--;
        }
    }

    public void getQueueFront() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
        } else {
            System.out.println(elements[front]);
        }
    }

    public void getQueueRear() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
        } else {
            System.out.println(elements[rear]);
        }
    }

    public void display() {
        System.out.print("[ ");
        for (int i = front; i != rear; i = (i + 1) % elements.length) {
            System.out.print(elements[i] + " <-- ");
        }
        System.out.println(elements[rear] + " ]");
    }
}
