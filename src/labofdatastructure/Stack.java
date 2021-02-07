package labofdatastructure;

public class Stack {

    private final int MAX_SIZE = 100;
    private int top;
    private int[] nums = new int[MAX_SIZE];

    public Stack() {
        top = -1;
    }

    public boolean isFull() {
        return top == nums.length - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(int num) {
        if (isFull()) {
            System.out.println("Stack is full.");
        } else {
            nums[++top] = num;
        }
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            top--;
        }
    }

    public void peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println(nums[top]);
        }
    }

    public void display() {
        System.out.print("[ ");
        for (int i = top; i >= 0; i--) {
            System.out.print(nums[i] + " ");
        }

        System.out.print("]");
        System.out.println();
    }

    public static void main(String[] args) {
        Stack lol = new Stack();

        lol.push(10);
        lol.push(20);
        lol.push(30);
        lol.push(40);

        lol.display();
    }

}
