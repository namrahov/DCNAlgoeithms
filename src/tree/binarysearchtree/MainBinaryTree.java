package tree.binarysearchtree;

public class MainBinaryTree {
    public static void main(String[] args) {

        BSTree tree = new BSTree();
        // Insert elements into the tree
        tree.insert(8);
        tree.insert(3);
        tree.insert(10);
        tree.insert(1);
        tree.insert(6);
        tree.insert(6);
        tree.insert(14);
        tree.insert(13);
        tree.insert(15);


       //tree.search(tree.root, 15);
       tree.deleteRec(tree.root, 14);
       tree.printTree();
        //  System.out.println(tree);
    }
}
