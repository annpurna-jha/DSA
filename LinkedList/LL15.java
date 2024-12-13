package LinkedList;

public class LL15 {
        public static class Node{
            int data;
            Node next;
            public Node(int data){ 
                this.data = data;
                this.next = null;
            }
        }
        public static Node head; 
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
    // remove cycle
    public static void removeCycle(){
        Node slow =head, fast=head;
        boolean cycle=false;
        while(fast!=null && fast.next!=null){
            slow= slow.next;
            fast=fast.next.next;
            if(slow==fast){
                cycle=true;
                break;
            }
        }
        if(cycle==false) return;
        // find meeting point
        slow=head;
        Node prev=null;
        while(slow!=fast){
            slow=slow.next;
            prev=fast;
            fast=fast.next;
        }
        prev.next=null;
        
    }

    public static void main(String[] args) {
        head=new Node(1);
        Node temp = new Node(4);
        head.next=temp;
        head.next.next= new Node(9);
        head.next.next.next = temp;
        System.out.println(isCycle());
        removeCycle();
        System.out.println(isCycle());
      
    }
}
