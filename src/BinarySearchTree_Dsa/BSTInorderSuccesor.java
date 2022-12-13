package BinarySearchTree_Dsa;

public class BSTInorderSuccesor {
    public static void main(String[] args) {
        Node root = new Node(6);
        root.left = new Node(3);
        root.left.left = new Node(2);
        root.left.right = new Node(4);
        root.right = new Node(8);
        root.right.left = new Node(7);

        System.out.println(inoderSuccesor(root,root.right.left));
    }
    public static Node inoderSuccesor(Node root,Node k){
        Node succ = null;
        while(root!=null) {
            if (k.data >= root.data) {
                root = root.right;
            } else {
                succ = root;
                root = root.left;
            }
        }
       return succ;
    }
}
