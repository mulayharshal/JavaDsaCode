public class ClosestElementBST {

    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.right=this.left=null;
        }
    }

    
    public static int diff=Integer.MAX_VALUE;
    public static int elm=Integer.MAX_VALUE;

    public static void closestElement(Node root ,int key){
        if(root==null){
            return;
        }
        int newdiff=root.data-key;
        if(newdiff<0){
            newdiff*=-1;
        }
        if(newdiff<diff){
            diff=newdiff;
            elm=root.data;
        }
        closestElement(root.left, key);
        closestElement(root.right, key);
    }
    
    public static void main (String [] args){
        Node root  =new Node(8);
        root.left=new Node(5);
        root.right=new Node(11);
        root.left.left= new Node(3);
        root.left.right=new Node(6);
        root.right.right=new Node(20);

        int key=19;
        closestElement(root, key);
        System.out.println("the closest element is "+elm+ "(differnce is "+diff+")");
    }
}
