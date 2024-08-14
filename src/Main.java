import Algorithms.BellmanFord;
import Algorithms.Dijkstra;
import Algorithms.FloydWarshall;
import Algorithms.Traversals;
import RandomGraphs.RandomAdjList;
import RandomGraphs.RandomAdjMatrix;
import RandomGraphs.RandomGraphs;

import java.sql.SQLOutput;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {

        int numOfVertices = 5;

        RandomGraphs r = new RandomGraphs(numOfVertices);

        long startTimed1 = System.currentTimeMillis();
        int[] resl = Dijkstra.dijkstra(r.getV(), r.getList(), 1);
        long elapsedTimed1 = System.currentTimeMillis() - startTimed1;

        long startTimed2 = System.currentTimeMillis();
        int[] resm = Dijkstra.dijkstra(r.getMatrix(), 1);
        long elapsedTimed2 = System.currentTimeMillis() - startTimed2;



        System.out.println("Time amount used for Dijkstra with adjacency list representation: " + elapsedTimed1 + "ms");
        System.out.println("Time amount used for Dijkstra with adjacency matrix representation: " + elapsedTimed2 + "ms");

        for (int i = 0; i < resl.length; i++) {
            System.out.println(i + "--->" + resl[i] + "     " + i + "--->" + resm[i]);
        }

//        RandomAdjList rl = new RandomAdjList(5000);
//        System.out.println("Broj grana: " + rl.E);

        r.printList();
        System.out.println();
        r.printMatrix();

    }
}
