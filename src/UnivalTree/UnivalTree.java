package UnivalTree;

/**
 * Ishaan Patel
 * 5/27/19
 * Daily Coding Problem #8 (Google) (Easy)
 * Given the root to a binary tree
 * Count the number of unival subtrees
 */
public class UnivalTree<E> {
    class Node<F> {
        private F data;
        private Node<F> left;
        private Node<F> right;

        Node() {
            data = null;
            left = null;
            right = null;
        }

        Node(F data) {
            this.data = data;
            left = null;
            right = null;
        }

        Node(F data, Node<F> left, Node<F> right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    public Node<E> root;

    public UnivalTree() {
        root = null;
    }

    public UnivalTree(E data) {
        root = new Node<E>(data);
    }

    public UnivalTree(E data, UnivalTree<E> left, UnivalTree<E> right) {
        root = new Node<E>(data, left.root, right.root);
    }

    private boolean isUnival(Node<E> lr) {
        if (lr == null)
            return true;
        System.out.println(root.data);
        System.out.println(lr.data);
        if (root.data == lr.data)
            return isUnival(lr.left) && isUnival(lr.right);
        return false;
    }

    public int univalSubTree(Node<E> lr) {
        if (lr == null)
            return 0;
        int left = univalSubTree(lr.left);
        int right = univalSubTree(lr.right);
        System.out.println(isUnival(lr));
        if (isUnival(lr))
            return 1 + left + right;
        return left + right;

    }
}
