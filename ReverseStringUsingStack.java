/**
 * Stack<Character> stack = new Stack<>();
 *         String str = "geeksforgeeks";
 *         int n = str.length();
 *         for(int i=0;i<n;i++)
 *         {
 *             stack.push(str.charAt(i));
 *         }
 *         String revStr = stringReverse(stack);
 *
 */

import java.util.Stack;

public class ReverseStringUsingStack
{
    public static String stringReverse(Stack<Character> stack1)
    {
        String str = "";
        while(!stack1.isEmpty())
        {
            str += stack1.pop();
        }
        return str;
    }
    public static void main(String[] args)
    {
        Stack<Character> stack = new Stack<>();
        String str = "geeksforgeeks";
        int n = str.length();
        for(int i=0;i<n;i++)
        {
            stack.push(str.charAt(i));
        }
        String revStr = stringReverse(stack);
        System.out.println(revStr);
    }
}
