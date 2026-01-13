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

public class LevelOrderTraversal {
    static void levelOrderTraversal(Node root){
        Queue<Node> q = new LinkedList<>();
        if(root==null) return;
        q.add(root);
        while(q.size()>0){
            Node temp = q.peek();
            if(temp.right!=null)q.add(temp.left);
            if(temp.right!=null)q.add(temp.right);
            System.out.print(temp.val + " ");
            q.remove();
        }
    }
    public static void main(String[] args) {
        // Node list = new Node(0);
        Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        root.left = a;
        root.right = b;
        Node c = new Node(4);
        Node d = new Node(5);
        a.left = c;
        a.right = d;
        
        levelOrderTraversal(root);
    }
}
