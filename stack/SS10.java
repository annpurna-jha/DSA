package Stack;
import java.util.Stack;

public class SS10 {

    public static int[] nextGreater(int[] arr){

        Stack<Integer> st = new Stack<>();
        int[] nxtGreater = new int[arr.length];

        for(int i=arr.length-1; i>=0; i--){
            // while
            while (!st.isEmpty() && arr[st.peek()]<=arr[i]) {
                st.pop();
            }

            // if-else
            if(st.isEmpty()) nxtGreater[i] = -1;
            else nxtGreater[i] = arr[st.peek()];

            // push index in stack
            st.push(i);
        }
        return nxtGreater;
    }

    public static void main(String[] args) {
        int[] arr = {6,8,9,1,3};

        int[] nxtGreater = nextGreater(arr);

        for(int i=0;i<nxtGreater.length;i++){
            System.out.print(nxtGreater[i]+" ");
        }
        System.out.println();
    }
}
