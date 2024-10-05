package LinkedList;
// size of ll
public class LL06 {
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
    public static int size; 

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

    //add first
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head=tail=newNode;
            return;
        }
        newNode.next = head; //link
        head = newNode;
    }
   
    //add Last
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode; 
    }

    //add middle
    public void add(int ind, int data){
        //here we didn't do size++ bcz in addFirst() we already did it so we did size++ outside of this scope
        if(ind==0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp =head;
        int i=0;
        while(i<ind-1){
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }

    public static void main(String[] args) {
        LL06 ll = new LL06();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(9);
        ll.addLast(3);
        ll.add(3,7);
        ll.print();
        System.out.println(LL06.size); //TC - O(1) bcz it didn't traverse ll to calculate size
        // BUT i don't think it is a good way as when we will create another ll object then size will not be count from 0 but from where the first ll size end so it is not good to make size static as it will not be same for all instances but it save so much time to traverse ll
        
    }
}
