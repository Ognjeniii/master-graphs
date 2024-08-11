import java.util.*;

public class Graphl {
    int num;
    Map<Integer, List<Integer>> g;

    public Graphl() {

    }

    public Graphl(int num) {
        this.num = num;
        g = new HashMap<>();
        for (int i = 0; i < num; i++) {
            g.put(i, new ArrayList<>());
        }
    }

    public void print() {
        System.out.println("Adjacency list: ");
        for(int i = 0; i < g.size(); i++) {
            if(g.containsKey(i)){
                //System.out.print(g.get(i));
                System.out.print(i + "=[");
                for(int j = 0; j < g.get(i).size(); j++) {
                    String s = j == g.get(i).size() - 1 ? "" : ",";
                    System.out.print(g.get(i).get(j) + s);
                }
            }
            System.out.print("]");
            System.out.println();

        }
        //System.out.println(g);
        System.out.println();
    }

    public void addEdge(int u, int v) {
        if (!g.containsKey(u)) {
            g.put(u, new ArrayList<>());
        }
        if (!g.containsKey(v)) {
            g.put(v, new ArrayList<>());
        }

        g.get(u).add(v);
        g.get(v).add(u);
    }

    public void addFromToEdge(int u, int v) {
        if (!g.containsKey(u)) {
            g.put(u, new ArrayList<>());
        }
        if (!g.containsKey(v)) {
            g.put(v, new ArrayList<>());
        }

        g.get(u).add(v);
    }


    public void deleteElem(int vertex) {
        g.remove(vertex);
    }

    public void dft(int start) {
        Stack<Integer> stack = new Stack<>();
        boolean[] visited = new boolean[g.size()];
        stack.push(start);

        while (!stack.isEmpty()) {
            int curr = stack.pop();
            if (!visited[curr]) {
                visited[curr] = true;
                System.out.print(curr + " ");

                for (var neigh : g.get(curr)) {
                    if (!visited[neigh])
                        stack.push(neigh);
                }
            }
        }

    }

    // topological sort
    public int[] topSort()
    {
        int n = g.size();
        boolean[] visited = new boolean[n];
        int[] ordering = new int[n];

        int i = n - 1;

        for(int at = 0; at < n; at++)
        {
            if(!visited[at])
            {
                i = dfs(i, at, visited, ordering, g);
            }
        }
        return ordering;
    }

    // dfs for top sort
    private int dfs(int i, int at, boolean[] visited, int[] ordering, Map<Integer, List<Integer>> map) {
        visited[at] = true;

        for(var edge : map.get(at))
        {
            if(!visited[edge])
            {
                i = dfs(i, edge, visited, ordering, map);
            }
        }
        ordering[i] = at;
        return i - 1;
    }

}
