package tree.bst2;

public class MainBST {
    public static void main(String[] args) {
        BinarySearchTree bt = new BinarySearchTree();
        bt.insert(16);
        bt.insert(23);
        bt.insert(19);
        bt.insert(8);
        bt.insert(12);
        bt.insert(11);
        bt.insert(9);
        bt.insert(10);
        bt.insert(29);


        bt.printTree();
        bt.printPreOrder();

        System.out.println(bt.search(288));
    }
}
