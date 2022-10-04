package sptech.exercicios.lista06.ex02;

import sptech.exercicios.lista06.LinkedList;

public class App {
    
    public static void main(String[] args) {

        int index = 0;
        LinkedList linked = new LinkedList();
        
        linked.insert(10);
        linked.insert(20);
        linked.insert(30);
        
        System.out.println(linked.getHead());
        linked.display();
        System.out.println(index + ": " + linked.getElement(index).getInfo());
    }

}
