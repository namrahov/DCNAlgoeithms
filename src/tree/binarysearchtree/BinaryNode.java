package tree.binarysearchtree;

public class BinaryNode {
    public int value;
    public int height;
    public BinaryNode left;
    public BinaryNode right;

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
