public class LinkedList{
    public static class Node{
        int data ;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    //Methods

    //add first
    public void addFirst(int data){
        //st1 create new node
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        
        //st2 newNode=head
        newNode.next=head;//link
        

        //st3  head=newNode
        head=newNode;
    }

    //add in last
    public void addLast(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
        }
        tail.next=newNode;
        tail=newNode;
    }

    // print all
    public void print(){
        if(head==null){
            System.out.println("LL is empty");
            return;
        }
        Node temp=head;
        while (temp !=null) {
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.err.println("null");
    }

    //add in middle 
    public void add(int idx, int data){
        if(idx==0){
            addFirst(data);
            return;
        }
        Node newNode=new Node(data);
        size++;
        int i=0;
        Node temp=head;
        while (i<idx-1) {
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }

    //remove the first
    public int removefirst(){
        if(size==0){
            System.out.println("LL is empty");
            return Integer.MAX_VALUE;
        }else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val= head.data;
        head=head.next;
        size--;
        return val;
    }

    //remove last 
    public int removeLast(){
        if(size==0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val=head.data;
            head= tail=null;
            size=0;
            return val;
        }
        //prev : i=size-2
        Node prev=head;
        for(int i=0; i<size-2; i++){
            prev=prev.next;
        }
        int val=prev.next.data; //tail data
        prev.next=null;
        tail= prev;
        size--;
        return val;
    }

    // Iterative Search
    public int itrSearch(int key){
        Node temp=head;
        int i=0;
        while(temp !=null){
            if(temp.data==key){ //key found
                return i;
            }
            temp=temp.next;
            i++;
        }
        //key not found
        return -1;
    }

    //helper for recu search
    public int helper(Node head, int key){
        if(head==null){
            return -1;
        }
        if(head.data==key){
            return 0;
        }
        int idx=helper(head.next, key);
        if(idx==-1){
            return -1;
        }
        return idx+1;
    }
    //rec search
    public int recSearch(int key){
        return helper(head , key);
    }

    //reverse the list
    public void reverse(){
        Node prev=null;
        Node curr=tail=head;
        Node next;
        while(curr != null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head= prev;
    }

    //find and delete nth node from end
    public void deleteNthFromEnd(int n){
        int sz=0;
        Node temp=head;
        while(temp !=null){
            temp=temp.next;
            sz++;
        }
        if(n==sz){
            head=head.next;
            return;
        }
        //sz-n
        int i=1;
        int iToFind=sz-n;
        Node prev=head;
        while(i<iToFind){
            prev=prev.next;
            i++;
        }

        prev.next=prev.next.next;
    }

    //slow-fast approch
    public Node findMid(Node head){
        Node slow=head;
        Node fast=head;
        while(fast != null && fast.next != null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    public boolean checkPalindrom(){
        if(head == null || head.next == null){
            return true;
        }

        //stp1=   find mid
        Node midNode=findMid(head);

        //step2 reverse 2nd half
        Node prev=null;
        Node curr=midNode;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node right=prev;
        Node left=head;

        //step3 check left half & right half
        while(right!=null){
            if(left.data!=right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }

    // check the cyclic
    public static boolean isCycle(){
        Node slow=head;
        Node fast=head;
        while(fast != null  && fast.next != null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
           
        }
         return false;
    }

    public static void main(String [] args){
        /* 
        //new list 
        LinkedList ll =new LinkedList();
        ll.print();
        ll.addFirst(2);//add in the first of list 
         ll.print();
        ll.addFirst(1);
         ll.print();
        ll.addLast(3); // ad in the last of list
         ll.print();
        ll.addLast(4);
         ll.print();
         ll.add(2, 9); //add in particular index
         ll.print();
        System.out.println("----------");

         System.out.println(size); //print the size of no
        // ll.removefirst();       
        ll.print();
        // ll.removeLast();
        ll.print();
        System.out.println(size);
        System.out.println("----------");
        
        //itrative search
        System.out.println(ll.itrSearch(3));
        System.out.println(ll.itrSearch(10));

        System.out.println("___");
        //recursive search
        System.out.println(ll.recSearch(3));
        System.out.println(ll.recSearch(10));

        System.out.println("---");
        ll.print();
        ll.reverse();
        ll.print();

        System.out.println("------------------");
        ll.deleteNthFromEnd(3);
        ll.print();

        System.out.println("--------------------");
        System.out.println(ll.checkPalindrom()); //check palindrom
        
        */

        // linked list 2

        System.out.println("----Check the cyclic or not -----");
        head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=head;
        System.out.println(isCycle());

    }
}