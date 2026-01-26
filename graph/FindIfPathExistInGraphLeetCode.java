import java.util.LinkedList;
import java.util.Queue;

public class FindIfPathExistInGraphLeetCode {
    static void addEdge(int edge[][], int u, int v){
        edge[u][v]=1;
        edge[v][u]=1;
    }
    static void bfs(int j, int[][]graph, boolean vis[]){
        Queue<Integer> q = new LinkedList<>();
        q.add(j);
        vis[j]=true;
        while(q.size()>0){
            int front = q.remove();
            for(int i =0; i<graph.length;i++){
                if(graph[front][i]==1 && vis[i]==false){
                    q.add(i);
                    vis[i]=true;
                }
            }
        }
    }
    static boolean validPath(int n, int[][] arr, int source, int destination) {
        
        int graph [][] = new int[n][n];
        for(int i=0; i<arr.length; i++){
                int u = arr[i][0];
                int v = arr[i][1];
                addEdge(graph,u,v);
        }

        boolean vis[] = new boolean[n];
        bfs(source,graph,vis);
        if(vis[destination]==false)return false;
        return true;
    }
    public static void main(String[] args) {
        int graph[][] = {{0,1},{1,2},{2,0}};
        int graph1[][] = {{0,1},{0,2},{3,5},{5,4},{4,3}};
        System.out.println(validPath(3,graph,0,2));
        System.out.println(validPath(6,graph1,0,5));
    }   
}
