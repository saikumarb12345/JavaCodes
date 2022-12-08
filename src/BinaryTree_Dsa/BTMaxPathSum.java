package BinaryTree_Dsa;

public class BTMaxPathSum {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right = new Node(-4);

        System.out.println(maximumPathSum(root));
    }
    public static int maximumPathSum(Node root){
        int[] maxi = new int[1];
        maxPathDown(root,maxi);
        return maxi[0];
    }
    public static int maxPathDown(Node node,int[] maxi){
        if(node == null){
            return 0;
        }

        int leftSum = Math.max(0,maxPathDown(node.left,maxi));
        int rightSum = Math.max(0,maxPathDown(node.right,maxi));
        maxi[0] = Math.max(maxi[0],leftSum+rightSum+node.data);

        return node.data + Math.max(leftSum,rightSum);
    }
}
