package trees;

public class BinaryToThreadedBinaryTree {

    public static Node root;

    public void convert(Node root){
        inorder(root, null);
    }

    public void inorder(Node root, Node previous){
        if(root==null){
            return;
        }else{
            inorder(root.right, previous);
            if(root.right==null &&  previous!=null){
                root.right = previous;
                root.rightThread=true;
            }
            inorder(root.left, root);
        }
    }

    public void print(Node root){
        //first go to most left node
        Node current = leftMostNode(root);
        //now travel using right pointers
        while(current!=null){
            System.out.print(" " + current.data);
            //check if node has a right thread
            if(current.rightThread)
                current = current.right;
             // else go to left most node in the right subtree
            else
            	current = leftMostNode(current.right);
        }
        System.out.println();
    }

    public Node leftMostNode(Node node){
        if(node==null){
            return null;
        }else{
            while(node.left!=null){
                node = node.left;
            }
            return node;
        }
    }

    public static void main(String[] args) {
        root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);
        root.left.left = new Node(1);
        root.left.right = new Node(7);
        root.right.left = new Node(12);
        root.right.right = new Node(20);

        BinaryToThreadedBinaryTree bsTtoTBST = new BinaryToThreadedBinaryTree();
        bsTtoTBST.convert(root);
        System.out.println("\nInorder Traversal: ");
        bsTtoTBST.print(root);
    }
}

class Node{
    Node left;
    Node right;
    int data;
    boolean rightThread;
    public Node(int data){
        this.data = data;
        rightThread = false;
    }
}

