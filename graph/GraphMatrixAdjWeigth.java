public class GraphMatrixAdjWeigth {
    static void addEdgeWeigth(int adj[][], int u, int v, int weigth) {
        adj[u][v] = weigth;
        adj[v][u] = weigth;
    }

    static void displayGraph(int graph[][]) {
        int n = graph.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(graph[i][j] + " | ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        int[][] graph = new int[n][n];

        addEdgeWeigth(graph, 0, 1, 4);
        addEdgeWeigth(graph, 0, 2, 3);
        addEdgeWeigth(graph, 0, 4, 3);
        addEdgeWeigth(graph, 1, 4, 7);
        addEdgeWeigth(graph, 1, 3, 1);
        addEdgeWeigth(graph, 2, 3, 2);
        addEdgeWeigth(graph, 2, 4, 2);
        addEdgeWeigth(graph, 3, 4, 3);
        addEdgeWeigth(graph, 3, 4, 3);

        displayGraph(graph);

    }
}
