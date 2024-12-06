public class LL16 {
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

private static Node getMid(Node head){
    Node slow=head, fast=head.next; // bcz in even case we want 1st middle so we can do mid.next =null to divide it in 2 parts
    while(fast!=null && fast.next !=null) {
        slow=slow.next;
        fast=fast.next.next;
    }  
    return slow;
}

private static Node merge(Node head1,Node head2){
    Node mergedLL = new Node(-1);
    Node temp = mergedLL;

    while ( head1!=null && head2 !=null) {
        if(head1.data<=head2.data){
            temp.next= head1;
            head1=head1.next;
            temp=temp.next;
        }else{
            temp.next= head2;
            head2=head2.next;
            temp=temp.next;
        }
    }
    while (head1!=null) {
        temp.next= head1;
        head1=head1.next;
        temp=temp.next;
    }
    while (head2!=null) {
        temp.next= head2;
        head2=head2.next;
        temp=temp.next;
    }
    return mergedLL.next;
}

public static Node mergeSort(Node head){

    if(head == null || head.next == null) return head;

    Node mid = getMid(head);  // get mid node
    System.out.println(mid);

    Node rightHead = mid.next;
    mid.next=null;

    // perform merge sort on both half
    Node newLeft = mergeSort(head);
    Node newRight = mergeSort(rightHead);

    return merge(newLeft,newRight);//merge
}
public static void main(String[] args) {
    LL16 ll = new LL16();
    ll.addFirst(1);
    ll.addFirst(2);
    ll.addFirst(7);
    ll.addFirst(1);
    ll.addFirst(5);
    ll.addFirst(3);
    ll.print();
    head = mergeSort(head);
    ll.print();
}
}
