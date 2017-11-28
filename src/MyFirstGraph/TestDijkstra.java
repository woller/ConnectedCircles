package MyFirstGraph;

import java.util.ArrayList;
import java.util.List;

public class TestDijkstra
{
    public static void main(String[] args)
    {
        List<String> vertices = new ArrayList<>();
        vertices.add("Los Angeles");
        vertices.add("Denver");
        vertices.add("Chicago");
        vertices.add("Kansas City");

        //Edge array for the graph on page 1026 in Daniel Liang's book
        List<Edge> edges = new ArrayList<>();
        edges.add(new Edge(0, 1, 1015));
        edges.add(new Edge(1, 0, 1015));
        edges.add(new Edge(0, 3, 1663));
        edges.add(new Edge(3, 0, 1663));
        edges.add(new Edge(1, 3, 599));
        edges.add(new Edge(3, 1, 599));
        edges.add(new Edge(1, 2, 1003));
        edges.add(new Edge(2, 1, 1003));
        edges.add(new Edge(2, 3, 533));
        edges.add(new Edge(3, 2, 533));

        WeightedGraph<String> graph = new WeightedGraph<>(vertices, edges);
        graph.dijkstraSearch(0, 5);

    }
}
