package linkedlist.singlell;


public class MainSLL {
    public static void main(String[] args) {
        SingleLL list = new SingleLL();
        list.createSingleLinkedList(5);

        list.insertLinkedList(3, 1);
        list.insertLinkedList(7, 2);

        System.out.println(list.findNode(3));
        list.traverseLinkedList();

    }
}
