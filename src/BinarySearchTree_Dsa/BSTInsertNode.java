package BinarySearchTree_Dsa;

public class BSTInsertNode {
    public static void main(String[] args) {
        Node root = new Node(6);
        root.left = new Node(3);
        root.left.left = new Node(2);
        root.left.right = new Node(4);
        root.right = new Node(8);
        root.right.left = new Node(7);
        System.out.println(insertBST(root,5));

    }
    public static Node insertBST(Node root,int key){
        Node node = root;
        if(node==null){
            return new Node(key);
        }
        while(true){
            if(key >= node.data){
                if(node.right!=null){
                    node = node.right;
                }
                else{
                    node.right = new Node(key);
                    break;
                }
            }
            else{
                if(node.left!=null){
                    node = node.left;
                }
                else{
                    node.left = new Node(key);
                    break;
                }
            }
        }
        return root;
    }
}
