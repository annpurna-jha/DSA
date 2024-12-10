public class DLL02 {
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
    public void print(){
        Node temp = head;
        while (temp!=null) {
            System.out.print(temp.data+"<->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    // reverse
    public void reverse(){
        Node curr=head;
        Node prev=null;
        Node next;
        while (curr!=null) {
            next=curr.next;
            curr.next=prev;
            curr.prev=next;//imp 
            prev=curr;
            curr=next;
        }
        head=prev;
    }
    public static void main(String[] args) {
        DLL02 dll = new DLL02();
        dll.addFirst(2);
        dll.addFirst(9);
        dll.addFirst(8);
        dll.addFirst(4);
        dll.addFirst(6);
        dll.print();
        dll.reverse();
        dll.print();
    }
}
