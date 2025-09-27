import java.util.LinkedList;

public class BSTtoBalancedTree {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;

        }

        public static void rootToList(Node root, LinkedList<Integer> list) {
            if (root == null) {
                return;
            }
            rootToList(root.left, list);
            list.add(root.data);
            rootToList(root.right, list);

        }

        public static Node balancedBST(LinkedList<Integer> list, int st, int en) {

            if (st > en) {
                return null;
            }

            int mid = (st + en) / 2;
            Node root = new Node(list.get(mid));
            root.left = balancedBST(list, st, mid - 1);
            root.right = balancedBST(list, mid + 1, en);
            return root;
        }

        public static Node bstToBalnBst(Node root) {

            LinkedList<Integer> list = new LinkedList<>();
            rootToList(root, list);

            return balancedBST(list, 0, list.size() - 1);
        }

        public static void inorder(Node root) {
            if (root == null) {
                return;
            }
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }

        public static void preorder(Node root) {
            if (root == null) {
                return;
            }
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }

        public static void main(String[] args) {
            Node root = new Node(8);
            root.left = new Node(6);
            root.left.left = new Node(5);
            root.left.left.left = new Node(3);
            root.right = new Node(10);
            root.right.right = new Node(11);
            root.right.right.right = new Node(12);

             preorder(root);
            System.out.println();

            Node newRoot = bstToBalnBst(root);
            preorder(newRoot);
            System.out.println();

        }
    }

}
