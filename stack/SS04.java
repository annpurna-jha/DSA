package Stack;
import java.util.Stack;
public class SS04 {

    public static void pushAtBottom(Stack<Integer> s, int data){ //TC - O(n)

        if (s.isEmpty()){
            s.push(data);
            return;
        } 
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }
    public static void main(String[] args) {
         Stack<Integer> st = new Stack<>();
        st.push(2);
        st.push(4);
        st.push(9);
        st.push(7);
        pushAtBottom(st,8);

        while (!st.isEmpty()) {
            System.out.println(st.peek());
            st.pop();
        }
    }
}
