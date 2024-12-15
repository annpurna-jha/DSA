package Stack;
import java.util.Stack;
public class SS05 {
    
    public static String reverse(String str){
        Stack<Character> st = new Stack<>();
        int idx = 0;
        while (idx<str.length()) {
            st.push(str.charAt(idx));
            idx++;
        }
        StringBuilder res = new StringBuilder("");
        while (!st.isEmpty()) {
            res.append(st.peek());
            st.pop();
        }
        return res.toString();
    }
    public static void main(String[] args) {
        String str = "Annpurna";
        System.out.println(reverse(str));
    }
}
