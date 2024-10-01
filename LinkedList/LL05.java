package LinkedList;
// Add in the middle of ll
public class LL05 {
    public static class Node{
        int data;
        Node next;
        public Node(int data){ //constructor
            this.data = data;
            this.next = null;
        }
    }
    public static Node head; 
    public static Node tail;
    //add first
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head=tail=newNode;
            return;
        }
        newNode.next = head; //link
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

    //add middle
    public void add(int ind, int data){
        //add in first pos
        if(ind==0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp =head;
        int i=0;
        while(i<ind-1){
            temp=temp.next;
            i++;
        }
        //i=ind-1 i.e temp = prev
        newNode.next=temp.next;
        temp.next=newNode;
    }//Tc - O(n) to traverse the ll 

    public static void main(String[] args) {
        LL05 ll = new LL05();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.print();
        ll.addFirst(9);

        ll.add(3,7);
        ll.print();
        
    }
}
