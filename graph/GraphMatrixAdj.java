public class GraphMatrixAdj {

    static void addEdge(int[][] graph, int u, int v) {
        graph[u][v] = 1;
        graph[v][u] = 1;
    }

    static void displayGraph(int adj[][]) {
        int n = adj.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i==j){
                    System.out.print("*" + " | ");
                }else 
                System.out.print(adj[i][j] + " | ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        int adj[][] = new int[n][n];

        addEdge(adj, 0, 1);
        addEdge(adj, 0, 2);
        addEdge(adj, 0, 3);
        addEdge(adj, 1, 2);
        addEdge(adj, 1, 3);
        // addEdge(adj, 2, 1);
        displayGraph(adj);
    }
}
