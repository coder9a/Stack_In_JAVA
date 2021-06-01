/**
 * Implement a Stack using two queues q1 and q2.
 *
 * Example 1:
 *
 * Input:
 * push(2)
 * push(3)
 * pop()
 * push(4)
 * pop()
 * Output: 3 4
 * Explanation:
 * push(2) the stack will be {2}
 * push(3) the stack will be {2 3}
 * pop()   poped element will be 3 the
 *         stack will be {2}
 * push(4) the stack will be {2 4}
 * pop()   poped element will be 4
 * Example 2:
 *
 * Input:
 * push(2)
 * pop()
 * pop()
 * push(3)
 * Output: 2 -1
 */

import java.util.*;

public class StackUsingQueue
{
    static Queue<Integer> queue1 = new LinkedList<>();
    static Queue<Integer> queue2 = new LinkedList<>();
    public static void push(int data)
    {
        queue1.add(data);
    }
    public static void pop()
    {
        if(queue1.isEmpty() && queue2.isEmpty())
            System.out.println("Queue is Empty");
        if(queue2.isEmpty())
        {
            while (queue1.size() != 1)
            {
                queue2.add(queue1.poll());
            }
        }
        queue1.remove();
        Queue<Integer> q = queue1;
        queue1 = queue2;
        queue2 = q;
    }
    public static void display()
    {
        System.out.println(queue1);
    }
    public static void main(String[] args)
    {
        push(1);
        push(2);
        push(3);
        push(4);
        push(5);
        display();
        pop();
        display();
    }
}
