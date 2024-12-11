package CircularLinkedList;
public class CLL01 {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size = 0;

    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            tail.next=head;
            return;
        }
        newNode.next=head;
        tail.next=newNode;
        head=newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            tail.next=head;
            return;
        }
        tail.next=newNode;
        tail=newNode;
        tail.next=head;
    }

    public int removeFirst(){
        if(head==null){
            System.out.println("LinkedList is empty");
            return -1;
        }
        int val = head.data;
        if(head==head.next)
            head=tail=null;
        else{
            head=head.next;
            tail.next=head;
        }
        size--;
        return val;
    }

    public int removeLast(){
        int val = -1;
        if(head==null){
            System.out.println("LinkedList is empty");
            return val;
        }
        
        if(head==head.next){
            val=head.data;
            head=tail=null;
        }else{
            Node prev=head;
            while(prev.next.next!=head) prev = prev.next;

            val = prev.next.data;
            tail = prev;
            tail.next=tail.next.next;
        }
        size--;
        return val;

    }

    public void print(){
        if(head==null){
            System.out.println("null");
            return;
        } 
        Node curr=head;
        do{
            System.out.print(curr.data+"->");
            curr=curr.next;
        }while(curr!=head);
        System.out.println(head.data);
    }
    public static void main(String[] args) {
        CLL01 cll = new CLL01();
        cll.addFirst(2);
        cll.addFirst(12);
        cll.addFirst(29);
        cll.addFirst(20);
        cll.addFirst(3);
        cll.addLast(7);
        cll.print();
        // System.out.println(cll.size);
        cll.removeFirst();
        cll.removeLast();
        cll.print();
        // System.out.println(cll.size);
    }
    
}