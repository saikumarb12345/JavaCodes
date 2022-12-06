package BinaryTree_Dsa;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BTIterativePreOrder {
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

        System.out.println(iterativePreOrder(root));
    }
    public static List<Integer> iterativePreOrder(Node node){
        List<Integer> anslist = new ArrayList<>();
        if(node == null)
            return anslist;

        Stack<Node> st = new Stack<Node>();
        st.push(node);
        while(!st.isEmpty()){
            node = st.pop();
            anslist.add(node.data);

            if(node.right != null){
                st.push(node.right);
            }
            if (node.left != null){
                st.push(node.left);
            }
        }
        return anslist;
    }
}
// 1 -> 2 -> 4 -> 5 -> 8 -> 3 -> 6 -> 7 -> 9 -> 10 ->

//Time Complexity: O(N).
//Space Complexity: O(N)