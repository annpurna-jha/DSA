public class LL13 {
    // check if ll is palindrome
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
// find mid node
public Node midNode(){
    Node slow=head;
    Node fast=head;
    while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next;
    }
    return slow;
}
public boolean isPalindrom(){
    if(head==null || head.next==null) return true;
    // step 1- find mid of ll
    Node mid = midNode();
    //step 2- reverse 2nd half
    Node curr= mid;
    Node prev= null;
    while(curr!=null){
        Node next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
    }
    
    Node right = prev;// right half head
    Node left = head;
    //step 3 - check left half & right half
    while (right!=null) {
        if(left.data != right.data) return false;

        left=left.next;
        right=right.next;
    }
    return true;
}
public static void main(String[] args) {
    LL13 ll = new LL13();
    ll.addFirst(1);
    ll.addFirst(2);
    ll.addFirst(2);
    ll.addFirst(1);
    boolean ans = ll.isPalindrom();
    System.out.println(ans);
  
}
}
