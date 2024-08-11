package Helper;

public class Node {
    int vertex, weight;

    public Node(int v, int w)
    {
        vertex = v;
        weight = w;
    }
    public int getVertex() { return vertex; }
    public int getWeight() { return weight; }

    @Override
    public String toString() {
        return "{" + vertex + ", " + weight + "}";
    }
}
