import java.util.LinkedList;
import java.util.Queue;

public class NumberOIsLands {
    static void bfs(int i,int j, boolean[][] vis,char[][] grid){
        Queue<Integer> q = new LinkedList<>();
        q.add(i);
        vis[0][0]= true;
    }
    public static int numIslands(char[][] grid) {
        int count = 0;
        int m=grid.length;
        int n = grid[0].length;
        boolean vis[][] = new boolean[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(vis[i][j]!=true && grid[i][j]==1){
                    bfs(i,j,vis,grid);
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int [][] graph = {{1,1,1,1,0},{1,1,0,1,0},{1,1,0,0,0},{0,0,0,0,0}};

    }
}
