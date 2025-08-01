public class DoubleLL {

    public class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    //print
    public void print(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        Node curr=head;
        System.out.print("null <-> ");
        while(curr!=null){
            System.out.print(curr.data+" <-> ");
            curr=curr.next;
        }
        System.out.println("null");
    }

    //add first
    public void addFirst(int data){
        if(head==null){
            head=tail= new Node(data);
            size++;
            return;
        }
        Node add=new Node(data);
        head.prev=add;
        add.next=head;
        head=add;
        size++;
    }

    //remove frist
    public void removeFirst(){
        if(head==null){
            System.out.println("list is empty firtly add the node");
            return;

        }
        if(size==1){
            head=tail=null;
            size--;
            return;
        }
        Node nex=head.next;
        nex.prev=null;
        head.next=null;
        head=nex;
        size--;
    }

    //add last
    public void addLast(int data){
        if(head==null){
            addFirst(data);
            return;
        }
        
        Node add=new Node(data);
        tail.next=add;
        add.prev=tail;
        tail=add;
        size++;
    }

    //remove last
    public void removeLast(){
        if(head==null || size==1){
            removeFirst();
            return;
        }
        Node pre=tail.prev;
        tail.prev=null;
        pre.next=null;
        tail=pre;
        size--;
    }

    //reverse the list
    public void reverseList(){
        if(size==0 || size==1){
            return;
        }
        Node curr=head;
        head=tail;
        tail=curr;
        Node prev=null;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.prev=curr.next;
            curr.next=prev;
            
            prev=curr;
            curr=next;
        }
    }

    public static void main(String [] args){
        DoubleLL dll=new DoubleLL();
        dll.print();
        dll.addFirst(1);
        // dll.print();
        // dll.removeFirst();
        dll.print();
        // System.out.println(head.data);
        dll.addFirst(2);
        dll.addFirst(3);
        dll.addFirst(4);
        dll.print();

        dll.removeFirst();
        dll.print();

        dll.addLast(8);
        dll.print();

        dll.removeLast();
        dll.print();

        dll.reverseList();
        System.out.println("rev the list");
        dll.print();

        System.out.println("head = "+ head.data);
        System.out.println("tail = "+tail.data);

    }
    
}
