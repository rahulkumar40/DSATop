package LevelUp;

class Node {
    Node right;
    Node left;
    int val;

    public Node(int val) {
        this.val = val;
    }

}

public class HeightOfTree {
    public static int height(Node root) {
        if (root == null)
            return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }

    public static int heightt(Node root) {
        if (root == null)
            return 0;
        if (root.left == null && root.right == null)
            return 0;
        return 1 + Math.max(heightt(root.left), heightt(root.right));
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
        System.out.println(height(root));
        System.out.println(heightt(root));

        // System.out.println(root.val);
    }
}
