/**
 * You are given N elements and your task is to
 * Implement a Stack in which you can get minimum element in O(1) time.
 *
 * Example 1:
 *
 * Input:
 * push(2)
 * push(3)
 * pop()
 * getMin()
 * push(1)
 * getMin()
 * Output: 3 2 1
 * Explanation: In the first test case for
 * query
 * push(2)  the stack will be {2}
 * push(3)  the stack will be {2 3}
 * pop()    poped element will be 3 the
 *          stack will be {2}
 * getMin() min element will be 2
 * push(1)  the stack will be {2 1}
 * getMin() min element will be 1
 */

import java.util.Stack;

public class MinimumElementFromStack
{
//    -----------------------------------------------------------
//    Time Complexity = O(1)
//    Space Complexity = O(n)
//    ------------------------------------------------------------
//    static int minEle;
//    static Stack<Integer> stack2 = new Stack<>();
//    public static void push(Stack<Integer> stack, int data)
//    {
//        if(!stack.isEmpty())
//        {
//            if(minEle>data)
//            {
//                minEle = data;
//                stack.push(data);
//                stack2.push(minEle);
//            }
//            else
//            {
//                stack.push(data);
//                stack2.push(minEle);
//            }
//        }
//        else
//        {
//            minEle = data;
//            stack.push(data);
//            stack2.push(minEle);
//        }
//    }
//    public static void pop(Stack<Integer> stack)
//    {
//        if(!stack.isEmpty())
//        {
//            int x = stack.pop();
//            stack2.pop();
//            System.out.println("Popped Element "+x);
//        }
//    }
//    public static void getMin()
//    {
//        int x = stack2.peek();
//        System.out.println("Minimum Element "+x);
//    }
//    public static void display(Stack<Integer> stack)
//    {
//        System.out.println(stack);
//    }
//    -----------------------------------------------------------
//    Time Complexity = O(1)
//    Space Complexity = O(1)
    static int min=Integer.MAX_VALUE;
    public static void push(Stack<Integer> stack, int data)
    {
        int curr = data;
        if(stack.isEmpty())
        {
            stack.push(curr);
            min = curr;
        }
        else
        {
            if(curr<min)
            {
                stack.push(2*curr-min);
                min=curr;
            }
            else
            {
                stack.push(curr);
            }
        }
    }
    public static void pop(Stack<Integer> stack)
    {
        if(stack.isEmpty())
            System.out.println("Stack Underflow");

        int curr = stack.peek();
        if(curr<min)
        {
            min = 2*min-curr;
        }
        curr = stack.pop();
        System.out.println("Popped Element "+curr);
    }
    public static void getMin()
    {
        System.out.println(min);
    }
    public static void display(Stack<Integer> stack)
    {
        System.out.println(stack);
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
        getMin();
        display(stack);
        pop(stack);
        getMin();
        display(stack);
    }
}
