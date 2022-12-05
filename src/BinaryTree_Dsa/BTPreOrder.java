package BinaryTree_Dsa;

import java.util.ArrayList;

// PREORDER TRAVERSAL USING RECURSION

class Node {
    int data;
    Node left, right;

    public Node(int key) {
        data = key;
        left = right = null;
    }
}
public class BTPreOrder {
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

        ArrayList<Integer> preOrder = new ArrayList<>();
        preOrderTrav(root,preOrder);
        for (int i = 0; i < preOrder.size(); i++) {
            System.out.print(preOrder.get(i) + " -> ");
        }


    }
    public static void preOrderTrav(Node node, ArrayList<Integer> preOrder){
        if(node == null){
            return;
        }
        preOrder.add(node.data);
        preOrderTrav(node.left,preOrder);
        preOrderTrav(node.right,preOrder);
    }
}

//Time Complexity: O(N) ->  Reason: We are traversing N nodes and every node is visited exactly once.
//Space Complexity: O(N) -> Reason: Space is needed for the recursion stack. In the worst case (skewed tree), space complexity can be O(N).