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
        System.out.println(bst.find(bst.root,500));

        System.out.println("Inorder Traversal of Above BST");
        bst.inorder(bst.root);
        int key = 100;
        System.out.println("Deleting Element: "+key);
        bst.root = bst.Delete(bst.root,key);

        System.out.println("After Deletion: Inorder Traversal of BST");
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

    public static boolean find(Node root, int val){
        if(root == null)
            return false;
        if(root.data==val)
            return true;

        if(root.data < val)
           return find(root.right,val);
        else
           return find(root.left,val);


    }
     public static Node Delete(Node root, int val){
        if(root == null)
            return null;
        // now we have to find the element to delete
         if(root.data < val)
             root.right=Delete(root.right,val);
         else if(root.data > val)
             root.left= Delete(root.left,val);
         else{
             //Case when node is a leaf
             if (root.left == null && root.right == null)
                 return null;
             else if (root.left == null)
                 return root.right;
             else if (root.right == null)
                 return root.left;
             else {// this is the case where we have a node root node with ledf and right children
                 int key = getRightMin(root.right);
                 root.data = key;
                 root.right = Delete(root.right, key);
             }
         }
         return root;
     }
     public static int getRightMin(Node root){
        Node temp = root;
        while (temp.left != null){
            temp= temp.left;
        }
        return temp.data;
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
