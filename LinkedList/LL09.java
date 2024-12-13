package LinkedList;
//iterative search
public class LL09 {
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
        newNode.next = head;
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

    public int itrSearch(int key){
        if(head==null) return -1;
        Node temp =head;
        int ind =0;
        while(temp!=null){
            if(temp.data==key) return ind;
            
            ind++;
            temp = temp.next;
        }
        // key not found
        return -1;
    } //Tc - O(n) Sc - O(1)

    public static void main(String[] args) {
        LL09 ll = new LL09();
        System.out.println(ll.itrSearch(1));
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(9);
        ll.addLast(3);
        ll.add(3,7);
        ll.print();
        System.out.println(size); 
        
        System.out.println(ll.itrSearch(9));
        
    }
}
