package day18;

public class Task3 {
    public static void main(String[] args) {
        Node root = new Node(20);

        int[] numbers = {14, 23, 11, 16, 22, 27, 5, 15, 18, 24, 150, 8};
        for (int number: numbers)
            addNote(number, root);

        deepForSearch(root);
    }

    private static void deepForSearch(Node node) {
        if (node == null)
            return;

        deepForSearch(node.getLeft());
        System.out.print(node.getValue() + " ");
        deepForSearch(node.getRight());
    }

    private static void addNote(int insertValue, Node root) {
        if (root == null)
            throw new IllegalArgumentException("Root node must be not null!");

        Node nextNode = root;
        Node current = null;

        while(nextNode != null) {
            current = nextNode;

            if (insertValue < current.getValue()) {
                nextNode = current.getLeft();
            } else {
                nextNode = current.getRight();
            }
        }

        if (insertValue < current.getValue()) {
            current.setLeft(new Node(insertValue));
        } else {
            current.setRight(new Node(insertValue));
        }
    }
}

class Node {
    private int value;
    private Node left; // by default null form created object
    private Node right; // by default null form created object

    public Node(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}