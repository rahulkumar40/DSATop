/*
547. Number of Provinces
Solved
Medium
Topics
premium lock icon
Companies
There are n cities. Some of them are connected, while some are not. If city a is connected directly with city b, and city b is connected directly with city c, then city a is connected indirectly with city c.

A province is a group of directly or indirectly connected cities and no other cities outside of the group.

You are given an n x n matrix isConnected where isConnected[i][j] = 1 if the ith city and the jth city are directly connected, and isConnected[i][j] = 0 otherwise.

Return the total number of provinces.
*/

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfProvincesLeet {

    static void bfs(int i, boolean vis[], int[][] adj) {
        Queue<Integer> q = new LinkedList<>();
        q.add(i);

        while (q.size() > 0) {
            int front = q.remove();
            for (int j = 0; j < adj.length; j++) {
                if (adj[front][j] == 1 && vis[front] == false) {
                    q.add(j);
                    vis[j] = true;
                }
            }
        }
    }

    static int findCircleNum(int[][] adj) {
        int n = adj.length;
        int count = 0;
        boolean[] vis = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (!vis[i]) {
                bfs(i, vis, adj);
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[][] isConnected = { { 1, 1, 0 }, { 1, 1, 0 }, { 0, 0, 1 } };

        System.out.println(findCircleNum(isConnected));

    }
}
