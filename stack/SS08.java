package Stack;
import java.util.Stack;

public class SS08 {

    public static boolean isValid(String s){
        
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            //opening
            char ch = s.charAt(i);
            if( ch== '('|| ch =='{' || ch=='[') st.push(ch);
            // closing
            else{
                if(st.isEmpty()) return false;
                if((st.peek()=='(' && ch == ')')
                    || (st.peek()=='{' && ch == '}')
                    || (st.peek()=='[' && ch == ']')) st.pop();

                else return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "{([])}";
        System.out.println(isValid(s));
    }
}
