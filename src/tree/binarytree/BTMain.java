package tree.binarytree;

public class BTMain {
    public static void main(String[] args) {
        BinaryTreeLL binaryTreeLL = new BinaryTreeLL();
        binaryTreeLL.insert("4");
        binaryTreeLL.insert("5");
        binaryTreeLL.insert("6");
        binaryTreeLL.insert("7");
        binaryTreeLL.insert("8");
        binaryTreeLL.insert("1");
        binaryTreeLL.insert("2");
        binaryTreeLL.insert("3");
        binaryTreeLL.insert("0");

        binaryTreeLL.printTree(binaryTreeLL.root, 0);
        binaryTreeLL.getMaxOfEachLevel().forEach(System.out::println);

    }
}
