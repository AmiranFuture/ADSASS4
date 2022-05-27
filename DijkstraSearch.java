import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DijkstraSearch<Vertex> extends Search<Vertex> {
    private final WeightedGraph<Vertex> weightedGraph;
    private final Set<Vertex> unsetNode;
    private final Map<Vertex, Double> distances;

    public DijkstraSearch(WeightedGraph<Vertex> graph, Vertex source) {
        super(source);

        this.weightedGraph = graph;
        unsetNode = new HashSet<>();
        distances = new HashMap<>();

    }


    private double getDistance(Vertex node, Vertex target) {
        for (Edge<Vertex> edge : weightedGraph.getEdges(node)) {
            if (edge.getDest().equals(target))
                return edge.getWeight();
        }
        return 0;
    }

    private Vertex getVertexWithMinimumWeight(Set<Vertex> vertices) {
        Vertex min = null;

        for (Vertex vertex : vertices) {
            if (min == null)
                min = vertex;
            else {
                if (getShortestDistance(vertex) < getShortestDistance(min))
                    min = vertex;
            }
        }

        return min;
    }
