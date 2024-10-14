import Algorithms.BellmanFord;
import Algorithms.Dijkstra;
import Algorithms.FloydWarshall;
import RandomGraphs.RandomAdjList;
import RandomGraphs.RandomAdjListOptimized;
import RandomGraphs.RandomAdjMatrix;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        double density = 0.2;

        // <editor-fold desc="Dijkstra algorithm">

//        System.out.println("============================================= DIJKSTRA =============================================\n" +
//                           "===================================================================================================\n");

//        System.out.println("--------------------- Basic implementation --------------------------------------------------------");
//
//        RandomAdjMatrix ram1 = new RandomAdjMatrix(100, density);
//        long startTime = System.currentTimeMillis();
//        int[] res = Dijkstra.dijkstra(ram1.getGraph(), 0);
//        long endTime = System.currentTimeMillis() - startTime;
//        System.out.println("Vreme potrebno za izvršavanje klasičnog Dajkstrinog algortima sa " + ram1.getV() +
//                " čvorova i " + ram1.getE() + " grana je " + endTime + " milisekundi.");
//
//        RandomAdjMatrix ram2 = new RandomAdjMatrix(500, density);
//        startTime = System.currentTimeMillis();
//        res = Dijkstra.dijkstra(ram2.getGraph(), 0);
//        endTime = System.currentTimeMillis() - startTime;
//        System.out.println("Vreme potrebno za izvršavanje klasičnog Dajkstrinog algortima sa " + ram2.getV() +
//                " čvorova i " + ram2.getE() + " grana je " + endTime + " milisekundi.");
//
//        RandomAdjMatrix ram3 = new RandomAdjMatrix(1000, density);
//        startTime = System.currentTimeMillis();
//        res = Dijkstra.dijkstra(ram3.getGraph(), 0);
//        endTime = System.currentTimeMillis() - startTime;
//        System.out.println("Vreme potrebno za izvršavanje klasičnog Dajkstrinog algortima sa " + ram3.getV() +
//                " čvorova i " + ram3.getE() + " grana je " + endTime + " milisekundi.");
//
//        RandomAdjMatrix ram4 = new RandomAdjMatrix(2000, density);
//        startTime = System.currentTimeMillis();
//        res = Dijkstra.dijkstra(ram4.getGraph(), 0);
//        endTime = System.currentTimeMillis() - startTime;
//        System.out.println("Vreme potrebno za izvršavanje klasičnog Dajkstrinog algortima sa " + ram4.getV() +
//                " čvorova i " + ram4.getE() + " grana je " + endTime + " milisekundi.");
//
//        RandomAdjMatrix ram5 = new RandomAdjMatrix(4000, density);
//        startTime = System.currentTimeMillis();
//        res = Dijkstra.dijkstra(ram5.getGraph(), 0);
//        endTime = System.currentTimeMillis() - startTime;
//        System.out.println("Vreme potrebno za izvršavanje klasičnog Dajkstrinog algortima sa " + ram5.getV() +
//                " čvorova i " + ram5.getE() + " grana je " + endTime + " milisekundi.");
//
//        RandomAdjMatrix ram6 = new RandomAdjMatrix(6000, density);
//        startTime = System.currentTimeMillis();
//        res = Dijkstra.dijkstra(ram6.getGraph(), 0);
//        endTime = System.currentTimeMillis() - startTime;
//        System.out.println("Vreme potrebno za izvršavanje klasičnog Dajkstrinog algortima sa " + ram6.getV() +
//                " čvorova i " + ram6.getE() + " grana je " + endTime + " milisekundi.\n");


//        System.out.println("--------------------- Binary heap implementation --------------------------------------------------");
//
//        RandomAdjList ral1 = new RandomAdjList(100, density);
//        long startTime = System.currentTimeMillis();
//        int[] res = Dijkstra.dijkstra(100, ral1.getGraph(), 0);
//        long endTime = System.currentTimeMillis() - startTime;
//        System.out.println("Vreme potrebno za izvršenje dajkstrin algoritma sa " + ral1.getV() + " čvorova i " + ral1.getE() +
//                " grana je " + endTime + "ms");
//
//        RandomAdjList ral2 = new RandomAdjList(500, density);
//        startTime = System.currentTimeMillis();
//        res = Dijkstra.dijkstra(500, ral2.getGraph(), 0);
//        endTime = System.currentTimeMillis() - startTime;
//        System.out.println("Vreme potrebno za izvršenje dajkstrin algoritma sa " + ral2.getV() + " čvorova i " + ral2.getE() +
//                " grana je " + endTime + "ms");
//
//        RandomAdjList ral3 = new RandomAdjList(1000, density);
//        startTime = System.currentTimeMillis();
//        res = Dijkstra.dijkstra(1000, ral3.getGraph(), 0);
//        endTime = System.currentTimeMillis() - startTime;
//        System.out.println("Vreme potrebno za izvršenje dajkstrin algoritma sa " + ral3.getV() + " čvorova i " + ral3.getE() +
//                " grana je " + endTime + "ms");
//
//        RandomAdjList ral4 = new RandomAdjList(2000, density);
//        long startTime4 = System.currentTimeMillis();
//        res = Dijkstra.dijkstra(2000, ral4.getGraph(), 0);
//        endTime = System.currentTimeMillis() - startTime4;
//        System.out.println("Vreme potrebno za izvršenje dajkstrin algoritma sa " + ral4.getV() + " čvorova i " + ral4.getE() +
//                " grana je " + endTime + "ms");
//
//        RandomAdjList ral5 = new RandomAdjList(4000, density);
//        startTime = System.currentTimeMillis();
//        res = Dijkstra.dijkstra(4000, ral5.getGraph(), 0);
//        endTime = System.currentTimeMillis() - startTime;
//        System.out.println("Vreme potrebno za izvršenje dajkstrin algoritma sa " + ral5.getV() + " čvorova i " + ral5.getE() +
//                " grana je " + endTime + "ms");
//
//        RandomAdjList ral6 = new RandomAdjList(6000, density);
//        startTime = System.currentTimeMillis();
//        res = Dijkstra.dijkstra(6000, ral6.getGraph(), 0);
//        endTime = System.currentTimeMillis() - startTime;
//        System.out.println("Vreme potrebno za izvršenje dajkstrin algoritma sa " + ral6.getV() + " čvorova i " + ral6.getE() +
//                " grana je " + endTime + "ms");
//
//        System.out.println();


