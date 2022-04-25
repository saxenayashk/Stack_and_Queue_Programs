import java.util.*;

public class redundantBracket {
    public static boolean isRedundant(String str)
    {
        Stack<Character> st=new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='(' || str.charAt(i)=='+' || str.charAt(i)=='-' || str.charAt(i)=='*' || str.charAt(i)=='/')
            {
                st.push(str.charAt(i));
            }
            else
            {

                if(str.charAt(i)==')')
                {
                    boolean flag=true;
                    while(str.charAt(i)=='(')
                    {
                        char top=str.charAt(i);
                        if(top=='+' || top=='-' || top=='*' || top=='/')
                        {
                            flag=false;
                        }
                    }
                    if(flag)
                    {
                        return true;
                    }
                }


            }

        }
        return false;
    }
    public static void main(String[] args)
    {
       String str="(a*b)";
       System.out.println(isRedundant(str));
    }
}
