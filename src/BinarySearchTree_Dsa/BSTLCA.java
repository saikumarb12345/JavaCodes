package BinarySearchTree_Dsa;

// Least Common Ancestor
public class BSTLCA {
    public static void main(String[] args) {
        Node root = new Node(6);
        root.left = new Node(3);
        root.left.left = new Node(2);
        root.left.right = new Node(4);
        root.right = new Node(8);
        root.right.left = new Node(7);

        System.out.println(leastCommonAncestor(root,root.left.left,root.left.right));
    }
    public static int leastCommonAncestor(Node root,Node p,Node q){
        if(root == null) return 0;
        int curr = root.data;
        if(curr < p.data && curr < q.data){
            return leastCommonAncestor(root.right,p,q);
        }
        if(curr > p.data && curr > q.data){
            return leastCommonAncestor(root.left,p,q);
        }
        return root.data;
    }
}
