package RandomGraphs;

import java.util.*;

import Helper.Node;

public class RandomAdjList {
    int V; // broj čvorova
    int E; // broj grana
    Map<Integer, List<Node>> graph; // graf

    // pomoću random objekta generišemo nasumične brojeve
    private static Random random = new Random();

    public RandomAdjList() {

    }

    public RandomAdjList(int V, double num) {
        this.V = V; // postavljanje broja čvorova
        long e = Math.round((V * (V - 1) / 2) * num); // formula za dobijanje broja grana
        E = (int) e; // postavljanje broja grana

        graph = new HashMap<>(V);
        for(int i = 0; i < V; i++)
            graph.put(i, new ArrayList<>()); // popunjavanje grafa praznim listama

        int counter = 0; // ovom promenljivom vodimo evidenciju o broju grana
        while(true) {
            if (counter == E) // ako smo dobili željeni broj grana
                break;

            int u = random.nextInt(V); // generisanje izvornog čvora
            int v = random.nextInt(V); // generisanje čvora do kog se putuje

            if(graph.get(u).stream().noneMatch(x -> x.getVertex() == v)) {
                int weight = random.nextInt(7) + 3;
                Node node = new Node(v, weight);
                addEdge(u, node); // dodavanje grane u graf
                counter++;
            }
        }
    }

    public void addEdge(int vertexFrom, Node node) {
        if (!graph.containsKey(vertexFrom)) // da li postoji izvorni čvor
            graph.put(vertexFrom, new ArrayList<>());

        if (!graph.containsKey(node.getVertex())) // da li postoji čvor do koga se putuje
            graph.put(node.getVertex(), new ArrayList<>());

        graph.get(vertexFrom).add(node); // dodavanje node-a u graf
    }

    public void print() {
        for(int i = 0; i < V; i++) {
            System.out.print(i + ": [ ");
            for(int j = 0; j < graph.get(i).size(); j++) {
                System.out.print(j == graph.get(i).size() - 1 ? graph.get(i).get(j) + " ]" : graph.get(i).get(j) + ", ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Number of vertices: " + V);
        System.out.println("Number of edges: " + getE());
    }

    public int getV() {
        return V;
    }

    public int getE() {
        int count = 0;
        for (int i = 0; i < graph.size(); i++) {
            count += graph.get(i).size();
        }

        return count;
    }

    public Map<Integer, List<Node>> getGraph() {
        return graph;
    }
}
