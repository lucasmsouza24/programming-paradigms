package sptech.exercicios.lista04.ex01;

import sptech.exercicios.lista03.Node;

public class LinkedStack {
    
    // attributes 
    private Node top;
    private Integer size;

    // consructor
    public LinkedStack() {
        this.top = new Node(null);
        this.size = 0;
    }

    // methods

    public Node pop() {

        // the linked stack is empty
        if(isEmpty()) {
            throw new IllegalStateException("The LinkedStack is empty");
        }

        // the linked stack is not empty
        Node topNode = top.getNext();
        top.setNext(topNode.getNext());
        this.size--;
        return topNode;
    }

    public void push(int value) {
        Node newNode = new Node(value);

        // linked stack is empty
        if (isNotEmpty()) {
            newNode.setNext(top.getNext());
        }

        // linked stack is not empty
        this.size++;
        top.setNext(newNode);
    }

    public boolean isEmpty() {
        return top.getNext() == null;
    }

    public boolean isNotEmpty() {
        return !isEmpty();
    }

    public Node peek() {
        if (isNotEmpty()) {
            return top.getNext();
        }

        // linked stcak is empty
        throw new IllegalStateException("Linked stack is empty");
    }

    public void displayValues() {
        int[] array = new int[getSize()];
        int index = getSize();
        Node actualNode = top.getNext();

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

    // getters and setters
    public Integer getSize() {
        return this.size;
    }
    public Node getTop() {
        return top;
    }
}
