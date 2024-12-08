public class LL17 {
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

public static Node midNode(){
    Node slow=head;
    Node fast=head.next;
    while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
    }
    return slow;
}
public static Node reverse(Node head){
 Node curr= head;
 Node prev= null;
 Node next;
 while(curr!=null){
     next=curr.next;
     curr.next=prev;
     prev=curr;
     curr=next;
 }
 return prev;
}

// zig zag
public void zigZag(){
    // 1st step - mid
    Node mid = midNode();

    // 2nd step - reverse 2nd half
    Node rightHead = reverse(mid.next);
    mid.next = null; //1st half last node.next is null

    // 3rd stap - zigzag merge
    Node leftHead = head;
    Node nextL, nextR;
    while (leftHead!=null && rightHead!=null) {
        // zigzag
        nextL = leftHead.next;
        leftHead.next = rightHead;
        nextR = rightHead.next;
        rightHead.next = nextL;

        // update
        leftHead=nextL;
        rightHead=nextR;
    }
}
 
 public static void main(String[] args) {
    LL17 ll = new LL17();
    ll.addFirst(1);
    ll.addFirst(2);
    ll.addFirst(78);
    ll.addFirst(4);
    ll.addFirst(5);
    ll.addFirst(3);
    ll.addFirst(32);
    ll.print();
    ll.zigZag();
    ll.print();

}
}
