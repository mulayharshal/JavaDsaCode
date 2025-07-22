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
    public static void main(String [] args){
        LinkedList ll =new LinkedList();
        ll.print();
        ll.addFirst(2);
         ll.print();
        ll.addFirst(1);
         ll.print();
        ll.addLast(3);
         ll.print();
        ll.addLast(4);
         ll.print();
         ll.add(2, 9);
         ll.print();
        System.out.println("----------");
         System.out.println(size);
        ll.removefirst();
        ll.print();
        ll.removeLast();
        ll.print();
        System.out.println(size);
        System.out.println("----------");
        System.out.println(ll.itrSearch(3));
        System.out.println(ll.itrSearch(10));
    

    }
}