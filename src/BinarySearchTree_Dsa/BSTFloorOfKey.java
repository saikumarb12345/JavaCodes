package BinarySearchTree_Dsa;

public class BSTFloorOfKey {
    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(5);
        root.left.left = new Node(4);
        root.left.right = new Node(7);
        root.right = new Node(12);
        root.right.left = new Node(10);
        root.right.right = new Node(14);
        root.right.right.left = new Node(13);

        System.out.println(floorInBST(root,11));
    }
    public static int floorInBST(Node node,int key){
        int floor = -1;
        while(node!=null){
            if(key == node.data){
                floor = node.data;
            }
            if(key < node.data){
                node = node.left;
            }
            else {
                floor = node.data;
                node = node.right;
            }
        }
        return floor;
    }
}
