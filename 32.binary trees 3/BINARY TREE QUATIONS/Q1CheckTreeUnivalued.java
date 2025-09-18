 /*  
 Check if a Binary Tree is univalued or not
 We have a binary tree, the task is to check if the binary tree is univalued or not. If found to be
 true, then print “YES”. Otherwise, print “NO”  
 */

 public class Q1CheckTreeUnivalued{
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

    public static boolean isUnivalued(Node root,int data){
        if(root==null){
            return true;
        }
        if(root.data!=data){
            return false;
        }
        return isUnivalued(root.left, data) && isUnivalued(root.right, data);
        
    }
    public static void main(String [] a){
        /*
                    2
                   / \
                  2   2
                 / \
                5   2 

         */
        Node root=new Node(2);
        root.left=new Node(2);
        root.right=new Node(2);
        root.left.left=new Node(5);

        System.out.println(isUnivalued(root, root.data));
    }
 }