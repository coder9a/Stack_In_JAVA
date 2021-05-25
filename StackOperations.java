/**
 * Given a stack of integers and Q queries.
 * The task is to perform operation on stack according to the query.
 *
 * Note: use push() to add element in the stack, peek() to get topmost element without removal,
 * pop() gives topmost element with removal, search() to return position if found else -1.
 *
 * Input Format:
 * First line of input contains nubmer of testcases T.
 * For each testcase, first line of input contains Q, number of queries.
 * Next line contains Q queries seperated by space. Queries are as:
 *
 * i x : (adds element x in the stack).
 *
 * r : (returns and removes the topmost element from the stack).
 *
 * h : Prints the topmost element.
 *
 * f y : (check if the element y is present or not in the stack).
 * Print "Yes" if present, else "No".
 */

import java.util.Stack;

public class StackOperations
{
    public static void push(Stack<Integer> stack, int data)
    {
        stack.push(data);
    }
    public static void pop(Stack<Integer> stack)
    {
        if(!stack.isEmpty())
        {
            int x = stack.pop();
            System.out.println("Popped Element "+x);
        }
    }
    public static void peek(Stack<Integer> stack)
    {
        if(!stack.isEmpty())
        {
            System.out.println(stack.peek());
        }
    }
    public static void search(Stack<Integer> stack, int data)
    {
        int pos = stack.search(data);
        if(pos==-1)
            System.out.println("Element Not Found");
        else
            System.out.println("Element Found");
    }
    public static void display(Stack<Integer> stack)
    {
//        System.out.println(stack);
//        OR
//        Enumeration enu = stack.elements();
//        while (enu.hasMoreElements())
//        {
//            System.out.println(enu.nextElement());
//        }
    }
    public static void main(String[] args)
    {
        Stack<Integer> stack = new Stack<>();
        push(stack,10);
        push(stack,20);
        push(stack,30);
        push(stack,40);
        push(stack,50);
        push(stack,60);
        display(stack);
        pop(stack);
        peek(stack);
        search(stack, 30);
        display(stack);
    }
}
