import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class KeyAndRoomVisitLeet {
    static void bfs(int i, boolean vis[], List<List<Integer>> adj) {
        Queue<Integer> q = new LinkedList<>();
        q.add(i);
        while (q.size() > 0) {
            int front = q.remove();
            // for (int j = 0; j < adj.get(front).size(); j++)
            // if (vis[adj.get(front).get(j)] == false) {
            // q.add(adj.get(front).get(j));
            // vis[adj.get(front).get(j)] = true;
            // }

            for (int ele : adj.get(front)) {
                if (vis[ele] == false) {
                    vis[ele] = true;
                    q.add(ele);
                }
            }
        }
    }

    public static boolean canVisitAllRooms(List<List<Integer>> adj) {
        int n = adj.size();
        boolean vis[] = new boolean[n];
        vis[0] = true;
        bfs(0, vis, adj);
        for (boolean ele : vis) {
            if (ele == false)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        List<List<Integer>> rooms = new ArrayList<>();

        rooms.add(new ArrayList<>(Arrays.asList(1, 3)));
        rooms.add(new ArrayList<>(Arrays.asList(3, 0, 1)));
        rooms.add(new ArrayList<>(Arrays.asList(2)));
        rooms.add(new ArrayList<>(Arrays.asList(0)));

        boolean isIt = canVisitAllRooms(rooms);
        System.out.println(isIt);
    }
}

/*
 * 841. Keys and Rooms
 * Medium
 * Topics
 * premium lock icon
 * Companies
 * There are n rooms labeled from 0 to n - 1 and all the rooms are locked except
 * for room 0. Your goal is to visit all the rooms. However, you cannot enter a
 * locked room without having its key.
 * 
 * When you visit a room, you may find a set of distinct keys in it. Each key
 * has a number on it, denoting which room it unlocks, and you can take all of
 * them with you to unlock the other rooms.
 * 
 * Given an array rooms where rooms[i] is the set of keys that you can obtain if
 * you visited room i, return true if you can visit all the rooms, or false
 * otherwise.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: rooms = [[1],[2],[3],[]]
 * Output: true
 * Explanation:
 * We visit room 0 and pick up key 1.
 * We then visit room 1 and pick up key 2.
 * We then visit room 2 and pick up key 3.
 * We then visit room 3.
 * Since we were able to visit every room, we return true.
 * Example 2:
 * 
 * Input: rooms = [[1,3],[3,0,1],[2],[0]]
 * Output: false
 * Explanation: We can not enter room number 2 since the only key that unlocks
 * it is in that room.
 * 
 */