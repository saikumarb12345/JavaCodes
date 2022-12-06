package BinaryTree_Dsa;

import java.util.List;
import java.util.Stack;

public class BTIterativePostOrder {
    public static void main(String[] args) {

    }
    // Function to perform iterative postorder traversal of the tree
    public void postorderIterative(Node root) {
        // create an empty stack
        Stack<Node> stack = new Stack<>();

        // start from the root node
        Node curr = root;

        // run until stack is not empty or current node is not null
        while (!stack.isEmpty() || curr != null) {
            // push the left and right child nodes of the current node to the stack
            if (curr != null) {
                stack.push(curr);
                curr = curr.left;
            } else {
                // get the top node from the stack
                Node temp = stack.peek();

                // if the top node has a right child and the right child has not been visited yet,
                // push the right child to the stack
                if (temp.right != null) {
                    curr = temp.right;
                } else {
                    // otherwise, pop the top node from the stack and visit it
                    stack.pop();
                    System.out.print(temp.data + " ");

                    // check if the top node is the right child of the node on the top of the stack
                    // if it is, pop the top node from the stack and visit it
                    while (!stack.isEmpty() && stack.peek().right == temp) {
                        temp = stack.pop();
                        System.out.print(temp.data + " ");
                    }
                }
            }
        }
    }
}

// Explanation for Below Code

/*
The code performs an iterative postorder traversal of a binary tree using a single stack.
It starts by pushing the root node of the tree to the stack, and then keeps pushing
the left child of the current node to the stack until it reaches a leaf node.
Then, it pops the node from the stack and checks if it has a right child.
If it does, and if that right child has not been visited yet, the code pushes
the right child to the stack and repeats the process.

If the top node on the stack does not have a right child, or if its right child
has already been visited, the code pops the node from the stack and
visits it (i.e., prints its data to the output). Then, it checks if the top node
on the stack is the right child of the node just below it. If it is,
the code pops the top node from the stack and visits it as well.
This process is repeated until the stack becomes empty or until the
top node on the stack is not the right child of the node just below it.

This algorithm ensures that the nodes are visited in the correct order
for a postorder traversal, i.e., left child, right child, and then parent.
It uses the stack to keep track of the nodes that need to be visited,
and to ensure that the right child of each node is visited after its left child.
 */
