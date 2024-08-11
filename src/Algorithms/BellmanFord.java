package Algorithms;

import Helper.Node;

import java.util.*;

public class BellmanFord {

    public int[] bellmanFord(Map<Integer, List<Node>> graph, int s) {
        int V = graph.size();

        int[] dist = new int[V]; // udaljenosti od početnog čvora
        Arrays.fill(dist, Integer.MAX_VALUE); // punimo ih sa beskonačno, jer su nam vrednosti nepoznate
        dist[s] = 0; // početni čvor na 0

        for(int i = 0; i < V - 1; i++) { // relaksacija V-1 puta
            for(Map.Entry<Integer, List<Node>> entry : graph.entrySet()) { // prolazimo kroz sve grane
                int u = entry.getKey(); // čvor od koga se ide
                for(Node node : entry.getValue()) {
                    int v = node.getVertex(); // čvor do koga se ide
                    int weight = node.getWeight(); // težina puta

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
                    int weight = node.getWeight();
                    if(dist[u] != Integer.MAX_VALUE && dist[u] + weight < dist[v])
                        dist[u] = Integer.MIN_VALUE;
                    return dist;
                }
            }
        }
        return dist;
    }
}
