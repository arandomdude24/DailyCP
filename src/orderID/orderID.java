package orderID;

import java.util.ArrayList;

/**
 * Ishaan Patel
 * 6/4/19
 * Daily Coding Problem #16 (Twitter)(Easy)
 * Implement a data structure that does two things
 * 1. Adds ids to the log
 * 2. Gets the ith last element from the log
 * Be efficient with time and space
 */
public class orderID<E> {
    class Node<F> {
        private F data;
        private Node<F> next;
        private Node<F> prev;

        Node(F data) {
            this.data = data;
            next = null;
            prev = null;
        }

        Node(F data, Node<F> next, Node<F> prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }

        public String toString(){
            return data.toString();
        }
    }

    public Node<E> head;
    public Node<E> tail;
    public int size;

    orderID() {
        head = null;
        tail = null;
        size = 0;
    }

    public void record(E order_id) {
        if (size == 0) {
            head = new Node<E>(order_id);
            head.next = null;
            head.prev = null;
            tail = head;
        }
        else if (size == 1) {
            Node<E> insert = new Node<E>(order_id);
            head.next = insert;
            insert.prev = head;
            tail = insert;
        }
        else {
            Node<E> insert = new Node<E>(order_id);
            Node<E> change = tail;
            change.next = insert;
            insert.prev = change;
            tail = insert;
        }
        size++;
    }

    public E getLast(int i) {
        return getLast(i, tail);
    }
    private E getLast(int i, Node<E> lr) {
        if (i > 1) {
            lr = lr.prev;
            return getLast(i-1, lr);
        }
        return lr.data;
    }

}
