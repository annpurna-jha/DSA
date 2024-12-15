package Stack;

public class SS02 {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static class Stack{
        public Node head;

        public boolean isEmpty(){
            return head == null;
        }

        public void push(int data){
            Node newNode = new Node(data);
            if (isEmpty()){
                head = newNode;
                return;
            }
            newNode.next=head;
            head=newNode; 
        }
        
        public int pop(){
            if(isEmpty()) return -1;
            int top = head.data;
            head=head.next;
            return top;
        }
        
        public int peek(){
            if (isEmpty()) return -1;
            return head.data;
        }
    }
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(2);
        st.push(4);
        st.push(9);
        st.push(7);
        st.push(8);

        while (!st.isEmpty()) {
            System.out.println(st.peek());
            st.pop();
        }
    }
}
