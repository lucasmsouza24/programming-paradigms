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

    public boolean isEmpty() {
        return getSize() == 0;
    }

    // concat other linked list to actual instance
    public void concat(LinkedList linkedList) {

        Node actual = head;

        while (actual.getNext() != null) {
            actual = actual.getNext();
        }

        actual.setNext(linkedList.getHead().getNext());
    }

    public boolean equals(LinkedList linked) {

        if (this.getSize() != linked.getSize()) {
            return false;
        }

        Node actualThis = head;
        Node actualOther = linked.getHead();
        
        while (actualThis.getNext() != null && actualOther.getNext() != null) {
            if (actualThis.getNext().getInfo() != actualOther.getNext().getInfo()) {
                return false;
            }
            actualThis = actualThis.getNext();
            actualOther = actualOther.getNext();
        }

        return true;
    }

    // getters and setters
    public Node getHead() {
        return head;
    }
    public void setHead(Node head) {
        this.head = head;
    }
}
