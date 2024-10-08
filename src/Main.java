import Algorithms.BellmanFord;
import Algorithms.Dijkstra;
import Graphs.WeightedGraphl;
import RandomGraphs.RandomAdjList;
import RandomGraphs.RandomAdjMatrix;

public class Main {
    public static void main(String[] args) {

        // =================================== DIJKSTRA =====================================
        RandomAdjList ral = new RandomAdjList(1000, 0.8);
        ral.print();

        long startTime = System.currentTimeMillis();
        int[] res = Dijkstra.dijkstra(1000, ral.getGraph(), 0);
        long endTime = System.currentTimeMillis() - startTime;

        System.out.println(endTime + "ms");

    }
}
