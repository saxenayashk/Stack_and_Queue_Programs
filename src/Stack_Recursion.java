import java.util.*;

public class Stack_Recursion {

    public static void sortedInsert(Stack<Integer> st,int key)
    {
        if(st.isEmpty() || key>st.peek())
        {
            st.push(key);
            return;
        }

        int top=st.pop();
        sortedInsert(st,key);
        st.push(top);
    }

    public static void sortStack(Stack<Integer> st)
    {
        if(st.empty() || st.size()==1)
        {
            return;
        }
        int top=st.pop();

        sortStack(st);

        sortedInsert(st,top);
    }

    public static void print(Stack<Integer> st)
    {
        for(int x:st)
        {
            System.out.print(x+" ");
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
      Stack<Integer> st=new Stack<>();
      st.push(99);
      st.push(98);
      st.push(97);
      st.push(96);
      st.push(95);

      sortStack(st);
      print(st);
    }
}
