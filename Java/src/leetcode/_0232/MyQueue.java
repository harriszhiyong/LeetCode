package leetcode._0232;

import java.util.Stack;

public class MyQueue {
    public Stack<Integer> stack1;
    public Stack<Integer> stack2;
    public MyQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        stack1.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        int val = stack1.pop();
        while (!stack2.empty()) {
            stack1.push(stack2.pop());
        }
        return val;
    }

    /** Get the front element. */
    public int peek() {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        int val = stack1.peek();
        while (!stack2.empty()) {
            stack1.push(stack2.pop());
        }
        return val;
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stack1.isEmpty();
    }
}
