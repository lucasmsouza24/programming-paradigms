package sptech.exercicios.lista03.ex01;

import sptech.exercicios.lista03.LinkedList;

public class App {

    public static void main(String[] args) {
        LinkedList linked = new SortedLinkedList();

        linked.insert(10);
        linked.insert(7);
        linked.insert(3);
        linked.insert(20);
        linked.insert(1);
        linked.insert(2);
        linked.insert(2);

        linked.display();
        // System.out.println(linked.search(22));
        // System.out.println(linked.search(1).getInfo());

        // remove
        // linked.display();
        // linked.remove(-10);
        // linked.display();
    }
}
