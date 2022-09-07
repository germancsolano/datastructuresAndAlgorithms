package Trees;

public class BinaryTree {
    static Node root;
    public static void main(String[] args) {
        BinaryTree bst = new BinaryTree();

        System.out.println("Inserting Element: "+100);
        bst.root = bst.insert(bst.root,100);
        System.out.println("Inserting Element: "+50);
        bst.root = bst.insert(bst.root,50);
        System.out.println("Inserting Element: "+150);
        bst.root = bst.insert(bst.root,150);
        System.out.println("Inserting Element: "+125);
        bst.root = bst.insert(bst.root,125);
        System.out.println("Searching Element: "+50);
        System.out.println(bst.find(bst.root,50));

        System.out.println("Inorder Traversal of Above BST");
        bst.inorder(bst.root);
    }
    public static Node insert(Node root, int val){
        if(root == null)
            return new Node(val);
        else if(root.data < val){
            root.right=insert(root.right,val);
        }else if (root.data > val){
            root.left=insert(root.left,val);
        }
        return root;

    }
    public void inorder(Node root){
        if(root == null)
            return;
        inorder(root.left);
        System.out.println("root.data is: "+root.data);
        inorder(root.right);
    }

    public static Node find(Node root, int val){
        if(root == null)
            return null;
        if(root.data==val) {
            return root;
        }
        else if(root.data < val){
            root.right=find(root.right,val);
        }else if (root.data > val){
            root.left=find(root.left,val);
        }
        return root;

    }
}
class Node {
    int data;
    Node left;
    Node right;
    Node(int val){
        data=val;
        left=null;
        right=null;
    }
}
