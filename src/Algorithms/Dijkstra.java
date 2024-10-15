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

    public static int[] dijkstraOptimized(int V, List<Node>[] graph, int src) {
        int[] distance = new int[V]; // niz koji predstavlja dužine puteva od početnog čvora
        Arrays.fill(distance, Integer.MAX_VALUE); // postavljamo sve vrednosti na beskonačno
        distance[src] = 0; // početno teme na 0

        // kreiranje prioritog reda - prioritet imaju čvorovi sa manjom vrednošću distance
        PriorityQueue<Node> pq = new PriorityQueue<>((v1, v2) -> v1.getWeight() - v2.getWeight());
        pq.add(new Node(src, 0)); // dodaje se početno teme

        boolean[] visited = new boolean[V]; // praćenje posećenih čvorova

        while (!pq.isEmpty()) {
            Node curr = pq.poll(); // uzima se čvor sa najmanjom težinom grane
            int u = curr.getVertex(); // tekući čvor

            if (visited[u]) continue; // ako je već posećen, preskoči ga
            visited[u] = true; // označi čvor kao posećen

            // prolazak kroz susedne čvorove tekućeg čvora
            for (Node neighbor : graph[u]) {
                int v = neighbor.getVertex(); // susedni čvor
                int weight = neighbor.getWeight(); // težina ivice između u i v

                // relaksacija: ako je kraći put pronađen do susednog čvora
                if (distance[u] + weight < distance[v]) {
                    distance[v] = distance[u] + weight;
                    pq.add(new Node(v, distance[v])); // dodaj susedni čvor u pq sa novom težinom
                }
            }
        }

        return distance; // vraćamo niz udaljenosti
    }
}
