package graph;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class Graph {
    ArrayList<GraphNode> nodeList = new ArrayList<>();

    public Graph(ArrayList<GraphNode> nodeList) {
        this.nodeList = nodeList;
    }

    public void undirectedEdge(int i, int j) {
        GraphNode first = nodeList.get(i);
        GraphNode second = nodeList.get(j);
        first.neighbors.add(second);
        second.neighbors.add(first);

    }

    public void printGraph() {
        for (GraphNode node : nodeList) {
            System.out.print(node.name + ": ");
            for (GraphNode neighbor : node.neighbors) {
                System.out.print(neighbor.name + " ");
            }
            System.out.println();
        }
    }

    // BFS Algorithm
    public void bfs(GraphNode startNode) {
        Queue<GraphNode> queue = new LinkedList<>();
        HashSet<GraphNode> visited = new HashSet<>();

        queue.add(startNode);
        visited.add(startNode);

        System.out.println("BFS Traversal:");
        while (!queue.isEmpty()) {
            GraphNode currentNode = queue.poll();
            System.out.print(currentNode.name + " "); // Print the current node

            for (GraphNode neighbor : currentNode.neighbors) {
                if (!visited.contains(neighbor)) {
                    queue.add(neighbor);
                    visited.add(neighbor);
                }
            }
        }
    }

}
