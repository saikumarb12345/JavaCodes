package BinaryTree_Dsa;

// Diamter of a Binary Tree :- * Largest path between 2 nodes, need not to pass via root
public class BTDiameterOfTree {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        System.out.println(diameterOfBT(root));
    }
    public static int diameterOfBT(Node root){
        int[] diameter = new int[1];
        heightBT(root,diameter);
        return diameter[0];
    }
    public static int heightBT(Node node,int[] diameter){
        if(node == null){
            return 0;
        }

        int lh = heightBT(node.left,diameter);
        int rh = heightBT(node.right,diameter);

        diameter[0] = Math.max(diameter[0],lh+rh);

        return 1 + Math.max(lh,rh);
    }
}
