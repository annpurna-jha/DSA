package LinkedList;
//remove last
public class LL08 {
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

    //remove last
    public int removeLast(){ //return deleted node data
        if(size==0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val = head.data;
            head=tail=null;
            size=0;
            return val;
        }
        Node prev = head;
        while(prev.next.next!=null){// it will run till size-2
            prev = prev.next;
        }
        int val = prev.next.data;//tail.data
        prev.next=null;
        tail=prev;
        size--;
        return val;
    }//TC - O(n) to traverse through ll

    public static void main(String[] args) {
        LL08 ll = new LL08();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(9);
        ll.addLast(3);
        ll.add(3,7);
        ll.print();
        System.out.println(ll.size); 
        ll.removeLast();
        ll.print();
        System.out.println(ll.size); 
        
    }
}