package RandomGraphs;

import java.util.Random;

public class RandomAdjMatrix {
    int V; // broj čvorova
    int E; // broj grana
    int[][] graph; // graf

    // pomoću objekta random generišemo nasumične brojeve
    private static Random random = new Random();

    public RandomAdjMatrix() {

    }

    public RandomAdjMatrix(int V, double num) {
        this.V = V; // postavljane broja čvorova
        long e = Math.round((V * (V - 1) / 2) * num);
        E = (int)e;

        graph = new int[V][V]; // instanciranje polja graf

        int counter = 0;
        while (true) {
            if (counter == E)
                break;

            int u = random.nextInt(V); // generisanje izvornog čvora
            int v = random.nextInt(V); // generisanje čvora do koga se putuje

            if(graph[u][v] == 0) {
                int weight = random.nextInt(9) + 1; // generisanje težine grane
                graph[u][v] = weight; // dodavanje grane
                counter++;
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
