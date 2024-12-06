public class LL14 {
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
// detect cycle
public static boolean isCycle(){
    Node slow =head, fast=head;
    while(fast!=null && fast.next!=null){
        slow= slow.next;
        fast=fast.next.next;
        if(slow==fast) return true; //cycle exist
    }
    return false;
}
public static void main(String[] args) {
    head=new Node(1);
    head.next=new Node(3);
    head.next.next= new Node(9);
    head.next.next.next = head;
    System.out.println(isCycle());
}
}