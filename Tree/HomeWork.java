class Node {
    int val;
    Node right;
    Node left;

    public Node(int val) {
        this.val = val;
    }
}

public class HomeWork {
    // min value
    public static int min(Node root) {
        if (root == null)
            return Integer.MAX_VALUE;
        return Math.min(root.val, Math.min(min(root.left), min(root.right)));
    }

    public static void display(Node root) {
        if (root == null)
            return;
        System.out.print(root.val + " -> ");
        if (root.left != null)
            System.out.print(root.left.val + " ");
        if (root.right != null)
            System.out.print(root.right.val);
        System.out.println();
        display(root.left);
        display(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(13);
        Node a = new Node(4);
        Node b = new Node(3);
        root.left = a;
        root.right = b;
        Node c = new Node(6);
        Node e = new Node(33);
        a.left = c;
        a.right = e;
        Node f = new Node(30);
        b.right = f;
        display(root);
        System.out.println(min(root));
    }
}
