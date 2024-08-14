import Algorithms.Dijkstra;
import RandomGraphs.RandomGraphs;

public class Main {
    public static void main(String[] args) {

        int numOfVertices = 20000;
        RandomGraphs rg = new RandomGraphs(numOfVertices);

        long startTimeD1 = System.currentTimeMillis();
        int[] resD1 = Dijkstra.dijkstra(rg.getV(), rg.getList(), 0);
        long elapsedTimeD1 = System.currentTimeMillis() - startTimeD1;

        long startTimeD2 = System.currentTimeMillis();
        int[] resD2 = Dijkstra.dijkstra(rg.getMatrix(), 0);
        long elapsedTimeD2 = System.currentTimeMillis() - startTimeD2;

        System.out.println();
        System.out.println("Amount of time used for completing Dijkstras priority queue algorithm" +
                " on graph with " + rg.getV() + " vertices and " + rg.getE() + " edges: " +
                elapsedTimeD1 + "ms.");

        System.out.println();
        System.out.println("Amount of time used for completing Dijkstras basic algorithm " +
                "on graph with " + rg.getV() + " vertices and " + rg.getE() + " edges: " +
                elapsedTimeD2 + "ms.");
    }
}
