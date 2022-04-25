public class isPalindrome {
    public static String reverseString(String str)
    {
        if(str==null || str.isEmpty())
        {
            return str;
        }
        else
        {
            return str.charAt(str.length()-1)+reverseString(str.substring(0,str.length()-1));
        }
    }
    public static boolean Method(String str)
    {
        String newString=reverseString(str);

        if(str.equals(newString))
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args)
    {
        String str="namaq";
        int l=0;
        int r=str.length()-1;

        System.out.println(Method(str));
    }
}
