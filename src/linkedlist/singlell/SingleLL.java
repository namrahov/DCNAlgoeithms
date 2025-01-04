package linkedlist.singlell;

public class SingleLL {
    public Node head;
    public Node tail;
    public int size;

    public Node createSingleLinkedList(int nodeValue) {
        head = new Node(); //Create node with head
        head.value = nodeValue; // Assign value
        head.next = null; // set next to null as it's the only node
        tail = head; // both head and tail are the same when only one element
        size = 1;
        return head;
    }

    public void insertLinkedList(int nodeValue, int index) {
        Node node = new Node();
        node.value = nodeValue;

        if (head == null) {
            createSingleLinkedList(nodeValue);
        } else if (index == 0) {
            node.next = head;
            head = node;
        } else if (index >= size) { // Insert at the end or past it (append)
            node.next = null;
            tail.next = node;
            tail = node;
        } else {
            Node temp = head;
            int index2 = 0;
            while (index2 < index - 1) {
                temp = temp.next;
                index2++;
            }

            Node nextNode = temp.next;
            temp.next = node;
            node.next = nextNode;
        }

        size++;
    }

    public boolean searchNode(int nodeValue) {
        Node temp = head;
        while (temp != null) {
            if (temp.value == nodeValue) {
                return true; // Node found
            }
            temp = temp.next;
        }
        return false; // Node not found
    }

    public Node findNode(int nodeValue) {
        Node temp = head;
        while (temp != null) {
            if (temp.value == nodeValue) {
                return temp; // Node found
            }
            temp = temp.next;
        }
        return null; // Node not found
    }

    public void traverseLinkedList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void deleteNode(int index) {
        if (head == null) {
            return; // do nothing as list is empty
        } else if (index == 0) {
            head = head.next; // head is now the second element
            if (head == null) { // if head becomes null set tail to null as there are no elements left
                tail = null;
            }
        } else if (index >= size) {
            System.out.println("Index is out of bounds for delete.");
            return; // Do nothing as index out of bounds
        } else {
            Node temp = head;
            int index2 = 0;
            while (index2 < index - 1) {
                temp = temp.next;
                index2++;
            }

            Node nodeToDelete = temp.next;
            temp.next = nodeToDelete.next;
            if (nodeToDelete == tail) { // if we've deleted tail, set tail
                tail = temp;
            }
        }

        size--;
    }

    public void deleteAll() {
        head = null;
        tail = null;
    }


    @Override
    public String toString() {
        return "SingleLL{" +
                "head=" + head +
                ", tail=" + tail +
                ", size=" + size +
                '}';
    }
}
