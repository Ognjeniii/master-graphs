package Algorithms;

public class FloydWarshall {

    public static int[][] floydWarshall(int[][] graph) {
        int V = graph.length;
        for(int k = 0; k < V; k++) { // među-čvor
            for(int i = 0; i < V; i++) { // redovi - čvor od koga se putuje
                for(int j = 0; j < V; j++) { // kolone - čvor do koga se putuje
                    if(graph[i][j] > graph[i][k] + graph[k][j]) // ako je težina puta manja preko među čvora
                        graph[i][j] = graph[i][k] + graph[k][j]; // ažurirati graf na indeksu [i, j] sa tom
                }                                                                               // vrednošću
            }
        }
        for(int k = 0; k < V; k++) { // proveravamo da li postoje negativni ciklusi u grafu
            for(int i = 0; i < V; i++) {
                for(int j = 0; j < V; j++) {
                    if(graph[i][j] > graph[i][k] + graph[k][j]) // ako postoje, postaviti vrednost na
                        graph[i][j] = Integer.MIN_VALUE;        //                      - beskonačno
                }
            }
        }
        return graph; // vraćamo relaksirani graf
    }
}
