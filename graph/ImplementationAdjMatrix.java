import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ImplementationAdjMatrix {

    /*
     * 📌 ADJACENCY MATRIX — COMPLETE GUIDE (JAVA)
     * 1️⃣ Definition (Interview-Ready)
     * 
     * An Adjacency Matrix is a 2D array representation of a graph, where
     * matrix[i][j] = 1 (or weight) means there is an edge from vertex i to j,
     * otherwise 0.
     * 
     * 0 1 2
     * 0 0 1 1
     * 1 1 0 0
     * 2 1 0 0
     * 
     */

    static void displayGraph(int[][] adj) {
        // Queue<Integer> queue= new LinkedList<>();
        // queue.add(adj[0][0]);
        // while (!queue.isEmpty()) {
        // int front = queue.remove();

        // }

        int n = adj.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(adj[i][j] + " | ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of edge");
        int n = sc.nextInt();
        int edges[][] = new int[3][3];

        // first edge or 0 edge connected edges
        edges[0][0] = 0;
        edges[0][1] = 1;
        edges[0][2] = 1;

        // second edge or 1 edge connected edges
        edges[1][0] = 1;
        edges[1][1] = 0;
        edges[1][2] = 0;

        // third edge or 2 edge connected edges
        edges[2][0] = 1;
        edges[2][1] = 0;
        edges[2][2] = 0;

        displayGraph(edges);

        

    }
}