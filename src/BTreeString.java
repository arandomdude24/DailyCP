/**
 * Ishaan Patel
 * 5/22/19
 * Daily Coding Problem #3 (Google)(Medium)
 * Given the root to a binary tree, implement
 * a method which serializes the tree into a string, and
 * another method which does the opposite.
 */
public class BTreeString {
    private static class Node<String>{
        public String val;
        public Node<String> left;
        public Node<String> right;

        public Node(String val) {
            this.val = val;
            left = null;
            right = null;
        }

        public Node(String val, Node<String> left) {
            this.val = val;
            this.left = left;
            right = null;
        }

        public Node(String val, Node<String> left, Node<String> right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }


    public static String serialize(Node<String> current) {
        StringBuilder s = new StringBuilder();
        if (current == null)
            return "--";

        s.append("Node(" + current.val + ", ");
        s.append(serialize(current.left));
        s.append(", ");
        s.append(serialize(current.right));
        s.append(")");

        return s.toString();
    }

    public static Node<String> deserialize(String s) {
        Node<String> n = new Node<String>(null);
        return null;
    }

    public static void main(String[] args) {
        Node<String> test = new Node<String>("root",
                new Node<String>("left",
                        new Node<String>("left.left")),
                new Node<String>("right"));

        System.out.println(serialize(test));
    }
}
