package LinkedList;
//Print ll
public class LL04 {
    
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
    }//Tc - O(n) it goes every node of LL

    public static void main(String[] args) {
        LL04 ll = new LL04();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.print();
        ll.addFirst(9);
        ll.addFirst(5);
        ll.addFirst(0);
        ll.print();
        
    }
}