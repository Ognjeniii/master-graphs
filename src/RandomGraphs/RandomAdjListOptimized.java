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

    public RandomAdjListOptimized(int V, double num) {
        this.V = V; // postavljanje broja čvorova
        long e = Math.round((V * (V - 1) / 2.0) * num); // za dobijanje broja grana
        E = (int) e; // postavljanje broja grana

        graph = new ArrayList[V]; // zauzimanje mesta za graf
        for(int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }

        int counter = 0; // ovom promenljivom vodimo eviedenciju o broju grana
        while (counter < E) {
            int u = random.nextInt(V);
            int v = random.nextInt(V);
            if (u == v) continue; // izbegavanje samopetlje
            boolean exists = false; // pomoćna promenljiva
            for (Node node : graph[u]) {
                if (node.getVertex() == v) { // ako već postoji grana od u do v
                    exists = true;
                    break;
                }
            }
            if (!exists) {
                int weight = random.nextInt(7) + 3; // generiše se težina
                graph[u].add(new Node(v, weight)); // dodaje se grana
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
