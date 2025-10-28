class Node {
    Node right;
    Node left;
    int val;

    public Node(int val) {
        this.val = val;
    }

}

public class MaxOfTree {
    public static int max(Node root) {
        if (root == null)
            return 0;
        return Math.max(root.val, Math.max(max(root.left), max(root.right)));
    }

    public static int maxx(Node root) {
        if (root == null)
            return Integer.MIN_VALUE; // for correct output - negative 
        int a = root.val;
        int b = maxx(root.left);
        int c = maxx(root.right);
        return Math.max(a, Math.max(b, c));
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        root.left = a;
        root.right = b;
        Node c = new Node(400);
        Node d = new Node(5);
        a.left = c;
        a.right = d;
        Node e = new Node(6);
        b.left = e;
        // display(root);
        System.out.println("Preorder : ");
        System.out.println(max(root));
        // System.out.println(root.val);
    }
}
