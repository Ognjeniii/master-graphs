import Algorithms.BellmanFord;
import Algorithms.FloydWarshall;
import RandomGraphs.RandomAdjList;
import RandomGraphs.RandomAdjMatrix;

public class Main {
    public static void main(String[] args) {

        int numOfVertices = 10000;
//        RandomGraphs rg = new RandomGraphs(numOfVertices);
//
//        long startTimeD1 = System.currentTimeMillis();
//        int[] resD1 = Dijkstra.dijkstra(rg.getV(), rg.getList(), 0);
//        long elapsedTimeD1 = System.currentTimeMillis() - startTimeD1;
//
//        long startTimeD2 = System.currentTimeMillis();
//        int[] resD2 = Dijkstra.dijkstra(rg.getMatrix(), 0);
//        long elapsedTimeD2 = System.currentTimeMillis() - startTimeD2;
//
//        System.out.println();
//        System.out.println("Amount of time used for completing Dijkstras priority queue algorithm" +
//                " on graph with " + rg.getV() + " vertices and " + rg.getE() + " edges: " +
//                elapsedTimeD1 + "ms.");
//
//        System.out.println();
//        System.out.println("Amount of time used for completing Dijkstras basic algorithm " +
//                "on graph with " + rg.getV() + " vertices and " + rg.getE() + " edges: " +
//                elapsedTimeD2 + "ms.");

//        RandomAdjList rl = new RandomAdjList(numOfVertices);
//
//        long startTime = System.currentTimeMillis();
//        int[] res = BellmanFord.bellmanFord(rl.getGraph(), 0);
//        long elapsedTime = System.currentTimeMillis() - startTime;
//
//        System.out.println("Amount of time used for finishing Bellman-Fords algorithm on graph " +
//                "with " + rl.getV() + " vertices and " + rl.getE() + " edges: " + elapsedTime + "ms");

        RandomAdjMatrix rm = new RandomAdjMatrix(numOfVertices);

        long startTime = System.currentTimeMillis();
        int[][] res = FloydWarshall.floydWarshall(rm.getGraph());
        long elapsedTime = System.currentTimeMillis() - startTime;

        System.out.println("Amount of time used for execution Floyd-Warshall algo on graph with " +
                rm.getV() + " vertices and " + rm.getE() + " edges: " + elapsedTime + "ms.");
    }
}
