package Helper;

public class Node {
    int vertex;
    double weight;

    public Node(int v, double w)
    {
        vertex = v;
        weight = w;
    }
    public int getVertex() { return vertex; }
    public double getWeight() { return weight; }

    @Override
    public String toString() {
        return "{" + vertex + ", " + weight + "}";
    }
}
