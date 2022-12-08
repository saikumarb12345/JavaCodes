package BinaryTree_Dsa;

public class BTCheckIdentical {
    public static void main(String[] args) {
        Node root1 = new Node(1);
        root1.left = new Node(2);
        root1.right = new Node(3);
        root1.right.left = new Node(4);

        Node root2 = new Node(1);
        root2.left = new Node(2);
        root2.right = new Node(3);
        root2.right.left = new Node(4);
        System.out.println(isSameTree(root1,root2));
    }
    public static boolean isSameTree(Node a, Node b){
        if (a == null && b == null)
            return true;
        else if (a == null || b == null)
            return false;
        return ((a.data == b.data) && isSameTree(a.left, a.left) && isSameTree(a.right, a.right));
    }
}
