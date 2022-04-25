import java.util.*;

public class SortStack {
    public static void sortedInsert(Stack<Integer> st,int key)
    {
        if(st.isEmpty() || (!st.isEmpty() && st.peek()<key))
        {
            st.push(key);
            return;
        }
        int n=st.peek();
        st.pop();
        sortedInsert(st,key);
        st.push(n);
    }
    public static void Method(Stack<Integer> st)
    {
        if(st.isEmpty()) return;

        int num=st.pop();
        Method(st);
        sortedInsert(st,num);
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
        st.push(-23);
        st.push(34);
        st.push(-45);
        st.push(56);

        print(st);
        Method(st);
        print(st);
    }
}
