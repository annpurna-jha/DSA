package LinkedList;
//add Last in LL
public class LL03 {
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

    public void addLast(int data){
        // step1 - create new node
        Node newNode = new Node(data);
        // if ll is empty
        if(head==null){
            head=tail=newNode;
            return;
        }
        // step2 - assign address of newNode into tail's next
        tail.next = newNode;
        //step3 - assign tail to newNode
        tail = newNode; 
    }//Tc = O(1) [in every case perform constant operation i.e 3 steps]

    public static void main(String[] args) {
        LL03 ll = new LL03();
        ll.addLast(1);
        ll.addLast(2);
    }
}
