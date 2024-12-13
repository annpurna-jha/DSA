public class CLL02 {
    class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
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
            newNode.next=head;
            newNode.prev=tail;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        newNode.prev=tail;
        tail.next=newNode;
        head=newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            newNode.next=head;
            newNode.prev=tail;
            return;
        }
        tail.next=newNode;
        newNode.prev=tail;
        tail = newNode;
        tail.next=head;
        head.prev=tail;
    }

    public int removeFirst(){
        if(head==null){
            System.out.println("LinkedList is empty");
            return -1;
        } 
        int val = head.data;
        if(head.next==head) head=tail=null;
        else{
            head = head.next;
            head.prev = tail;
            tail.next=head;
        }
        size--;
        return val;
    }

    public int removeLast(){
        if(head==null){
            System.out.println("LinkedList is empty");
            return -1;
        } 
        int val = tail.data;
        if(head.next==head) head=tail=null;
        else{
            tail = tail.prev;
            tail.next=head;
            head.prev=tail;
        }
        size--;
        return val;
    }

    public void print(){
        if(head==null){
            System.out.println("null");
            return;
        } 
        Node curr = head;
        do{
            System.out.print(curr.data+"<->");
            curr=curr.next;
        }while(curr!=head);
        System.out.println(curr.data);
    }
    public static void main(String[] args) {
        CLL02 cll = new CLL02();
        cll.addFirst(3);
        cll.addFirst(5);
        cll.addFirst(34);
        cll.addFirst(7);
        cll.addFirst(13);
        cll.addLast(20);
        cll.addLast(23);
        cll.addLast(22);
        cll.addLast(28);
        cll.print();
        cll.removeFirst();
        cll.removeLast();
        cll.print();
        System.out.println(size);
    }
}
