package Graphs;

import java.util.Map;

public class Graphm {
    public int n; // broj čvorova u grafu

    public int[][] g; // matrica



    Graphm(int x) {
        this.n = x;
        g = new int[n][n];
    }

    public void print() {
        System.out.println("\n\nAdjacency matrix:");

        for(int i = 0; i < n; i++) {
            System.out.println();
            for(int j = 0; j < n; j++) {
                System.out.print("   " + g[i][j]);
            }
        }
        System.out.println();
    }

    public void addEdge(int x, int y) {
        // Check if vertex exists in graph
        if((x >= n) || (y > n)) {
            System.out.println("Vertex does not exists!");
        }

        // check if vertex is connected to itself
        if(x == y) {
            System.out.println("Same vertex.");
        }
        else {
            g[x][y] = 1;
            g[y][x] = 1;
        }
    }

    public void addVertex() { // ovo je dobro
        n++;

        // init new elements to 0
        for(int i = 0; i < n; i++) {
            g[i][n - 1] = 0;
            g[n - 1][i] = 0;
        }
    }

    public void removeVertex(int x) {
        // Checking if vertex is present
        if(x > n) {
            System.out.println("Vertex not present!");
            return;
        }
        else {
            int i;

            while (x < n)
            {
                // shifting the rows to left side
                for (i = 0; i < n; ++i)
                {
                    g[i][x] = g[i][x + 1];
                }

                // shifting the columns upwards
                for (i = 0; i < n; ++i)
                {
                    g[x][i] = g[x + 1][i];
                }
                x++;
            }
            n--;
        }
    }

    public void dft(Map<Integer, Integer> graph, int start) {

    }

}
