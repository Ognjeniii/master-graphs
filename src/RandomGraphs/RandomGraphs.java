package RandomGraphs;

import Helper.Node;
import java.util.*;

public class RandomGraphs {
    int V;
    int E;

    int[][] matrix;
    Map<Integer, List<Node>> list;

    static Random random = new Random();

    public RandomGraphs(int V) {
        this.V = V;
        E = V * 5;
        //E = V * 500;

        matrix = new int[V][V];
        list = new HashMap<>(V);

        for (int i = 0; i < V; i++)
            list.put(i, new ArrayList<>());

        for (int i = 0; i < E; i++) {
            int u = random.nextInt(V);
            int v = random.nextInt(V);
            int weight = random.nextInt(7) + 3;

            if (matrix[u][v] == 0) { // da li već postoji put od temena u do temena v
                matrix[u][v] = weight;
                Node node = new Node(v, weight);
                addEdgeList(u, node);
            }

        }
    }

    public void addEdgeList(int vertexFrom, Node node) {
        if(!list.containsKey(vertexFrom)) // da li postoji izvorni čvor
            list.put(vertexFrom, new ArrayList<>());

        if(!list.containsKey(node.getVertex())) // da li postoji čvor do koga se putuje
            list.put(node.getVertex(), new ArrayList<>());

        list.get(vertexFrom).add(node); // dodavanje node-a u graf
    }

    public int getV() {
        return V;
    }

    public int getE() {
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            count += list.get(i).size();
        }

        return count;
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public Map<Integer, List<Node>> getList() {
        return list;
    }

    public void printMatrix() {
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void printList() {
        for (int i = 0; i < V; i++) {
            System.out.print(i + ": [ ");
            for (var n : list.get(i)) {
                System.out.print(n);
            }
            System.out.print(" ]");
            System.out.println();
        }
    }
}
