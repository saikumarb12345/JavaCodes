package BinarySearchTree_Dsa;

public class BSTCeilOfKey {
    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(5);
        root.left.left = new Node(4);
        root.left.right = new Node(7);
        root.right = new Node(12);
        root.right.left = new Node(10);
        root.right.right = new Node(14);
        root.right.right.left = new Node(13);

        System.out.println(findCeil(root, 6));
    }

    public static int findCeil(Node node, int key) {
        int ceil = -1;
        while (node != null) {
            if (node.data == key) {
                ceil = node.data;
                return ceil;
            }
            if (key > node.data) {
                node = node.right;
            } else {
                ceil = node.data;
                node = node.left;
            }
        }
        return ceil;
    }
}
