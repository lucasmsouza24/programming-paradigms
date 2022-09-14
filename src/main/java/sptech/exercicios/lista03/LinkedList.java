package sptech.exercicios.lista03;

public class LinkedList {
    
    // attributes
    protected Node head;

    // constructor
    public LinkedList() {
        this.head = new Node(null);
    }

    // methods
    public void insert(int valor) {
        Node node = new Node(valor);
        node.setNext(head.getNext());
        head.setNext(node);
    }

    public void display() {
        Node node = head.getNext();
        while(node != null) {
            System.out.print(node.getInfo() + ", ");
            node = node.getNext();
        }
        System.out.println();
    }

    public Node search(int value) {
        Node node = head.getNext();
        while(node != null) {
            if (node.getInfo() == value) {
                return node;
            }
            node = node.getNext();
        }
        return null;
    }

    public boolean remove(int valor) {
        Node prev = head;
        Node actual = head.getNext();

        while(actual != null) {
            if(actual.getInfo() == valor) {
                prev.setNext(actual.getNext());
                return true;
            } else {
                prev = actual;
                actual = actual.getNext();
            }
        }

        return false;
    }

    public int getSize() {
        Node actual = head.getNext();
        int size = 0;

        while (actual != null) {
            size++;
            actual = actual.getNext();
        }

        return size;
    }

    // getters and setters
    public Node getHead() {
        return head;
    }
    public void setHead(Node head) {
        this.head = head;
    }
}
