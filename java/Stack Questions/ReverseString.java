import java.util.*;

class ReverseString{

    public static String s;
    public void StringReverse(Stack<char> st){
        for(int i = 0; i<s.length();i++){
            char ch = s[i];
            st.push(ch);
        }

        String ans = "";
        while(!st.isEmpty()){
            char ch = st.peek();
            st.Push(ch);
            st.pop();
        }
      System.out.print(ans); 

    }

    public static void main(String[] args) {
        Stack<char> st = new Stack<>();
        st.push(s);

    }
}