public class LL12 {
    // remove nth node from end
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
// remove nth node from end
public void removenth(int n){
    if(n==size) {
        head=head.next;
        return;
    }
    int i =1;
    Node prev=head;
    while(i<size-n){
        prev=prev.next;
        i++;
    }
    prev.next=prev.next.next;
}
public static void main(String[] args) {
    LL12 ll = new LL12();
    ll.addFirst(1);
    ll.addFirst(8);
    ll.addFirst(2);
    ll.addFirst(1);
    ll.addFirst(19);
    ll.print();
    ll.removenth(5);
    ll.print();
}
}
