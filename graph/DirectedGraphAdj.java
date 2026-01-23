public class DirectedGraphAdj {
    static void addEdge(int edge[][], int u, int v) {
        edge[u][v] = 1;
    }

    static void displayGraph(int graph[][]) {
        int n = graph.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(graph[i][j] + (j == n-1 ? " " : " -> "));
            }
            System.out.println();
        }
    }

    
    public static void main(String[] args) {
        int n = 4;
        int graph[][] = new int[n][n];
        addEdge(graph, 0, 1);
        addEdge(graph, 1, 2);
        addEdge(graph, 2, 3);
        // addEdge(graph, 0, 1);

        displayGraph(graph);
    }
}
