class Graph {
    int vertex ;
    Graph(int vertex) {
        this.vertex = vertex;
    }
}

public class ImplementationAdjMatrix {
    static void addEdge(int source, int dest){
        a[source][dest]=1;
        a[dest][souce]=1;
    }
    static void addEdge(ArrayList<ArrayList<Integer>> adj, int source, int dest){
        adj.get(source).put(dest);
        adj.get(dest).put(source);
    }
    public static void main(String[] args) {
        int v = 5;
        int e = 10;
        int a[][] = new int[v+1][e+1];

        
    }
}
