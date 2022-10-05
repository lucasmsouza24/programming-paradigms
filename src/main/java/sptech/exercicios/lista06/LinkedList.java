package sptech.exercicios.lista06;

public class LinkedList {
    
    // attributes
    private Node head;

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

    public void insertAfterFirstOdd(int value) {

        Node actual = head;
        Node newNode = new Node(value);

        while(actual.getNext() != null) {
            actual = actual.getNext();

            if(actual.getInfo() % 2 == 1) {
                newNode.setNext(actual.getNext());
                break;
            }
        }

        actual.setNext(newNode);
    }

    public Node getElement(int index) {

        // exceptions
        if (index < 0) {
            throw new IllegalArgumentException("Index must be positive");
        } else if (index > (getSize() - 1)) {
            throw new IllegalStateException("Index out of bounds");
        }

        Node actual = head;
        int pos = getSize() - 1;

        while(actual.getNext() != null) {
            if (pos == index) {
                return actual.getNext();
            }
            pos--;
            actual = actual.getNext();
        }

        return null;
    }

    public boolean removeOccurs(int value) {

        Node actual = head;
        int removes = 0;

        while(actual.getNext() != null) {    
            if (actual.getNext().getInfo() == value) {
                if (actual.getNext().getNext() != null) {
                    actual.setNext(actual.getNext().getNext());
                    removes++;
                    continue;
                } else { 
                    actual.setNext(null);
                    return true;
                }
            }

            actual = actual.getNext();
        }

        return removes > 0;
    }

    public void arrayToList(int[] vector) {

        if(vector.length == 0) {
            throw new IllegalArgumentException("vector argument must be non-empty array");
        }

        for (int i = vector.length - 1; i >= 0; i--) {
            insert(vector[i]);
        }
    }
}
