package graph;

import java.util.ArrayList;

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

}
