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

    private Node<E> root;

    public UnivalTree(E data) {
        root = new Node<E>(data);
    }

    public UnivalTree(E data, UnivalTree<E> left, UnivalTree<E> right) {
        root = new Node<E>(data, left.root, right.root);
    }

    public int univalTree(Node<E> lr) {
        if (lr == null)
            return 0;
        else if (lr.left == null && lr.right == null)
            return 1;
        else
            return univalTree(lr, lr.data);
    }

    private int univalTree(Node<E> lr, E prev) {
        return 0;
    }
}
