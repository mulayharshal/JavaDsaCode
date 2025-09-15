public class BST{
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


    // insert the vlaues in treee
    public static Node insert(Node root,int val){

        if(root==null){
            root=new Node(val);
            return root;
        }
        if(root.data>val){
           root.left= insert(root.left, val);
        }
        else {
           root.right= insert(root.right, val);
        }
        return root;
    }


    // print tree in inorder
    public static void inorder(Node root){
          if(root==null){
            return;
          }
          inorder(root.left);
          System.out.print(root.data+" ");
          inorder(root.right);
    }

    // search in tree
    public static boolean search(Node root , int key){
        if(root==null){  // if key is not found
            return false;
        }else if(root.data==key){   //if key is found
            return true;
        }

        if(root.data>key){ //key is less than root search in left
            return search(root.left,key);  
        }else{
            return search(root.right,key); //otherwise search in right
        }
    }


    // delete the particular node
    public static Node delete(Node root , int val ){
        if(root.data<val){
            root.right=delete(root.right, val);
        }else if(root.data>val){
            root.left=delete(root.left, val);
        }else{
            // case 1 leaf node
            if(root.left==null && root.right==null){
               return null; 
            }

            // case 2 - single child
            if(root.left==null){
                return root.right;
            }
            else if(root.right==null){
                return root.left;
            }


            // case 3 - both children
            Node IS=findInorderSuccesser(root.right);
            root.data=IS.data;
            root.right=delete(root.right, IS.data);
        }
        return root; 
    }


    // find inorder successer
    public static Node findInorderSuccesser(Node root){
        while(root.left!=null){
            root=root.left;
        }
        return root;
    }

    // main function
    public static void main(String []a){
        int values[]={8,5,3,1,4,6,10,11,14};

        // build tree 
        Node root=null;
        for(int i=0;i<values.length;i++){
            root =insert(root, values[i]);
        }
        
        // print in inorder
        inorder(root);
        System.out.println();

        // serch key in tree
        boolean re=search(root, 3);
        System.out.println(re);

        // delete the node
        root =delete(root, 5);
        inorder(root);
        
    }
}