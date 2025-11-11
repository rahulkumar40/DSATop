package LevelUp;

import java.util.LinkedList;
import java.util.Queue;

class Node {
    Node right;
    Node left;
    int val;

    public Node(int val) {
        this.val = val;
    }
}

public class LevelOrderByQueue {
    public static void display(Node root) {
        if (root == null)
            return;
        System.out.print(root.val + " -> ");
        if (root.left != null)
            System.out.print(root.left.val + " ");
        else
            System.out.print("null ");

        if (root.right != null)
            System.out.print(root.right.val);
        else
            System.out.println("null");
        System.out.println();
        display(root.left);
        display(root.right);
    }

    public static int height(Node root) {
        if (root == null)
            return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }

    public static void levelOrderTraversal(Node root, int n) {
        if (root == null)
            return;
        if (n == 1)
            System.out.print(root.val + " ");
        levelOrderTraversal(root.left, n - 1);
        levelOrderTraversal(root.right, n - 1);
    }

    public static void LOT(Node root) {
        Queue<Node> q = new LinkedList<>();
        if (root == null)
            return;
        q.add(root);
        if (q.size() > 0) {
            Node temp = q.peek();
            if (temp.left != null)
                q.add(temp.left);
            if (temp.right != null)
                q.add(temp.right);
            System.out.print(temp.val + " ");
            q.remove();
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        root.left = a;
        root.right = b;
        Node c = new Node(4);
        Node d = new Node(5);
        a.left = c;
        a.right = d;
        Node e = new Node(6);
        b.left = e;
        // display(root);
        // levelOrderTraversal(root, 0);
        // System.out.println();
        // levelOrderTraversal(root, 1);
        // System.out.println();
        // levelOrderTraversal(root, 2);
        // System.out.println();
        // levelOrderTraversal(root, 3);

        // int level = 3;
        // for (int i = 0; i <=level; i++) {
        // levelOrderTraversal(root, i);
        // System.out.println( );
        // }
        LOT(root);
    }
}
