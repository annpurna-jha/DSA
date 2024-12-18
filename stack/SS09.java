package Stack;
import java.util.Stack;

public class SS09 {

    public static boolean isDuplicate(String s){

        Stack<Character> st = new Stack<>();

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);

            //closing
            if(ch==')'){
                int cnt =0;
                while (st.peek()!='(') {
                    st.pop();
                    cnt++;
                }
                if(cnt < 1) return true;
                else st.pop();//opening pair
            }else{
                st.push(ch);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String s = "((a+b)+(c+d))";
        System.out.println(isDuplicate(s));
        String str = "((a+b))";
        System.out.println(isDuplicate(str));
    }
}
