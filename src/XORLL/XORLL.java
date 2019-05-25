package XORLL;

/**
 * Ishaan Patel
 * 5/25/19
 * Daily Coding Problem #6 (Google) (Hard)
 * Make an XOR Linked List with an add and get method
 */

public class XORLL<E> {
    class Node<F> {
        private boolean both;
        private E data;

        Node() {
            data = null;
            both = false;
        }

        Node(E data) {
            this.data = data;
            both = false;
        }

        Node(E data, boolean both) {
            this.data = data;
            this.both = both;
        }

        public E getData() {
            return data;
        }

        public boolean getBoth() {
            return both;
        }
    }

    private Node<E> head;
    public int size;

    XORLL() {
        size = 0;
        head = null;
    }

    public void add(Node<E> current) {
        if (size == 0) {
            head = current;
            head.both = false;
        }
        else {
            Node<E> lr = head;
            while (lr.both) {

            }
        }
    }
}
