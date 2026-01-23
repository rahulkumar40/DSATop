public class DirectedWeightedGraphAdj {
    static void addEdge(int edge[][], int u, int v, int weight) {
        edge[u][v] = weight;
    }

    static void displayGraph(int graph[][]) {
        int n = graph.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(graph[i][j] + (j == n - 1 ? " " : " -> "));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int graph[][] = new int[4][4];
        addEdge(graph, 0, 1, 4);
        addEdge(graph, 1, 2, 10);
        addEdge(graph, 2, 3, 5);
        addEdge(graph, 3, 1, 8);
        addEdge(graph, 3, 0, 2);
        displayGraph(graph);
    }
}
