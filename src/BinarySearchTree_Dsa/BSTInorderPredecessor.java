package BinarySearchTree_Dsa;

public class BSTInorderPredecessor {
    public static void main(String[] args) {
        Node root = new Node(6);
        root.left = new Node(3);
        root.left.left = new Node(2);
        root.left.right = new Node(4);
        root.right = new Node(8);
        root.right.left = new Node(7);

        System.out.println(inorderPredecessor(root,root.left));
    }
    public static Node inorderPredecessor(Node root,Node k){
        Node pred = null;
        while(root != null){
            if(k.data <= root.data ){
                root = root.left;
            }
            else {
                pred = root;
                root = root.right;
            }
        }
        return pred;
    }
}
