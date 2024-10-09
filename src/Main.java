import Algorithms.Dijkstra;
import RandomGraphs.RandomAdjList;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        double density = 0.8;

        // =================================== DIJKSTRA =====================================

        System.out.println("===================== DIJKSTRA =====================");

        RandomAdjList ral1 = new RandomAdjList(100, density);
        long startTime1 = System.currentTimeMillis();
        int[] res1 = Dijkstra.dijkstra(100, ral1.getGraph(), 0);
        long endTime1 = System.currentTimeMillis() - startTime1;
        System.out.println("Vreme potrebno za izvršenje dajkstrin algoritma sa " + ral1.getV() + " čvorova i " + ral1.getE() + " grana je " + endTime1 + "ms");

        RandomAdjList ral2 = new RandomAdjList(500, density);
        long startTime2 = System.currentTimeMillis();
        int[] res2 = Dijkstra.dijkstra(500, ral2.getGraph(), 0);
        long endTime2 = System.currentTimeMillis() - startTime2;
        System.out.println("Vreme potrebno za izvršenje dajkstrin algoritma sa " + ral2.getV() + " čvorova i " + ral2.getE() + " grana je " + endTime2 + "ms");

        RandomAdjList ral3 = new RandomAdjList(1000, density);
        long startTime3 = System.currentTimeMillis();
        int[] res3 = Dijkstra.dijkstra(1000, ral3.getGraph(), 0);
        long endTime3 = System.currentTimeMillis() - startTime3;
        System.out.println("Vreme potrebno za izvršenje dajkstrin algoritma sa " + ral3.getV() + " čvorova i " + ral3.getE() + " grana je " + endTime3 + "ms");

        RandomAdjList ral4 = new RandomAdjList(5000, density);
        long startTime4 = System.currentTimeMillis();
        int[] res4 = Dijkstra.dijkstra(5000, ral4.getGraph(), 0);
        long endTime4 = System.currentTimeMillis() - startTime4;
        System.out.println("Vreme potrebno za izvršenje dajkstrin algoritma sa " + ral4.getV() + " čvorova i " + ral4.getE() + " grana je " + endTime4 + "ms");

        RandomAdjList ral5 = new RandomAdjList(10000, density);
        long startTime5 = System.currentTimeMillis();
        int[] res5 = Dijkstra.dijkstra(10000, ral5.getGraph(), 0);
        long endTime5 = System.currentTimeMillis() - startTime5;
        System.out.println("Vreme potrebno za izvršenje dajkstrin algoritma sa " + ral5.getV() + " čvorova i " + ral5.getE() + " grana je " + endTime5 + "ms");
    }
}
