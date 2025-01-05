package tree.binarysearchtree;

public class BinaryNode {
    int value;
    int height;
    BinaryNode left;
    BinaryNode right;

    public BinaryNode(int item) {
        value = item;
        left = right = null;
    }

    @Override
    public String toString() {
        return "BinaryNode{" +
                "value=" + value +
                ", height=" + height +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
