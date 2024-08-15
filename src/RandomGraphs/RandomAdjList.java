package RandomGraphs;

import java.util.*;

import Helper.Node;

public class RandomAdjList {
    int V; // broj čvorova
    int E; // broj grana
    Map<Integer, List<Node>> graph; // graf

    // pomoću random objekta generišemo nasumične brojeve
    static Random random = new Random();

    public RandomAdjList() {

    }

    public RandomAdjList(int V) {
        this.V = V; // postavljanje broja čvorova
        E = V * 500; // postavljanje broja grana
        //E = V * 5;

        graph = new HashMap<>(V);
        for(int i = 0; i < V; i++)
            graph.put(i, new ArrayList<>()); // popunjavanje grafa praznim listama

        for(int i = 0; i < E; i++) {
            int u = random.nextInt(V); // generisanje izvornog čvora
            int v = random.nextInt(V); // generisanje čvora do kog se putuje
            int weight = random.nextInt(7) + 3; // generisanje težine grane

            if(graph.get(u).stream().noneMatch(x -> x.getVertex() == v)) {
                Node node = new Node(v, weight);
                addEdge(u, node); // dodavanje grane u graf
            }
        }
    }

    public void addEdge(int vertexFrom, Node node) {
        if(!graph.containsKey(vertexFrom)) // da li postoji izvorni čvor
            graph.put(vertexFrom, new ArrayList<>());

        if(!graph.containsKey(node.getVertex())) // da li postoji čvor do koga se putuje
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
