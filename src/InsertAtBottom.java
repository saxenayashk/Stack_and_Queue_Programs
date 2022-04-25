import java.util.*;

public class InsertAtBottom {
    public static void solve(Stack<Integer> st,int item)
    {
        if(st.isEmpty())
        {
            st.push(item);
            return;
        }
        int ele=st.peek();
        st.pop();
        solve(st,item);

        st.push(ele);
    }

    public static void print(Stack<Integer> st)
    {
        for(int ele:st)
        {
            System.out.print(ele+" ");
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
        solve(st,6);
        print(st);

    }
}
