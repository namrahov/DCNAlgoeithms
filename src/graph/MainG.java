package graph;

import java.util.ArrayList;

public class MainG {
    public static void main(String[] args) {
        ArrayList<GraphNode> nodeList = new ArrayList<>();
        nodeList.add(new GraphNode("A", 0));
        nodeList.add(new GraphNode("B", 1));
        nodeList.add(new GraphNode("C", 2));
        nodeList.add(new GraphNode("D", 3));
        nodeList.add(new GraphNode("E", 4));

        Graph graph = new Graph(nodeList);
        graph.undirectedEdge(0, 1);
        graph.undirectedEdge(0, 2);
        graph.undirectedEdge(0, 3);
        graph.undirectedEdge(1, 4);
        graph.undirectedEdge(2, 3);
        graph.undirectedEdge(3, 4);

        System.out.println("Graph Representation:");
        graph.printGraph();

        // Perform BFS starting from node "A"
        graph.bfs(nodeList.getFirst());
    }


}
