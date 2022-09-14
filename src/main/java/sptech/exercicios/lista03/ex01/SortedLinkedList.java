package sptech.exercicios.lista03.ex01;

import sptech.exercicios.lista03.LinkedList;
import sptech.exercicios.lista03.Node;

public class SortedLinkedList extends LinkedList {
    
    @Override
    public void insert(int value) {
        if (this.getSize() == 0) {
            super.insert(value);
        } else {
            Node actual = this.head;
            
            while (actual != null) {
                if(actual.getNext() != null) {
                    if (value > actual.getNext().getInfo()) {
                        actual = actual.getNext();
                        continue;
                    };
                }
                Node newNode = new Node(value);
                newNode.setNext(actual.getNext());                
                actual.setNext(newNode);
                break;
            }
        }
    }

    @Override
    public Node search(int value) {
        if (this.getSize() == 0) {
            throw new IllegalStateException("Linked List is empty");
        }

        Node actual = this.head.getNext();

        while (actual != null) { 
            if (actual.getNext() != null) {
                if (value < actual.getNext().getInfo()) {
                    continue;
                }
                return actual;
            }
        }

        return null;
    }
}
