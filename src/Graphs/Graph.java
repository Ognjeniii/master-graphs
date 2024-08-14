package Graphs;

public class Graph {
    public int V; // broj čvorova
    public int[][] graph; // graf

    public Graph() { // podrazumevani konstruktor

    }

    public Graph(int V) { // parametarski konstruktor
        this.V = V; // postavljanje broja čvorova
        graph = new int[V][V]; // zauzimanje prostora za matricu
    }

    public void addEdge(int u, int v, int weight) {
        if(u >= 0 && u < V && v >= 0 && v < V)
            graph[u][v] = weight;
    }

    public void addVertex() {
        V++; // povećavanje broja čvorova za 1
        int[][] newGraph = new int[V][V]; // kreiranje novog grafa

        for(int i = 0; i < V - 1; i++) { // koprianje starog grafa u novi
            for(int j = 0; j < V - 1; j++) {
                newGraph[i][j] = graph[i][j];
            }
        }

        graph = newGraph; // ažuriranje reference
    }

    public void removeVertex2(int x) {
        if(x < V) { // ako čvor postoji u grafu

            int[][] newGraph = new int[V - 1][V - 1];

            for(int i = 0; i < V - 1; i++) {
                for(int j = 0; j < V - 1; j++){
                    newGraph[i][j] = graph[i][j];
                }
            }

            while (x < V - 1)
            {
                for (int i = 0; i < V; ++i) // pomeramo redove na levu stranu
                    newGraph[i][x] = graph[i][x + 1];

                for (int i = 0; i < V; ++i) // pomeramo kolone na gore
                    newGraph[x][i] = graph[x + 1][i];

                x++;
            }
            V--;

            graph = newGraph;
        }
    }

    public void fillUpGraph() {
        for(int i = 0; i < V; i++) {
            for(int j = 0; j < V; j++) {
                graph[i][j] = i;
            }
        }
    }

    public void removeVertex(int vertex) {
        if(vertex > 0 && vertex < V) { // proveravamo da li zadati čvor postoji
            V--;
            int[][] newGraph = new int[V][V]; // zauzimanje memorije za novi graf

            int rowOffset = 0; // promenljiva koja nam pomaže da pogodimo tačan red
            for (int i = 0; i < V + 1; i++) {
                if (i == vertex) { // znak da smo u redu u kom ne treba da postoji element
                    rowOffset = 1;
                    continue; // preskačemo dodavanje elementa u novi graf
                }
                int colOffset = 0; // promenljiva koja nam pomaže da pogodimo tačnu kolonu
                for (int j = 0; j < V + 1; j++) {
                    if (j == vertex) { // znak da smo u koloni u kojoj ne treba da postoji element
                        colOffset = 1;
                        continue; // preskačemo dodavanje elementa u novi graf
                    }
                    newGraph[i - rowOffset][j - colOffset] = graph[i][j];
                }
            }

            graph = newGraph; // referenciranje
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

}

