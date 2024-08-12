import Algorithms.Dijkstra;
import Algorithms.Traversals;
import RandomGraphs.RandomAdjList;
import RandomGraphs.RandomAdjMatrix;

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
//        int graph[][]
//                = new int[][] { { 0, 4, 0, 0, 0, 0, 0, 8, 0 },
//                { 4, 0, 8, 0, 0, 0, 0, 11, 0 },
//                { 0, 8, 0, 7, 0, 4, 0, 0, 2 },
//                { 0, 0, 7, 0, 9, 14, 0, 0, 0 },
//                { 0, 0, 0, 9, 0, 10, 0, 0, 0 },
//                { 0, 0, 4, 14, 10, 0, 2, 0, 0 },
//                { 0, 0, 0, 0, 0, 2, 0, 1, 6 },
//                { 8, 11, 0, 0, 0, 0, 1, 0, 7 },
//                { 0, 0, 2, 0, 0, 0, 6, 7, 0 } };
//
//        Dijkstra.dijkstra(graph, 0);

        // 1 sec = 1000 ms

        int numOfVertices = 10000;
//        long start = System.currentTimeMillis();
//        RandomAdjList ra = new RandomAdjList(numOfVertices);
//        long elapsedTime = System.currentTimeMillis() - start;
//
//        ra.print();
//
//        System.out.println("Time used for rg: " + elapsedTime + "ms");

//        Number of vertices: 3000
//        Number of edges: 4497000
//        Time used for rg: 13662ms

//        long start1 = System.currentTimeMillis();
//        int src = 5;
//        int[] res = Dijkstra.dijkstra(numOfVertices, ra.graph, src);

//        System.out.print("Elements: ");
//        for(var i : res) {
//            System.out.print(i + " ");
//        }
//
//        System.out.println();
//        long elapsedTime1 = System.currentTimeMillis() - start1;
//
//        System.out.println("Time used for dijkstra with " + ra.E + " edges: " + elapsedTime1 + "ms");

        long s = System.currentTimeMillis();
        RandomAdjMatrix am = new RandomAdjMatrix(numOfVertices);
        long es = System.currentTimeMillis() - s;
        System.out.println("Time used for creation: " + es + "ms");
    }
}
