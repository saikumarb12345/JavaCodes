package BinaryTree_Dsa;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//class Node {
//    int data;
//    Node left,right;
//    public Node(int key){
//        data = key;
//        left = right = null;
//    }
//}
public class BFS_LevelOrder {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(11);
        root.right.left = new Node(9);
        root.right.right = new Node(7);

        System.out.println(levelOrder(root));
    }
    public static List<Integer> levelOrder(Node node){
        Queue<Node> queue = new LinkedList<Node>();
        ArrayList<Integer> ans = new ArrayList<Integer>();

        if(node == null){
            return ans;
        }
        queue.offer(node);
        while(!queue.isEmpty()){
            if(queue.peek().left != null)
                queue.offer(queue.peek().left);
            if(queue.peek().right != null)
                queue.offer(queue.peek().right);

            ans.add(queue.poll().data);
        }
        return ans;
    }
}

//Time Complexity: O(N)
//Space Complexity: O(N)