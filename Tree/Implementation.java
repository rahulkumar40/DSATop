class Implementation {
    public static class Node {
        int val;
        Node left;
        Node righ;
        public Node(int val ){
            this.val = val;
        }
    }

    public static void main(String[] args) {
        Node root = new Node();
        root.val = 10;
        System.out.println(root.val);
    }
}