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


    BinaryNode deleteRec(BinaryNode root, int value) {
        if (root == null) {
            return null;
        }

        // Traverse to the node to be deleted
        if (value < root.value) {
            root.left = deleteRec(root.left, value);
        } else if (value > root.value) {
            root.right = deleteRec(root.right, value);
        } else {
            // Node with only one child or no child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // Node with two children: get the inorder successor (smallest in the right subtree)
            root.value = minValue(root.right);

            // Delete the inorder successor
            root.right = deleteRec(root.right, root.value);
        }

        return root;
    }

    int minValue(BinaryNode root) {
        int minValue = root.value;
        while (root.left != null) {
            minValue = root.left.value;
            root = root.left;
        }
        return minValue;
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
