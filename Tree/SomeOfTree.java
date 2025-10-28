class Node {
    Node right;
    Node left;
    int val;

    public Node(int val) {
        this.val = val;
    }

}

public class SomeOfTree {
    public static int sum(Node root) {
        if (root == null)
            return 0;
        return sum(root.left) + sum(root.right) + root.val;
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
        System.out.println("sum of tree ");
        System.out.println(sum(root));
        // System.out.println(root.val);
    }
}
