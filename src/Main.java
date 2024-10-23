import Algorithms.BellmanFord;
import Algorithms.Dijkstra;
import Algorithms.FloydWarshall;
import RandomGraphs.RandomAdjList;
import RandomGraphs.RandomAdjListOptimized;
import RandomGraphs.RandomAdjMatrix;
import Test.Test;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        double density = 0.2;

        Test test = new Test();

        // Prilikom testiranja, da bismo dobili dobre rezultate, potrebno je da
        // se uradi warm-up.
        test.testDijkstraBH(500, density);
        test.testDijkstraBH(500, density);
        test.testDijkstraBH(500, density);
        test.testDijkstraBH(500, density);
        test.testDijkstraBH(500, density);

        System.out.println();
        System.out.println("Posle warm-up-a");

        test.testDijkstraBH(100, density);
        test.testDijkstraBH(500, density);
        test.testDijkstraBH(1000, density);
        test.testDijkstraBH(2000, density);
        test.testDijkstraBH(4000, density);
        test.testDijkstraBH(6000, density);



//        test.testBellmanFord(100, density);
//        test.testBellmanFord(500, density);
//        test.testBellmanFord(1000, density);
//        test.testBellmanFord(2000, density);
//        test.testBellmanFord(4000, density);
//        test.testBellmanFord(6000, density);

//        test.testFloydWarshall(100, density);
//        test.testFloydWarshall(500, density);
//        test.testFloydWarshall(1000, density);
//        test.testFloydWarshall(2000, density);
//        test.testFloydWarshall(4000, density);
//        test.testFloydWarshall(6000, density);

    }
}
