import java.util.*;

public class NextSmallerElement {
    public static ArrayList<Integer> nextSmallerEle(int arr[])
    {
        Stack<Integer> st=new Stack<>();
        ArrayList<Integer> al=new ArrayList<>();
        st.add(-1);

        for (int i = arr.length-1; i >=0; i--) {
            int curr=arr[i];
            while(curr<=st.peek())
            {
                st.pop();
            }
            al.add(st.peek());
            st.add(curr);
        }
        Collections.reverse(al);
        return al;
    }
    public static void main(String[] args)
    {
       int arr[]={2,1,4,3};
       ArrayList<Integer> al=new ArrayList<>();
       al=nextSmallerEle(arr);
       System.out.println(al);
    }
}
