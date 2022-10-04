package sptech.exercicios.lista06;

public class Node {

    // attributes
    private Integer info;
    private Node next;

    // constructor
    public Node(Integer info) {
        this.info = info;
        next = null;
    }

    // getters and setters
    public Integer getInfo() {
        return info;
    }
    public void setInfo(Integer info) {
        this.info = info;
    }
    public Node getNext() {
        return next;
    }
    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node [info=" + info + ", next=" + next + "]";
    }
}
