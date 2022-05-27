class Main {
    public static void main(String[] args) {
        WeightedGraph<String> graph = new WeightedGraph<>(true);
        graph.setEdge("Plane", "Track", 3);
        graph.setEdge("Moto", "Bus", 2);
        graph.setEdge("Car", "Train", 3);
        graph.setEdge("Moto", "Train", 6);
        graph.setEdge("Track", "Plane", 4);
        graph.setEdge("Plane", "Rocket", 5);
        System.out.print("bfs: ");
        Search<String> breadthFirstSearch = new BreadthFirstSearch<>(graph, "Car");
        breadthFirstSearch.out("Train");
        System.out.print("dijkstra: ");
        Search<String> dijkstraSearch = new DijkstraSearch<>(graph, "Car");
        dijkstraSearch.out("Rocket");
    }
}
