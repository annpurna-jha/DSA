package LinkedList;
// reverse linkedlist
public class LL11 {
        public static class Node{
            int data;
            Node next;
            public Node(int data){ 
                this.data = data;
                this.next = null;
            }
        }
        public static Node head; 
        public static Node tail;
        public static int size;

    //add first
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head=tail=newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
     
     // print
     public void print(){
        if(head==null) {
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    // reverse 
    public void reverse(){
        Node prev = null;
        Node curr = tail=head;
        while(curr!=null){
            Node next = curr.next;
            curr.next=prev;
            prev = curr;
            curr=next;
        }
        head=prev;
    }
    public static void main(String[] args) {
        LL11 ll = new LL11();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(9);
        ll.addFirst(12);
        ll.print();
        ll.reverse();
        ll.print();
    }
}
