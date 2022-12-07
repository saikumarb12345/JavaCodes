package BinaryTree_Dsa;

public class BTCheckBalanced {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.left.right = new Node(7);
        System.out.println((checkBalanced(root)));
    }
    public static int checkBalanced(Node root){
        if(root == null){
            return -1;
        }

        int lh = checkBalanced(root.left);
        int rh = checkBalanced(root.right);

        if(lh == -1 || rh == -1){
            return -1;
        }
        if(Math.abs(lh-rh) > 1){
            return -1;
        }

        return Math.max(lh,rh) + 1;
    }
}
