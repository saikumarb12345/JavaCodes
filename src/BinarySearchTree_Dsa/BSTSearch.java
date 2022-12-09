package BinarySearchTree_Dsa;

class Node{
    int data;
    Node left,right;
    public Node(int key){
        data = key;
        left = right = null;
    }
}
//Search in Binary Search tree
public class BSTSearch {
    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(5);
        root.left.left = new Node(4);
        root.left.right = new Node(7);
        root.right = new Node(12);
        root.right.left = new Node(10);
        root.right.right = new Node(14);
        root.right.right.left = new Node(13);

        int key = 10;
        System.out.println(searchInBST(root,key));
    }
    public static Node searchInBST(Node node,int data){
        while(node != null && data != node.data){
            node = data < node.data ? node.left:node.right;
        }
        return node;
    }
}

// Time Complexity: O(logn) as we are traversing only one side (length of BST)