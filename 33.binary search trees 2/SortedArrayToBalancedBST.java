public class SortedArrayToBalancedBST{
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=this.right=null;
        }

    }
    
    public static Node arrayToBST(int arr[],int st, int ed){
        if(st>ed){
            return null;
        }
        int mid=(st+ed)/2;
       Node root= new Node(arr[mid]);
       root.left=arrayToBST(arr, st, mid-1);
       root.right=arrayToBST(arr, mid+1, ed);
       return root;
    }

    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void main(String [] args){
        int arr[]={3,5,6,8,10,11,12};
        Node root=arrayToBST(arr, 0, arr.length-1);
        inorder(root);

    }
}