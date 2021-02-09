//Name : محمود قناوي محمود أبو عمر.
//Section : 12


package labofdatastructure;

import java.util.Arrays;

public class SingleLinkedList {

    private class Node {

        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node first;
    private Node last;
    private Node current;
    private int count;

    public void addLast(int num) {
        Node node = new Node(num);
        
        if (isEmpty()) {
            first = last = node;
        } else {
            last.next = node;
            last = node;
        }
        count++;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void addFirst(int num) {
        Node node = new Node(num);

        if (isEmpty()) {
            first = last = node;
        } else {
            node.next = first;
            first = node;
        }
        count++;
    }

    public int count() {
        return count;
    }

    public int[] toArray() {
        int[] array = new int[count];
        int index = 0;
        current = first;

        while (current != null) {
            array[index++] = current.value;
            current = current.next;
        }
        return array;
    }

    public void reverse() {
        int[] rev = toArray();
        System.out.println(Arrays.toString(rev));
    }

}
