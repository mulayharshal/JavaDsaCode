/*
  Question 4 :
 Two Sum BSTs
 Given a BST, transform it into a greater sum tree where each node contains sum of all nodes
 greater than that node.
 */

import java.util.ArrayList;

public class TwoSumBSTs {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }

    }

    public static void bstToArr(Node root, ArrayList<Integer> arr) {
        if (root == null) {
            return;
        }
        bstToArr(root.left, arr);
        arr.add(root.data);
        bstToArr(root.right, arr);
    }

    public static int sumPairs(Node root1, Node root2 , int x){
        ArrayList<Integer> arr1=new ArrayList<>();
        bstToArr(root1, arr1);
        ArrayList<Integer> arr2=new ArrayList<>();
        bstToArr(root2, arr2);
        int count=0;
        int i=0;
        while(i<arr1.size()){
            
            for(int j=0;j<arr1.size();j++){
                if(arr1.get(i)+arr2.get(j)==x){
                    System.out.print("("+arr1.get(i)+","+arr2.get(j)+")  ");
                    count++;
                }
                
            }
            i++;
        }
        System.out.println();
        return count;

    }

    public static void main(String a[]) {
        Node root1 = new Node(5);
        root1.left = new Node(3);
        root1.right = new Node(7);
        root1.left.left = new Node(2);
        root1.left.right = new Node(4);
        root1.right.left = new Node(6);
        root1.right.right = new Node(8);

        Node root2 = new Node(10);
        root2.left = new Node(6);
        root2.right = new Node(15);
        root2.left.left = new Node(3);
        root2.left.right = new Node(8);
        root2.right.left = new Node(11);
        root2.right.right = new Node(18);

        int x=16;
        int n=sumPairs(root1, root2, x);
        System.out.println("no of pairs is "+n);

    }

}
