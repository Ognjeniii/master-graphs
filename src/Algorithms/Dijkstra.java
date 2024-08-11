package Algorithms;

import Helper.Node;

import java.util.*;

public class Dijkstra {

    public static int[] dijkstra(int V, Map<Integer, List<Node>> g, int src) {
        int[] distance = new int[V]; // niz koji predstavlja dužine puteva od početnog čvora

        for(int i = 0; i < V; i++) {
            distance[i] = Integer.MAX_VALUE; // postavljamo sve vrednosti na beskonačno
        }
        distance[src] = 0; // početno teme na 0

        // kreiranje prioritog reda - prioritet imaju grane sa manjom vrednošću
        PriorityQueue<Node> pq = new PriorityQueue<>((v1, v2) -> v1.getWeight() - v2.getWeight());
        pq.add(new Node(src, 0)); // dodaje se početno teme

        while(pq.size() > 0) {
            Node curr = pq.poll(); // vraća se čvor sa najmanjom težinom grane

            for(Node n : g.get(curr.getVertex())) { // prolazak kroz susedne čvorove
                if(distance[curr.getVertex()] + n.getWeight() < distance[n.getVertex()]) { // relaksacija
                    distance[n.getVertex()] = n.getWeight() + distance[curr.getVertex()];

                    pq.add(new Node(n.getVertex(), distance[n.getVertex()])); // dodaje se tekući čvor u pq
                }
            }
        }

        return distance; // vraćamo niz udaljenosti
    }

    public static int[] dijkstra(int[][] graph, int src) {
        int V = graph.length;
        int[] dist = new int[V]; // ovo će biti rezultat - udaljenosti od početnog temena

        boolean[] sptSet = new boolean[V]; // pomoću ovog niza ćemo voditi evidenciju o posećenim čvorovima
        Arrays.fill(dist, Integer.MAX_VALUE); // postavljamo udaljenosti na beskonačne vrednosti

        dist[src] = 0; // udaljenost od početnog temena do početnog temena je 0

        for(int count = 0; count < V - 1; count++) {
            int u = minDistance(dist, sptSet, V); // ovde gledamo koji ćemo prvi sledeći elem da relaksiramo
            sptSet[u] = true; // postavljamo ga na true, jer smo ga posetili

            for(int v = 0; v < V; v++) {
                if(!sptSet[v] && graph[u][v] != 0
                && dist[u] != Integer.MAX_VALUE
                && dist[u] + graph[u][v] < dist[v])
                    dist[v] = dist[u] + graph[u][v]; // relaksiramo teme
            } // ovde ažuriramo distancu od početnog temena
        }

        return dist;
    }

    static int minDistance(int[] dist, boolean[] sptSet, int V) {
        int min = Integer.MAX_VALUE;
        int minIndex = -1;

        for(int i = 0; i < V; i++) {
            // ako čvor još uvek nije razmatran i ako se može doći do njega preko već vidjenih čvorova
            if(sptSet[i] == false && dist[i] <= min) {
                min = dist[i];
                minIndex = i;
            }
        }

        return minIndex; // vraćamo sledeći čvor za ažuriranje
    }
}
