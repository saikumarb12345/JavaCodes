package BinaryTree_Dsa;

public class BTMaxDepth {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        System.out.println((maxDepth(root)));

    }
    public static int maxDepth(Node node){
        if(node == null){
            return 0;
        }

        int lh = maxDepth(node.left);
        int rh = maxDepth(node.right);

        return 1 + Math.max(lh,rh);
    }
}
