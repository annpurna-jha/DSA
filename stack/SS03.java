package Stack;
import java.util.Stack;
public class SS03 {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
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
