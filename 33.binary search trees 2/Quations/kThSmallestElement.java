/*
   Find k-th smallest element in BST
 We have the root of a binary search tree and K as input, find Kth smallest element in BST.

 */

import java.util.ArrayList;

public class kThSmallestElement {
    static class Node{
        int data;
        Node left ;
        Node right;
        Node (int data){
            this.data=data;
            this.left=this.right=null;
        }

        public static void bstToArr(Node root, ArrayList<Integer> arr){
            if(root==null){
                return;
            }
            bstToArr(root.left, arr);
            arr.add(root.data);
            bstToArr(root.right, arr);
        }

        public static int smallestElm(Node root,int k){
            ArrayList<Integer> arr=new ArrayList<>();
            bstToArr(root, arr);
            return arr.get(arr.size()-k);
        }
        public static void main(String [] a){
            Node root=new Node(8);
            root.left=new Node(5);
            root.right=new Node(11);
            root.left.left=new Node(3);
            root.left.right=new Node(6);
            root.right.right=new Node(20);

            int k=3;
            int n=smallestElm(root, k);
            System.out.println(k+"th smallest element is = "+n);
        }

    }
}
