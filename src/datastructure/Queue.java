package util;

import java.util.Deque;
import java.util.LinkedList;

public class Queue<L> {
        Deque<Integer> stack1;
        Deque<Integer> stack2;
        public Queue() {
            stack1 = new LinkedList<>();
            stack2 = new LinkedList<>();
        }

        /**
         * Push element x to the back of queue.
         */
        public void push(int x) {
            if (stack2.isEmpty()) {
                stack2.push(x);
            } else  {
                while (!stack2.isEmpty()) {
                    stack1.push(stack2.pop());
                }
                stack2.push(x);
                while (!stack1.isEmpty()) {
                    stack2.push(stack1.pop());
                }
            }
        }

        /**
         * Removes the element from in front of queue and returns that element.
         */
        public int pop() {

            return stack2.pop();
        }

        /**
         * Get the front element.
         */
        public int peek() {

            return stack2.peek();
        }

        /**
         * Returns whether the queue is empty.
         */
        public boolean empty() {
            return stack2.isEmpty();
        }

}
