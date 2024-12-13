package LinkedList;
//remove first
public class LL07 {
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

    //remove first
    public int removeFirst(){ //return deleted node data
        if(size==0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }

        int val = head.data;

        if(size==1){
            head=tail=null;
            size=0;
            return val;
        }
        head= head.next;
        size--;
        return val;
    }//Tc - O(1)

    public static void main(String[] args) {
        LL07 ll = new LL07();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(9);
        ll.addLast(3);
        ll.add(3,7);
        ll.print();
        System.out.println(size); 
        ll.removeFirst();
        ll.print();
        System.out.println(size); 
        
    }
}