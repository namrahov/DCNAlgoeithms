package linkedlist.problems;

import linkedlist.singlell.Node;
import linkedlist.singlell.SingleLL;

import java.util.HashSet;
import java.util.Set;

public class RemoveDublicat {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<Integer>();

        SingleLL linkedlist = new SingleLL();
        linkedlist.insertLinkedList(3, 0);
        linkedlist.insertLinkedList(2, 1);
        linkedlist.insertLinkedList(6, 2);
        linkedlist.insertLinkedList(2, 3);
        linkedlist.insertLinkedList(7, 4);
        linkedlist.traverseLinkedList();

        Node temp = linkedlist.head;
        while (temp != null) {
            set.add(temp.value);
            temp = temp.next;
        }

        System.out.println(set);
    }
}
