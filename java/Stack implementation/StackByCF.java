import java.util.*;

public class StackByCF{

    //Insert at bottom side.
    public static void insertAtBottom( Stack<Integer> st, int data){
        if(st.isEmpty()){
            st.push(data);
            return;
        }
        int top = st.pop();
        insertAtBottom(st, data);
        st.push(top);
    }

    //reverse stack

  /*    public void reverse(Stack<Integer> st){
        if(st.isEmpty()){
            return;
        }

        int temp = st.pop();
        reverse(st);
        insertAtBottom(st,temp);
    } */
    // part of sort a stack
    public static void sortedInsert(Stack<Integer> st, int data){
        if(st.isEmpty() || data>st.peek()){
            st.push(data);
            return;
        }
        int temp = st.pop();
        sortedInsert(st,data);
        st.push(temp);
    }
    // sort a stack
	public static void sortStack(Stack<Integer> st) {
		if(!st.isEmpty()){
            int data = st.pop();
            sortStack(st);
            sortedInsert(st, data);
        }
	}
    //print the stack
    static void printStack(Stack<Integer> st)
    {
        ListIterator<Integer> lt = st.listIterator();
 
        // forwarding
        while (lt.hasNext())
            lt.next();
 
        // printing from top to bottom
        while (lt.hasPrevious())
            System.out.print(lt.previous() + " "); 
            System.out.print("\n");
    }

   
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(30);
        st.push(-9);
        st.push(16);
        st.push(2);
        st.push(-4);
        st.push(50);

        /*insertAtBottom(st,8);

        while(!st.isEmpty()){
            System.out.println(st.pop());
            
        }*/
        printStack(st);

        sortStack(st);

        printStack(st);


    }
}