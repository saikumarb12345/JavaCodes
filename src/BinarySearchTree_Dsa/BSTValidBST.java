package BinarySearchTree_Dsa;

public class BSTValidBST {
    public static void main(String[] args) {
        Node root = new Node(6);
        root.left = new Node(3);
        root.left.left = new Node(2);
        root.left.right = new Node(4);
        root.right = new Node(8);
        root.right.left = new Node(7);
        System.out.println(isValidBst(root));
    }
    public static boolean isValidBst(Node root){
        return isValid(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    public static boolean isValid(Node root,long minVal,long maxVal){
        if(root == null){
            return true;
        }
        if(root.data > maxVal || root.data < minVal) return false;
        return isValid(root.left,minVal, root.data) && isValid(root.right,root.data,maxVal);
    }
}
