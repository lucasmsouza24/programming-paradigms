package sptech.exercicios.lista06.ex01;

import sptech.exercicios.lista06.LinkedList;

public class App {
    
    public static void main(String[] args) {
        
        // creating 
        LinkedList linked = new LinkedList();

        // inserting
        // linked.insert(2);
        // linked.insert(4);
        // linked.insert(6);
        // linked.insert(8);
        // linked.insert(10);
        // linked.insert(12);
        // linked.insert(14);
        // linked.insert(16);

        // display 1
        linked.display();

        // testing
        linked.insertAfterFirstOdd(1);
        linked.insertAfterFirstOdd(3);
        linked.insertAfterFirstOdd(2);
        
        // display 2
        linked.display();
        
        // display 3

    }

}
