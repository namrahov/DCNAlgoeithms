package tree.bst2;

public class BinarySearchTree {
    private Node root;

    public BinarySearchTree() {
        this.root = null;
    }

    public void insert(int value) {
        root = insertElement(root, value);
    }

    public Node insertElement(Node root, int value) {
        if (root == null) {
            root = new Node(value);
            return root;
        }

        if (value < root.value) {
            root.left = insertElement(root.left, value);
        } else if (value > root.value) {
            root.right = insertElement(root.right, value);
        }

        return root;
    }

    // Method to search for a value
    public boolean search(int value) {
        return searchRec(root, value);
    }

    private boolean searchRec(Node root, int value) {
        if (root == null) {
            return false;
        }
        if (root.value == value) {
            return true;
        }
        return value < root.value ? searchRec(root.left, value) : searchRec(root.right, value);
    }

    public void printPreOrder() {
        printPreOrder(root);
    }

    private void printPreOrder(Node node) {
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

    // Print method to display the tree-like structure
    public void printTree() {
        printTree(root, 0);
    }

    void printTree(Node node, int level) {
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

    @Override
    public String toString() {
        return "BinarySearchTree{" +
                "root=" + root +
                '}';
    }
}
