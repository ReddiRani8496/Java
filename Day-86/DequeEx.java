/*
 * Deque stands for double-ended queue
 * it supports the addition and removal of elements from either end of the ArrayDeque
 */

import java.util.ArrayDeque;

import java.util.Deque;

class DequeEx {
    public static void main(String[] args) {

        Deque<String> deque = new ArrayDeque<>();

        deque.add("India");

        deque.addLast("Japan"); // in deque we can add elements at first

        deque.addFirst("France"); // we can also add elements at last of the deque

        System.out.println(deque);

        deque.removeFirst(); // removing from the first of the deque

        System.out.println(deque);

        deque.removeLast(); // removing from the last of the deque

        System.out.println(deque);
    }
}