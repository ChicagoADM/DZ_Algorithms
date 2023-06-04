package HW4;

public class TreeRedBlack<T extends Comparable<T>> {
    private static final boolean RED = true;
    private static final boolean BLACK = false;

    private class Node {
        T data;
        Node left, right;
        boolean color;

        public Node(T data, boolean color) {
            this.data = data;
            this.color = color;
        }

        @Override
        public String toString() {
            return  "data=" + data +
                    ", left=" + left +
                    ", right=" + right +
                    ", color=" + color +
                    "\n";
        }
    }

    private Node root;

    private boolean isRed(Node x) {
        if (x == null) return false;
        return x.color == RED;
    }

    private Node rotateLeft(Node h) {
        Node x = h.right;
        h.right = x.left;
        x.left = h;
        x.color = h.color;
        h.color = RED;
        return x;
    }

    private Node rotateRight(Node h) {
        Node x = h.left;
        h.left = x.right;
        x.right = h;
        x.color = h.color;
        h.color = RED;
        return x;
    }

    private void flipColors(Node h) {
        h.color = RED;
        h.left.color = BLACK;
        h.right.color = BLACK;
    }

    public void add(T data) {
        root = add(root, data);
    }

    private Node add(Node h, T data) {
        if (h == null) return new Node(data, RED);

        int cmp = data.compareTo(h.data);
        if (cmp < 0) h.left = add(h.left, data);
        else if (cmp > 0) h.right = add(h.right, data);

        if (isRed(h.right) && !isRed(h.left)) h = rotateLeft(h);
        if (isRed(h.left) && isRed(h.left.left)) h = rotateRight(h);
        if (isRed(h.left) && isRed(h.right)) flipColors(h);

        return h;
    }

    @Override
    public String toString() {
        return  root + " ";
    }
}