// </editor-fold>

        //<editor-fold desc="Bellman-Ford algorithm">

//        System.out.println("============================================= BELMAN-FORD =============================================\n");
//
//        RandomAdjList ral1 = new RandomAdjList(100, density);
//        long startTime = System.currentTimeMillis();
//        int[] res = BellmanFord.bellmanFord(ral1.getGraph(), 0);
//        long endTime = System.currentTimeMillis() - startTime;
//        System.out.println("Time used for Belman-Ford algorithm with " + ral1.getV() + " vertices and " + ral1.getE() +
//                " edges is " + endTime + "ms");
//
//        RandomAdjList ral2 = new RandomAdjList(500, density);
//        startTime = System.currentTimeMillis();
//        res = BellmanFord.bellmanFord(ral2.getGraph(), 0);
//        endTime = System.currentTimeMillis() - startTime;
//        System.out.println("Time used for Belman-Ford algorithm with " + ral2.getV() + " vertices and " + ral2.getE() +
//                " edges is " + endTime + "ms");
//
//        RandomAdjList ral3 = new RandomAdjList(1000, density);
//        startTime = System.currentTimeMillis();
//        res = BellmanFord.bellmanFord(ral3.getGraph(), 0);
//        endTime = System.currentTimeMillis() - startTime;
//        System.out.println("Time used for Belman-Ford algorithm with " + ral3.getV() + " vertices and " + ral3.getE() +
//                " edges is " + endTime + "ms");
//
//        RandomAdjList ral4 = new RandomAdjList(2000, density);
//        startTime = System.currentTimeMillis();
//        res = BellmanFord.bellmanFord(ral4.getGraph(), 0);
//        endTime = System.currentTimeMillis() - startTime;
//        System.out.println("Time used for Belman-Ford algorithm with " + ral4.getV() + " vertices and " + ral4.getE() +
//                " edges is " + endTime + "ms");
//
//        RandomAdjList ral5 = new RandomAdjList(4000, density);
//        startTime = System.currentTimeMillis();
//        res = BellmanFord.bellmanFord(ral5.getGraph(), 0);
//        endTime = System.currentTimeMillis() - startTime;
//        System.out.println("Time used for Belman-Ford algorithm with " + ral5.getV() + " vertices and " + ral5.getE() +
//                " edges is " + endTime + "ms");
//
//        RandomAdjList ral6 = new RandomAdjList(6000, density);
//        startTime = System.currentTimeMillis();
//        res = BellmanFord.bellmanFord(ral6.getGraph(), 0);
//        endTime = System.currentTimeMillis() - startTime;
//        System.out.println("Time used for Belman-Ford algorithm with " + ral6.getV() + " vertices and " + ral6.getE() +
//                " edges is " + endTime + "ms");

        // second implementation

        RandomAdjListOptimized ralo1 = new RandomAdjListOptimized(100, density);
        long startTime = System.currentTimeMillis();
        int[] res = BellmanFord.bellmanFord(100, ralo1.getGraph(), 0);
        long endTime = System.currentTimeMillis() - startTime;
        System.out.println("Time used for Belman-Ford algorithm with " + ralo1.getV() + " vertices and " + ralo1.getE() +
                " edges is " + endTime + "ms");

        RandomAdjListOptimized ralo2 = new RandomAdjListOptimized(500, density);
        startTime = System.currentTimeMillis();
        res = BellmanFord.bellmanFord(500, ralo1.getGraph(), 0);
        endTime = System.currentTimeMillis() - startTime;
        System.out.println("Time used for Belman-Ford algorithm with " + ralo2.getV() + " vertices and " + ralo2.getE() +
                " edges is " + endTime + "ms");

        RandomAdjListOptimized ralo3 = new RandomAdjListOptimized(1000, density);
        startTime = System.currentTimeMillis();
        res = BellmanFord.bellmanFord(1000, ralo3.getGraph(), 0);
        endTime = System.currentTimeMillis() - startTime;
        System.out.println("Time used for Belman-Ford algorithm with " + ralo3.getV() + " vertices and " + ralo3.getE() +
                " edges is " + endTime + "ms");

        RandomAdjListOptimized ralo4 = new RandomAdjListOptimized(2000, density);
        startTime = System.currentTimeMillis();
        res = BellmanFord.bellmanFord(2000, ralo4.getGraph(), 0);
        endTime = System.currentTimeMillis() - startTime;
        System.out.println("Time used for Belman-Ford algorithm with " + ralo4.getV() + " vertices and " + ralo4.getE() +
                " edges is " + endTime + "ms");

        RandomAdjListOptimized ralo5 = new RandomAdjListOptimized(4000, density);
        startTime = System.currentTimeMillis();
        res = BellmanFord.bellmanFord(4000, ralo5.getGraph(), 0);
        endTime = System.currentTimeMillis() - startTime;
        System.out.println("Time used for Belman-Ford algorithm with " + ralo5.getV() + " vertices and " + ralo5.getE() +
                " edges is " + endTime + "ms");

        RandomAdjListOptimized ralo6 = new RandomAdjListOptimized(6000, density);
        startTime = System.currentTimeMillis();
        res = BellmanFord.bellmanFord(6000, ralo6.getGraph(), 0);
        endTime = System.currentTimeMillis() - startTime;
        System.out.println("Time used for Belman-Ford algorithm with " + ralo6.getV() + " vertices and " + ralo6.getE() +
                " edges is " + endTime + "ms");

        //</editor-fold>

        //<editor-fold desc="Floyd-Warshall algortihm">

