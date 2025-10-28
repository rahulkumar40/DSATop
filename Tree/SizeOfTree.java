class Node {
    Node right;
    Node left;
    int val;

    public Node(int val) {
        this.val = val;
    }

}

public class SizeOfTree {
    static int sizee = 0;

    // 1. preorder + Normal way to find the size of tree
    public static void preorder(Node root) {
        if (root == null)
            return;
        sizee++;
        System.out.print(root.val + " ");
        preorder(root.left);
        preorder(root.right);
    }

    // 2. other approach to find the size of tree
    public static int size(Node root) {
        if (root == null)
            return 0;
        return size(root.left) + size(root.right) + 1;
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
        System.out.println("Preorder : ");
        preorder(root);
        System.out.println();
        System.out.println("Size of Tree");
        System.out.println(sizee);
        System.out.println(size(root));

        // System.out.println(root.val);
    }
}
