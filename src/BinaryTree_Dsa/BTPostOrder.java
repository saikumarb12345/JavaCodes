package BinaryTree_Dsa;

import java.util.ArrayList;

//class Node{
//    int data;
//    Node left,right;
//    public Node(int key){
//        data = key;
//        left = right = null;
//    }
//}
public class BTPostOrder {
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

        ArrayList<Integer> postOrder = new ArrayList<>();
        postOrderTrav(root,postOrder);
        for (int i = 0; i < postOrder.size(); i++) {
            System.out.println(postOrder.get(i));
        }
    }
    public static void postOrderTrav(Node curr, ArrayList<Integer> postOrder){
        if(curr == null){
            return;
        }
        postOrderTrav(curr.left,postOrder);
        postOrderTrav(curr.right,postOrder);
        System.out.print(curr.data + " -> ");
    }
}
