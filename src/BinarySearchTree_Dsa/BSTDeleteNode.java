package BinarySearchTree_Dsa;

public class BSTDeleteNode {
    public static void main(String[] args) {
        Node root = new Node(6);
        root.left = new Node(3);
        root.left.left = new Node(2);
        root.left.right = new Node(4);
        root.right = new Node(8);
        root.right.left = new Node(7);
        System.out.println(deleteNode(root,3));
    }
    public static Node deleteNode(Node root,int key){
        if(root == null){
            return null;
        }
        if(root.data == key){
            return helper(root);
        }
        Node dummy = root;
        while(root!=null){
            if(key < root.data){
                if(root.left!=null && root.left.data == key){
                    root.left = helper(root.left);
                }
                else{
                    root = root.left;
                }
            }
            else {
                if(root.right!=null && root.right.data == key){
                    root.right = helper(root.right);
                }
                else{
                    root = root.right;
                }
            }
        }
        return dummy;
    }
    public static Node helper(Node root){
        if(root.left==null){
            return root.right;
        }
        else if (root.right==null){
            return root.left;
        }
        Node rightChild = root.right;
        Node lastRight = rightLast(root.left);
        lastRight.right = rightChild;
        return root.left;
    }
    public static Node rightLast(Node root){
        if(root.right == null){
            return root;
        }
        return rightLast(root.right);
    }
}
