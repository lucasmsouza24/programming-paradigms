package sptech.aulas.aula03tree;

public class Node<T> {
    
    // attributes
    private T value;
    private Node<T> leftChild;
    private Node<T> rightChild;

    // constructor
    public Node(T value) {
        this.value = value;
        this.leftChild = null;
        this.rightChild = null;
    }

    // getters and setters
    public T getValue() {
        return value;
    }
    public void setValue(T value) {
        this.value = value;
    }
    public Node<T> getLeftChild() {
        return leftChild;
    }
    public void setLeftChild(Node<T> leftChild) {
        this.leftChild = leftChild;
    }
    public Node<T> getRightChild() {
        return rightChild;
    }
    public void setRightChild(Node<T> rightChild) {
        this.rightChild = rightChild;
    }

    // to string
    @Override
    public String toString() {
        return String.format("%s\n/\t\\\n%s\t%s", value, leftChild, rightChild);
    }
}
