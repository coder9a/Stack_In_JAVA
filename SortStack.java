/**
 * Given a stack, the task is to sort it such that the top of the stack has the greatest element.
 *
 * Example 1:
 *
 * Input:
 * Stack: 3 2 1
 * Output: 3 2 1
 * Example 2:
 *
 * Input:
 * Stack: 11 2 32 3 41
 * Output: 41 32 11 3 2
 */

import java.util.Stack;

public class SortStack
{
    public static void sortedInsert(Stack<Integer> stack, int element)
    {
        if(stack.isEmpty() || stack.peek()<element)
        {
            stack.push(element);
            return;
        }
        int temp = stack.pop();
        sortedInsert(stack, element);
        stack.push(temp);
    }
    public static void sortStack(Stack<Integer> stack)
    {
        if(stack.isEmpty())
            return;
        int temp = stack.pop();
        sortStack(stack);
        sortedInsert(stack, temp);
    }
    public static void display(Stack<Integer> stack)
    {
        System.out.println(stack);
    }
    public static void main(String[] args)
    {
        Stack<Integer> stack = new Stack<>();
        stack.push(50);
        stack.push(40);
        stack.push(30);
        stack.push(20);
        stack.push(10);
        display(stack);
        sortStack(stack);
        display(stack);
    }
}
