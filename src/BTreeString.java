/**
 * Ishaan Patel
 * 5/22/19
 * Daily Coding Problem #3 (Google)(Medium)
 * Given the root to a binary tree, implement
 * a method which serializes the tree into a string, and
 * another method which does the opposite.
 */
public class BTreeString<E> {
    private static class Node<E>{
        public E val;
        public Node<E> left;
        public Node<E> right;

        public Node(E val, Node<E> left, Node<E> right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    private Node<E> root;

    public static String serialize(Node<E> current) {

    }

    public static BTreeString deserialie(String s) {

    }

    public static void main(String[] args) {
        
    }
}
