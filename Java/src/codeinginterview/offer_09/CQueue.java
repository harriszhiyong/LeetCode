package codeinginterview.offer_09;

import java.util.Deque;
import java.util.LinkedList;

public class CQueue {
    private Deque<Integer> deque1;
    private Deque<Integer> deque2;
    public CQueue() {
        deque1 = new LinkedList<>();
        deque2 = new LinkedList<>();
    }

    public void appendTail(int value) {
        while (!deque1.isEmpty()) {
            deque2.push(deque1.pop());
        }

        deque1.push(value);

        while (!deque2.isEmpty()) {
            deque1.push(deque2.poll());
        }
    }

    public Integer deleteHead() {
        if (deque1.isEmpty()) {
            return -1;
        } else {
            return deque1.pop();
        }
    }
}
