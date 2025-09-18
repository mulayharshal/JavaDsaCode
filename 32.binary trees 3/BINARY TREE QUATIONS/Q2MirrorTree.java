/* 
Question 2 :
 Invert Binary Tree
 Mirror of a Tree: Mirror of a Binary Tree T is another Binary Tree M(T) with left and right
 children of all non-leaf nodes interchanged.
 */
public class Q2MirrorTree {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    //  mirroring
    public static Node mirror(Node root){
        if(root==null){
            return null;
        }
        Node leftsd=mirror(root.left);
        Node rightsd=mirror(root.right);

        root.left=rightsd;
        root.right=leftsd;
        return root;
    }

    // print in inorder
    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static void main(String []a){
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);

        inorder(root);
        System.out.println();

        mirror(root);
        
        inorder(root);
        System.out.println();
    }
}
