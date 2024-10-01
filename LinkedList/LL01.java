package LinkedList;

public class LL01 {
    // creating a self defined type to store Node i.e class
    public static class Node{
        int data;
        Node next; //it is of Node type because it points to another object which is of Node type

        public Node(int data){ //constructor
            this.data = data;
            this.next = null;
        }
        public Node(int data,Node next){ //constructor
            this.data = data;
            this.next = next;
        }
    }
    // in a linkedlist single head & tail is present so will define inside linkedlist class as a property of Node type
    public static Node head; 
    public static Node tail;
    public static void main(String[] args) {
        LL01 ll = new LL01();
        ll.head = new Node(2);
        ll.head.next = new Node(3);
        
    }
}