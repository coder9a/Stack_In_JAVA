/**
 * Given a binary tree. Find the postorder traversal of the tree without using recursion.
 *
 * Example 1
 *
 * Input:
 *            1
 *          /   \
 *         2     3
 *       /  \
 *      4    5
 *
 * Output: 4 5 2 3 1
 * Explanation:
 * Postorder traversal (Left->Right->Root) of
 * the tree is 4 5 2 3 1.
 * Example 2
 *
 * Input:
 *              8
 *           /      \
 *         1          5
 *          \       /   \
 *           7     10    6
 *            \   /
 *             10 6
 *
 * Output: 10 7 1 6 10 6 5 8
 * Explanation:
 * Inorder traversal (Left->Right->Root)
 * of the tree is 10 7 1 6 10 6 5 8 .
 */

import java.util.Stack;

class NodePost
{
    int value;
    NodePost left, right;
    public NodePost(int value)
    {
        this.value = value;
    }
}
public class PostOrderTraversal
{
    public static NodePost insert(NodePost root, int data)
    {
        NodePost newNode = new NodePost(data);
        NodePost x = root;
        NodePost y = null;
        while(x!=null)
        {
            y = x;
            if(data<x.value)
                x = x.left;
            else
                x = x.right;
        }
        if(y==null)
            y = newNode;
        else if(y.value<data)
            y.right = newNode;
        else
            y.left = newNode;
        return y;
    }
    public static void traversePostOrder(NodePost root)
    {
        Stack<Integer> st2 = new Stack<>();
        Stack<Integer> st3 = new Stack<>();
        Stack<NodePost> stack = new Stack<>();
        NodePost node = root;
        stack.push(node);
        while(!stack.isEmpty())
        {
            NodePost temp = stack.peek();
            st2.push(temp.value);
            stack.pop();


            if(temp.left!=null)
            {
                stack.push(temp.left);
            }
            if(temp.right!=null)
            {
                stack.push(temp.right);
            }
        }
        while (!st2.isEmpty())
        {
            System.out.print(st2.pop()+" ");
        }
    }
    public static void traversepostOrder(NodePost node)
    {
        if(node!=null)
        {
            traversepostOrder(node.left);
            traversepostOrder(node.right);
            System.out.print(node.value+" ");
        }
    }
    public static void main(String[] args)
    {
        NodePost root = null;
        root = insert(root, 3);
        insert(root, 2);
        insert(root, 4);
        insert(root, 1);
        insert(root, 5);
        System.out.print("Iterartive ");
        traversePostOrder(root);
        System.out.println();
        System.out.print("Recursive ");
        traversepostOrder(root);
    }
}
