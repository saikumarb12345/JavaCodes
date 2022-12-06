package BinaryTree_Dsa;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BTIterativeInOrder {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println(inOrderIterative(root));
    }
    public static List<Integer> inOrderIterative(Node root){
        List<Integer> ansList = new ArrayList<Integer>();
        Stack<Node> st = new Stack<Node>();

        Node node = root;
        while(true) {
            if(node != null){
                st.push(node);
                node = node.left;
            }
            else {
                // Loop breaks when stack is empty
                if(st.isEmpty()){
                    break;
                }
                node = st.pop();
                ansList.add(node.data);
                node = node.right;
            }
        }
        return ansList;
    }
}

//Time Complexity: O(N).
//Space Complexity: O(N)

/*
  Step 1: Initially, We will check if node is  not null then we will push that node into to the stack and we move left
  Step 2: If  current node is null, then we will check for empty condition for stack, if stack is empty we will break the loop and come out of loop
  Step 3:   If stack is not null, we will take top value from the stack and we print it and after printing ,
  again we will move to left and repeat the same process until the loop breaks(Loop breaks when stack is empty).
 */
