package BinaryTree_Dsa;

import java.util.ArrayList;

// BINARY TREE INORDER TRAVERSAL USING RECURSION
//class Node{
//    int data;
//    Node left,right;
//    public Node(int key){
//        data = key;
//        left = right = null;
//    }
//}
public class BTInOrder {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.left = new Node(8);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.right.right.left = new Node(9);
        root.right.right.right = new Node(10);

        ArrayList<Integer> inOrder = new ArrayList<>();
        inOrderTrav(root,inOrder);
        for (int i = 0; i < inOrder.size(); i++) {
            System.out.println(inOrder.get(i));
        }
    }
    public static void inOrderTrav(Node curr, ArrayList<Integer> inOrder){
        if(curr == null){
            return; // returning to the where the function being called
        }

        inOrderTrav(curr.left,inOrder);
        System.out.print(curr.data + " -> ");
        inOrderTrav(curr.right,inOrder);
    }
}