//        System.out.println("============================================= FLOYD_WARSHALL =============================================\n");
//
//        RandomAdjMatrix ram1 = new RandomAdjMatrix(100, density);
//        long startTime = System.currentTimeMillis();
//        int[][] res = FloydWarshall.floydWarshall(ram1.getGraph());
//        long endTime = System.currentTimeMillis() - startTime;
//        System.out.println("Vreme potrebno za izvršavanje Flojd-Varšalovog algoritma nad grafom sa " +
//                ram1.getV() + " čvorova i " + ram1.getE() + " grana je " + endTime + "ms.");
//
//        RandomAdjMatrix ram2 = new RandomAdjMatrix(500, density);
//        startTime = System.currentTimeMillis();
//        res = FloydWarshall.floydWarshall(ram2.getGraph());
//        endTime = System.currentTimeMillis() - startTime;
//        System.out.println("Vreme potrebno za izvršavanje Flojd-Varšalovog algoritma nad grafom sa " +
//                ram2.getV() + " čvorova i " + ram2.getE() + " grana je " + endTime + "ms.");
//
//        RandomAdjMatrix ram3 = new RandomAdjMatrix(1000, density);
//        startTime = System.currentTimeMillis();
//        res = FloydWarshall.floydWarshall(ram3.getGraph());
//        endTime = System.currentTimeMillis() - startTime;
//        System.out.println("Vreme potrebno za izvršavanje Flojd-Varšalovog algoritma nad grafom sa " +
//                ram3.getV() + " čvorova i " + ram3.getE() + " grana je " + endTime + "ms.");
//
//        RandomAdjMatrix ram4 = new RandomAdjMatrix(2000, density);
//        startTime = System.currentTimeMillis();
//        res = FloydWarshall.floydWarshall(ram4.getGraph());
//        endTime = System.currentTimeMillis() - startTime;
//        System.out.println("Vreme potrebno za izvršavanje Flojd-Varšalovog algoritma nad grafom sa " +
//                ram4.getV() + " čvorova i " + ram4.getE() + " grana je " + endTime + "ms.");
//
//        RandomAdjMatrix ram5 = new RandomAdjMatrix(4000, density);
//        startTime = System.currentTimeMillis();
//        res = FloydWarshall.floydWarshall(ram5.getGraph());
//        endTime = System.currentTimeMillis() - startTime;
//        System.out.println("Vreme potrebno za izvršavanje Flojd-Varšalovog algoritma nad grafom sa " +
//                ram5.getV() + " čvorova i " + ram5.getE() + " grana je " + endTime + "ms.");
//
//        RandomAdjMatrix ram6 = new RandomAdjMatrix(6000, density);
//        startTime = System.currentTimeMillis();
//        res = FloydWarshall.floydWarshall(ram6.getGraph());
//        endTime = System.currentTimeMillis() - startTime;
//        System.out.println("Vreme potrebno za izvršavanje Flojd-Varšalovog algoritma nad grafom sa " +
//                ram6.getV() + " čvorova i " + ram6.getE() + " grana je " + endTime + "ms.");

        //</editor-fold>
    }
}
