/*
    Quation 1.
     Range Sum of BST
    We have a Binary Search Tree consisting of N nodes and two positive integers L and R, the
    task is to find the sum of values of all the nodes that lie in the range [L, R]..

 */


public class  RangeSumofBST{
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=this.right=null;
        }
    }
    public static int sum=0;
    public static void sumInRange(Node root, int n1, int n2){
        if(root==null){
            return;
        }
        if(n1<=root.data && root.data<=n2){
            sum+=root.data;
        }
        sumInRange(root.left, n1, n2);
        sumInRange(root.right, n1, n2);
    }


    public static void main (String []a){
        Node root= new Node(8);
        root.left=new Node(5);
        root.right=new Node(11);
        root.left.left=new Node(3);
        root.left.right= new Node(6);
        root.right.right=new Node(20);


        int n1=7,n2=15;
        sumInRange(root, n1, n2);
        System.out.println("the sum btn "+n1+" and "+n2+" = "+sum);
    }
}