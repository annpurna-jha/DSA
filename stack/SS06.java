 package Stack;
import java.util.Stack;

public class SS06 {

    public static void pushAtBottom(Stack<Integer> s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }

    public static void reverseStack(Stack<Integer> s){
        if (s.isEmpty()) {
            return;
        }
        int top = s.pop();
        reverseStack(s);
        pushAtBottom(s, top);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(2);
        st.push(3);
        st.push(4);

        reverseStack(st);

        while (!st.isEmpty()) {
            System.out.println(st.peek());
            st.pop();
        }    
    }   
}