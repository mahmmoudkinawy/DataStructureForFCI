//Name : محمود قناوي محمود أبو عمر.
//Section : 12


package labofdatastructure;

class InsertAtAnyPositionInDoublyLinkedList {

    static class node {
        int data;
        node next;
        node prev;
    };

    static node getNode() {
        return new node();
    }

    static int displayList(node temp) {
        node t = temp;
        if (temp == null) {
            return 0;
        } else {
            System.out.println("The list is: ");

            while (temp.next != t) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }

            System.out.println(temp.data);

            return 1;
        }
    }

    static int countList(node start) {
        node temp = start;
        int count = 0;

        while (temp.next != start) {
            temp = temp.next;
            count++;
        }
        count++;
        return count;
    }

    static node insertAtLocation(node start,
            int data, int loc) {
        node temp, newNode;
        int i, count;

        newNode = getNode();
        temp = start;

        count = countList(start);

        if (temp == null || count < loc) {
            return start;
        } else {
            newNode.data = data;
            for (i = 1; i < loc - 1; i++) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            (temp.next).prev = newNode;

            temp.next = newNode;
            newNode.prev = temp;

            return start;
        }

    }

    static node createList(int arr[], int n, node start) {
        node newNode, temp;
        int i;
        for (i = 0; i < n; i++) {
            newNode = getNode();

            newNode.data = arr[i];
            if (i == 0) {
                start = newNode;
                newNode.prev = start;
                newNode.next = start;
            } else {
                temp = (start).prev;

                temp.next = newNode;
                newNode.next = start;
                newNode.prev = temp;
                temp = start;
                temp.prev = newNode;
            }
        }
        return start;
    }

}
