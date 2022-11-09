package sptech.aulas.aula03tree;

public class BinaryTree<T> {
    
    // attributes
    private Node<T> root;

    // constructor
    public BinaryTree() {
        this(null);
    }
    public BinaryTree(T value) {
        createRoot(value);
    }

    // method

    public void createRoot(T value) {
        this.root = new Node<T>(value);
    }

    public void insertLeftNode(Node<T> node, T value) {

        // illegal argument exception
        if (null == value) {
            throw new IllegalArgumentException("value must not to be null");
        }

        // adding value to tree
        Node<T> nodeValue = new Node<T>(value);
        node.setLeftChild(nodeValue);
    }

    public void insertRightNode(Node<T> node, T value) {
        // illegal argument exception
        if(null == value) {
            throw new IllegalArgumentException("value must not to be null");
        }

        // adding value to tree
        Node<T> nodeValue = new Node<T>(value);
        node.setRightChild(nodeValue);
    }

    public void displayBeforeOrder(Node<T> node) {
        if(node != null) {
            System.out.println(node.getValue());
            
            System.out.println(" | Left: " + (node.getLeftChild() == null ? "--" : node.getLeftChild().getValue()));
            System.out.println(" | Right: " + (node.getRightChild() == null ? "--" : node.getRightChild().getValue()));
            System.out.println();
            
            // recursive
            displayBeforeOrder(node.getLeftChild());
            displayBeforeOrder(node.getRightChild());
        }
    }
    public void displayBeforeOrder() {
        System.out.println("============================");
        System.out.println("before order");
        displayBeforeOrder(this.getRoot());
    }

    public void displayAfterOrder(Node<T> node) {
        if(node != null) {
            
            System.out.println(" | Left: " + (node.getLeftChild() == null ? "--" : node.getLeftChild().getValue()));
            System.out.println(" | Right: " + (node.getRightChild() == null ? "--" : node.getRightChild().getValue()));
            System.out.println(node.getValue());
            System.out.println();
            
            // recursive
            displayAfterOrder(node.getLeftChild());
            displayAfterOrder(node.getRightChild());
        }
    }
    public void displayAfterOrder() {
        System.out.println("============================");
        System.out.println("after order");
        displayAfterOrder(this.getRoot());
    }

    public void displayInOrder(Node<T> node) {
        if(node != null) {
            
            System.out.println(" | Left: " + (node.getLeftChild() == null ? "--" : node.getLeftChild().getValue()));
            System.out.println(node.getValue());
            System.out.println(" | Right: " + (node.getRightChild() == null ? "--" : node.getRightChild().getValue()));
            System.out.println();
            
            // recursive
            displayAfterOrder(node.getLeftChild());
            displayAfterOrder(node.getRightChild());
        }
    }
    public void displayInOrder() {
        System.out.println("============================");
        System.out.println("in order");
        displayInOrder(this.getRoot());
    }

    // getters and setters
    public Node<T> getRoot() {
        return root;
    }
    public void setRoot(Node<T> root) {
        this.root = root;
    }
}
