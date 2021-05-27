/**
 * Given a stack with push(), pop(), empty() operations,
 * delete the middle of the stack without using any additional data structure.
 * Middle: ceil(size_of_stack/2.0)
 *
 *
 * Example 1:
 *
 * Input:
 * Stack = {1, 2, 3, 4, 5}
 * Output:
 * ModifiedStack = {1, 2, 4, 5}
 * Explanation:
 * As the number of elements is 5 ,
 * hence the middle element will be the 3rd
 * element which is deleted
 *
 * Example 2:
 *
 * Input:
 * Stack = {1 2 3 4}
 * Output:
 * ModifiedStack = {1 3 4}
 * Explanation:
 * As the number of elements is 4 ,
 * hence the middle element will be the 2nd
 * â€‹element which is deleted
 */

import java.util.Stack;

public class DeleteMiddleElementOfStack
{
    public static void deleteMid(Stack<Integer> stack)
    {
        Stack<Integer> tempStack = new Stack<>();
        int n = stack.size();
        for(int i=0;i<n/2;i++)
        {
            tempStack.push(stack.pop());
        }
        stack.pop();
        while(!tempStack.isEmpty())
        {
            stack.push(tempStack.pop());
        }
    }
    public static void display(Stack<Integer> stack)
    {
        System.out.println(stack);
    }
    public static void main(String[] args)
    {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        display(stack);
        deleteMid(stack);
        display(stack);
    }
}
