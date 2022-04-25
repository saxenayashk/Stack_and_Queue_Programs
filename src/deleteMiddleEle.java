import java.util.*;

public class deleteMiddleEle {
    public static void solve(Stack<Integer> st,int count,int N)
    {
        if(count==N/2)
        {
            st.pop();
            return;
        }

        int ele=st.peek();
        st.pop();

        solve(st,count+1,N);
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
       solve(st,0,st.size());
       print(st);
    }
}
