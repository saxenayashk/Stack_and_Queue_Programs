import java.util.*;

public class ValidParanthesis {

    public static boolean isEqual(char a,char b)
    {
        if((a=='(' && b==')')||(a=='[' && b==']')||(a=='{'&&b=='}'))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static boolean isValidParanthesis(String str)
    {
        Stack<Character> st=new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='(' || str.charAt(i)=='[' || str.charAt(i)=='{')
            {
                st.push(str.charAt(i));
            }
            else
            {
                if(st.isEmpty())
                {
                    return false;
                }
                else if(!isEqual(st.peek(),str.charAt(i)))
                {
                    return false;
                }
                else
                {
                    st.pop();
                }
            }
        }
        return st.isEmpty();
    }

    public static void main(String[] args)
    {
        String str="({[]}";
        System.out.println(isValidParanthesis(str));
    }
}
