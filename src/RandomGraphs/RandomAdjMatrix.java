package RandomGraphs;

import java.util.Random;

public class RandomAdjMatrix {
    int V; // broj čvorova
    int E; // broj grana
    int[][] graph; // graf

    // pomoću objekta random generišemo nasumične brojeve
    static Random random = new Random();

    public RandomAdjMatrix() {

    }

    public RandomAdjMatrix(int V) {
        this.V = V; // postavljane broja čvorova
        //E = V * 500; // postavljanje broja grana
        //E = V * 5;
        graph = new int[V][V]; // instanciranje polja graf

        //int e = V * 5;
        int e = V * 500;

        for(int i = 0; i < e; i++) {
            int u = random.nextInt(V); // generisanje izvornog čvora
            int v = random.nextInt(V); // generisanje čvora do koga se putuje
            int weight = random.nextInt(9) + 1; // generisanje težine grane

            if(graph[u][v] == 0) {
                graph[u][v] = weight; // dodavanje grane
                E++;
            }
        }
    }

    public void print() {
        for(int i = 0; i < V; i++) {
            for(int j = 0; j < V; j++) {
                System.out.print(graph[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public int[][] getGraph() {
        return graph;
    }

    public int getE() {
        return E;
    }

    public int getV() {
        return V;
    }
}
