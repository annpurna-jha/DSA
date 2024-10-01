package LinkedList;

// add First in ll
public class LL02 {

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

    public void addFirst(int data){
        //step1 - create new node
        Node newNode = new Node(data);

        // if ll is empty
        if(head == null){
            head=tail=newNode;
            return;
        }

        //step2 - assign address of head into next of newNode
        newNode.next = head; //link

        //step3 -  assign head to newNode
        head = newNode;
    } //Tc = O(1) [in every case perform constant operation i.e 3 steps]

    public static void main(String[] args) {
        LL02 ll = new LL02();
        ll.addFirst(1);
        ll.addFirst(2);
        
    }
}

