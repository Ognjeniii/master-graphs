package Algorithms;

import Helper.Node;

import java.util.*;

public class BellmanFord {

    public static double[] bellmanFord(Map<Integer, List<Node>> graph, int s) {
        int V = graph.size();
        double[] dist = new double[V]; // udaljenosti od početnog čvora
        Arrays.fill(dist, Double.POSITIVE_INFINITY); // punimo ih sa beskonačno, jer su nam vrednosti nepoznate
        dist[s] = 0; // početni čvor na 0

        for(int i = 0; i < V - 1; i++) { // relaksacija V-1 puta
            for(Map.Entry<Integer, List<Node>> entry : graph.entrySet()) { // prolazimo kroz sve grane
                int u = entry.getKey(); // čvor od koga se ide
                for(Node node : entry.getValue()) {
                    int v = node.getVertex(); // čvor do koga se ide
                    double weight = node.getWeight(); // težina puta

                    if(dist[u] != Integer.MAX_VALUE && dist[u] + weight < dist[v])
                        dist[v] = dist[u] + weight; // relaksacija
                }
            }
        }

        for(int i = 0; i < V - 1; i++) { // detekcija negativnih ciklusa
            for(Map.Entry<Integer, List<Node>> entry : graph.entrySet()) {
                int u = entry.getKey();
                for(Node node : entry.getValue()) {
                    int v = node.getVertex();
                    double weight = node.getWeight();
                    if(dist[u] != Double.POSITIVE_INFINITY && dist[u] + weight < dist[v])
                        dist[u] = Double.POSITIVE_INFINITY;
                }
            }
        }
        return dist;
    }


    public static double[] bellmanFord(int V, List<Node>[] graph, int s) {
        double[] dist = new double[V]; // udaljenosti od početnog temena
        Arrays.fill(dist, Double.POSITIVE_INFINITY); // postavljamo vrednosti na beskonačno
        dist[s] = 0;

        for(int i = 0; i < V - 1; i++) {
            boolean updated = false;
            for(int u = 0; u < V; u++) {
                for(Node node : graph[u]) {
                    int v = node.getVertex();
                    double weight = node.getWeight();
                    if(dist[u] != Double.POSITIVE_INFINITY && dist[u] + weight < dist[v]) {
                        dist[v] = dist[u] + weight;
                        updated = true;
                    }
                }
            }
            if(!updated) break;
        }

        // Detekcija negativnih ciklusa
        for(int u = 0; u < V; u++) {
            for(Node node : graph[u]) {
                int v = node.getVertex();
                double weight = node.getWeight();
                if(dist[u] != Double.POSITIVE_INFINITY && dist[u] + weight < dist[v]) {
                    dist[v] = Double.POSITIVE_INFINITY;
                }
            }
        }

        return dist;
    }
}
