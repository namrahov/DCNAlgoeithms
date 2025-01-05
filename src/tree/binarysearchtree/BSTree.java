package tree.binarysearchtree;


public class BSTree {
    BinaryNode root;

    public BSTree() {
        this.root = null;
    }

    // Insertion operation
    void insert(int value) {
        root = insertRec(root, value);
    }

    BinaryNode insertRec(BinaryNode root, int value) {
        if (root == null) {
            BinaryNode newNode = new BinaryNode(value);
            return newNode;
        }

        if (value < root.value)
            root.left = insertRec(root.left, value);
        else if (value > root.value)
            root.right = insertRec(root.right, value);

        return root;
    }

    //search
    public BinaryNode search(BinaryNode node, int value) {
        if(node == null) {
            return null;
        } else if (node.value > value) {
            return search(node.left, value);
        } else if (node.value == value) {
            System.out.println("finded="+value);
            return node;
        } else {
            return search(node.right, value);
        }

    }


    // Print method to display the tree-like structure
    public void printTree() {
        printTree(root, 0);
    }

    void printTree(BinaryNode node, int level) {
        if (node == null) {
            return;
        }

        // Print the right subtree first (with increased indentation)
        printTree(node.right, level + 1);

        // Print the current node value with indentation
        System.out.println("  ".repeat(level) + "- " + node.value);

        // Print the left subtree (with increased indentation)
        printTree(node.left, level + 1);
    }

    public void printPreOrder() {
        printPreOrder(root);
    }

    private void printPreOrder(BinaryNode node) {
        if (node == null) {
            return;
        }
        // Print the current node value
        System.out.print(node.value + " ");
        // Traverse the left subtree
        printPreOrder(node.left);
        // Traverse the right subtree
        printPreOrder(node.right);
    }

    @Override
    public String toString() {
        return "BSTree{" +
                "root=" + root +
                '}';
    }
}
