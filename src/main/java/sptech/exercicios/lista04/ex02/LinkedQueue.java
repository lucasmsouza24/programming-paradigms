package sptech.exercicios.lista04.ex02;

import sptech.aulas.aula02.Node;

public class LinkedQueue {
    
    // attributes
    private Node start;
    private Integer size;

    // constructor
    public LinkedQueue() {
        this.start = new Node(null);
        this.size = 0;
    }

    // methods

    public Node poll() {

        if (isNotEmpty()) {
            Node penultimate = getPenultimateNode();
            Node last = penultimate.getNext();

            // removing last one
            penultimate.setNext(null);
            this.size--;

            return last;
        }

        // the linked queue is empty
        throw new IllegalStateException("the linked queue is empty");
    }

    public Node peek() {

        if (isNotEmpty()) {

            Node actual = start.getNext();

            while(actual != null) {

                // last one finded
                if (actual.getNext() == null) {
                    return actual;
                }

                // go to next
                actual = actual.getNext();
            }
        }

        // the linked queue is empty
        throw new IllegalStateException("the linked queue is empty");
    }

    public void insert(Integer value) {

        Node newNode = new Node(value);

        if (isNotEmpty()) {
            newNode.setNext(start.getNext());
        }

        start.setNext(newNode);
        size++;
    }

    public void display() {
        int[] array = new int[getSize()];
        int index = getSize();
        Node actualNode = start.getNext();

        while (actualNode != null) {
            array[--index] = actualNode.getInfo();

            if (actualNode.getNext() != null) {
                actualNode = actualNode.getNext();
                continue;
            }

            break;
        }

        for (int value : array) {
            System.out.print(value + ", ");
        }
        System.out.println();
    }

    public boolean isNotEmpty() {
        return !isEmpty();
    }

    public boolean isEmpty() {
        return start.getNext() == null;
    }

    // getters and setters
    public Node getStart() {
        return start;
    }
    public Integer getSize() {
        return size;
    }

    private Node getPenultimateNode() {
        if (isNotEmpty()) {
            Node actual = start;

            while (actual.getNext().getNext() != null) {
                actual = actual.getNext();
            }

            // penultimate finded
            return actual;
        }

        // the linked queue is empty
        throw new IllegalStateException("the linked queue is empty");
    }

    // to string
    @Override
    public String toString() {
        return "LinkedQueue [start=" + start + "]";
    }
}
