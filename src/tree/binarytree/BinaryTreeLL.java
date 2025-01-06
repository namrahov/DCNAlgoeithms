package tree.binarytree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLL {
    BinaryNode root;

    public BinaryTreeLL() {
        root = null;
    }

    // Insertion operation
    void insert(String value) {
        root = insert(root, value);
    }

    public BinaryNode insert(BinaryNode currentNode, String value) {
        if (currentNode == null) {
            // Base case: Found an empty spot, create a new node here.
            BinaryNode newNode = new BinaryNode();
            newNode.value = value;
            return newNode;
        } else if (value.compareTo(currentNode.value) < 0) {
            // Value is less than current node, go to the left subtree
            currentNode.left = insert(currentNode.left, value);
        } else {
            // Value is greater than or equal to current node, go to right subtree
            currentNode.right = insert(currentNode.right, value);
        }

        return currentNode; // Important: return the modified subtree

    }

    public List<String> getMaxOfEachLevel() {
        List<String> maxValues = new ArrayList<>();
        if(root == null){
            return maxValues; // Return empty list if tree is empty
        }

        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            int levelSize = queue.size();
            String maxVal = null; // track the largest at this level

            for(int i = 0 ; i < levelSize; i++){
                BinaryNode currentNode = queue.poll();
                if(maxVal == null || currentNode.value.compareTo(maxVal)> 0){
                    maxVal = currentNode.value; // update largest value at this level
                }

                if(currentNode.left != null){
                    queue.add(currentNode.left);
                }
                if(currentNode.right != null){
                    queue.add(currentNode.right);
                }

            }
            maxValues.add(maxVal);
        }

        return maxValues;
    }

    public void printTree(BinaryNode node, int level) {
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
}
