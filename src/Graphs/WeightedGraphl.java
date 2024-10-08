package Graphs;

import Helper.Node;

import java.util.*;

public class WeightedGraphl {
    int numOfVertices;
    Map<Integer, List<Node>> g;

    public WeightedGraphl() {

    }

    public WeightedGraphl(int n) {
        this.numOfVertices = n;
        g = new HashMap<>();

        for(int i = 0; i < n; i++)
            g.put(i, new ArrayList<>());
    }

    public void addFromToEdge(int u, int v, int weight) {
        Node vertexAndWeight = new Node(v, weight);
        g.get(u).add(vertexAndWeight);
    }

    public void print() {
        System.out.println("Weighted graph:");
        for(int i = 0; i < g.size(); i++) {
            System.out.print(i + " = { ");
            for(int j = 0; j < g.get(i).size(); j++) {
                String s = j == g.get(i).size() - 1 ? "" : ",";
                System.out.print("[" + g.get(i).get(j).getVertex() + ", " + g.get(i).get(j).getWeight() + "]" + s);
            }
            System.out.print(" }");
            System.out.println();
        }
    }

    public Map<Integer, List<Node>> getGraph() {
        return g;
    }
}
