public class Tree{

    static class Node {
        int data ;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.right= null;
            this.left= null;
        }
    }

    static class BinaryTree{
        static int idx=-1;

        // build the tree
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode=new Node(nodes[idx]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);

            return newNode;
        }

        // preorder
        public static void preorder(Node root){
            if(root==null){
                return;
            }
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }

        //inorder
        public static void inorder(Node root){
            if(root==null){
                return;
            }
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);

        }

        // postorder
        public static void postorder(Node root){
            if(root==null){
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");
        }
    }
    public static void main (String args[]){
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

        BinaryTree tree=new BinaryTree();
        Node root=tree.buildTree(nodes);  // build the tree
        System.out.println(root.data);      //print the root
        System.out.println("preorder");
        tree.preorder(root);        // print preorder
        System.out.println();
        System.out.println("inorder");
        tree.inorder(root);         //print inorder
        System.out.println();
        System.out.println("postorder");
        tree.postorder(root);  // print postorder
    }

}