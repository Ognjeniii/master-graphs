package RandomGraphs;

import Helper.Node;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomAdjListOptimized {
    int V; // broj čvorova
    int E; // broj grana
    List<Node>[] graph; // graf

    private static Random random = new Random();

    @SuppressWarnings("unchecked")
    public RandomAdjListOptimized(int V, double num) {
        this.V = V;
        long e = Math.round((V * (V - 1) / 2.0) * num);
        E = (int) e;

        graph = new ArrayList[V];
        for(int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }

        int counter = 0;
        while(counter < E) {
            int u = random.nextInt(V);
            int v = random.nextInt(V);
            if(u == v) continue; // izbegavajte samopetlje
            boolean exists = false;
            for(Node node : graph[u]) {
                if(node.getVertex() == v) {
                    exists = true;
                    break;
                }
            }
            if(!exists) {
                int weight = random.nextInt(7) + 3;
                graph[u].add(new Node(v, weight));
                counter++;
            }
        }
    }

    public List<Node>[] getGraph() {
        return graph;
    }

    public int getV() {
        return V;
    }

    public int getE() {
        return E;
    }
}
