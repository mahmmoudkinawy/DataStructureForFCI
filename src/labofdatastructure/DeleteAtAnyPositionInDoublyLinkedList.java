package labofdatastructure;

class Nnode {

    int data;
    Nnode next, prev;
}

class DeleteAtAnyPositionInDoublyLinkedList {

    static Nnode head = null;

    static Nnode deleteNode(Nnode del) {
        if (head == null || del == null) {
            return null;
        }
        if (head == del) {
            head = del.next;
        }

        if (del.next != null) {
            del.next.prev = del.prev;
        }
        if (del.prev != null) {
            del.prev.next = del.next;
        }

        del = null;

        return head;
    }

    static void deleteNodeAtGivenPos(int n) {
        if (head == null || n <= 0) {
            return;
        }

        Nnode current = head;
        int i;
        for (i = 1; current != null && i < n; i++) {
            current = current.next;
        }

        if (current == null) {
            return;
        }
        deleteNode(current);
    }

    static void push(int new_data) {
        Nnode new_node = new Nnode();

        new_node.data = new_data;

        new_node.prev = null;
        new_node.next = head;

        if (head != null) {
            head.prev = new_node;
        }

        head = new_node;
    }

    static void printList() {
        Nnode temp = head;
        if (temp == null) {
            System.out.print("Doubly Linked list empty");
        }

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

}
