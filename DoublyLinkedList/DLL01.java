public class DLL01 {

    class Node {
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
    public static int size;

    // add first
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }

    //add Last
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        newNode.prev=tail;
        tail=newNode;
    }

    // remove first
    public int removeFirst(){
        if(head==null){
            System.out.println("LinkedList is empty");
            return -1;
        }

        int val = head.data;

        if(head.next==null)
            head=tail=null;    

        else{
            head = head.next;
            head.prev=null;
        }

        size--;
        return val;
    }

    // remove last
    public int removeLast(){
        if(head==null){
            System.out.println("LinkedList is empty");
            return -1;
        }

        int val = -1; 

        if(head.next==null){
            val=head.data;
            head=tail=null; 
        }
        else{
            Node prev= head;
            while(prev.next.next!=null)
                prev=prev.next;
            
            val = prev.next.data;
            Node next = prev.next;
            prev.next=null;
            next.prev=null;

        }
        size--;
        return val;
    }

    public void print(){
        Node temp = head;
        while (temp!=null) {
            System.out.print(temp.data+"<->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DLL01 dll = new DLL01();
        dll.addFirst(2);
        dll.addFirst(9);
        dll.addFirst(8);
        dll.addFirst(4);
        dll.addFirst(6);
        dll.addLast(1);
        dll.print();
        System.out.println(size);
        dll.removeFirst();
        dll.removeLast();
        dll.print();
        System.out.println(size);
    }

}
