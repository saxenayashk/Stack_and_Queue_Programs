import java.util.*;

public class Reverse_String_Using_Stack {

    public static String reverseString(String str)
    {
        char ch[]=str.toCharArray();
        Stack<Character> st=new Stack<>();

        for(int i=0;i<ch.length;i++)
        {
            st.push(ch[i]);
        }

        String res="";

        while (!st.isEmpty())
        {
            res=res+st.peek();
            st.pop();
        }
        return res;
    }

    public static void main(String[] args)
    {
         System.out.println(reverseString("Yash Saxena"));
    }
}
