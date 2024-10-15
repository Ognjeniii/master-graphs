package Test;

import Algorithms.BellmanFord;
import Algorithms.Dijkstra;
import Algorithms.FloydWarshall;
import RandomGraphs.RandomAdjListOptimized;
import RandomGraphs.RandomAdjMatrix;

public class Test {

    public void testDijkstraBH(int V, double density) {
        RandomAdjListOptimized ral = new RandomAdjListOptimized(V, density);
        long startTime = System.currentTimeMillis();
        int[] res = Dijkstra.dijkstraOptimized(V, ral.getGraph(), 0);
        long duration = System.currentTimeMillis() - startTime;
        System.out.println("Vreme potrebno za izvršavanje Dajkstrinog algoritma koji se implementira pomoću" +
                " binarnog hipa, sa " + ral.getV() + " čvorova i " + ral.getE() + " grana je " + duration + "ms.");
    }

    public void testDijkstra(int V, double density) {
        RandomAdjMatrix ram = new RandomAdjMatrix(V, density);
        long startTime = System.currentTimeMillis();
        int[] res = Dijkstra.dijkstra(ram.getGraph(), 0);
        long duration = System.currentTimeMillis() - startTime;
        System.out.println("Vreme potrebno za izvršavanje klasičnog Dajkstrinog algortima sa " + ram.getV() +
                " čvorova i " + ram.getE() + " grana je " + duration + " ms.");
    }

    public void testBellmanFord(int V, double density) {
        RandomAdjListOptimized ral = new RandomAdjListOptimized(V, density);
        long startTime = System.currentTimeMillis();
        int[] res = BellmanFord.bellmanFord(V, ral.getGraph(), 0);
        long duration = System.currentTimeMillis() - startTime;
        System.out.println("Vreme potrebno za izvršavanje Belman-Fordovog algortima sa " + ral.getV() +
                " čvorova i " + ral.getE() + " grana je " + duration + " ms.");
    }

    public void testFloydWarshall(int V, double density) {
        RandomAdjMatrix ram = new RandomAdjMatrix(V, density);
        long startTime = System.currentTimeMillis();
        int[][] res = FloydWarshall.floydWarshall(ram.getGraph());
        long duration = System.currentTimeMillis() - startTime;
        System.out.println("Vreme potrebno za izvršavanje Flojd-Varšalovog algoritma nad grafom sa " +
                ram.getV() + " čvorova i " + ram.getE() + " grana je " + duration + "ms.");
    }
}
