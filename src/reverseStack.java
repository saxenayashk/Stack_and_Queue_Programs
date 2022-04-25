import java.util.*;

public class reverseStack {
    public static void Method(Stack<Integer> st)
    {
        if(st.isEmpty())
        {
            return;
        }
        int val=st.peek();
        st.pop();
        Method(st);
       InsertAtBottom.solve(st,val);
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
        st.push(12);
        st.push(23);
        st.push(34);
        st.push(45);
        st.push(56);

        print(st);
        Method(st);
        print(st);
    }
}
