package Stack;
import java.util.ArrayList;
public class SS01 {

    ArrayList<Integer> list = new ArrayList<>();

    public boolean isEmpty(){
        return list.size()==0;
    }

    public void push(int data){
       list.add(data);
    }

    public int pop(){
        if(isEmpty()) return -1;
        int top = list.get(list.size()-1);
       list.remove(list.size()-1);
        return top;
    }

    public int peek(){
        if(isEmpty()) return -1;
        return list.get(list.size()-1);
    }
    
    public static void main(String[] args) {
        SS01 st = new SS01();
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
