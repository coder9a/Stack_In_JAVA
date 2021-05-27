/**
 * Write a program to implement a Stack using Array.
 * Your task is to use the class as shown in the comments in the code editor and
 * complete the functions push() and pop() to implement a stack.
 *
 * Example 1:
 *
 * Input:
 * push(2)
 * push(3)
 * pop()
 * push(4)
 * pop()
 * Output: 3, 4
 * Explanation:
 * push(2)    the stack will be {2}
 * push(3)    the stack will be {2 3}
 * pop()      poped element will be 3,
 *            the stack will be {2}
 * push(4)    the stack will be {2 4}
 * pop()      poped element will be 4
 * Example 2:
 *
 * Input:
 * pop()
 * push(4)
 * push(5)
 * pop()
 * Output: -1, 5
 */
public class ImplementStackUsingArray
{
    static int top;
    static final int size = 10;
    static int [] arr = new int[size];
    public static void push(int data)
    {
        if(top == size-1)
        {
            System.out.println("Stack Overflow");
        }
        else
        {
            top++;
            arr[top] = data;
        }
    }
    public static void pop()
    {
        if(top==-1)
            System.out.println("Stack Underflow");
        else
        {
            int x = arr[top];
            top--;
            System.out.println("Popped element "+x);
        }
    }
    public static void peek()
    {
        System.out.println("Topmost element "+arr[top]);
    }
    public static void display()
    {
        System.out.print("Stack Elements ");
        for(int i=top;i>0;i--)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        push(10);
        push(20);
        push(30);
        push(40);
        push(50);
        display();
        pop();
        display();
        peek();
    }
}
