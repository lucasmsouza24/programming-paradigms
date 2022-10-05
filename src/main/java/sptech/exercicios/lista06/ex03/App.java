package sptech.exercicios.lista06.ex03;

import sptech.exercicios.lista06.LinkedList;

public class App {
    
    public static void main(String[] args) {
        
        LinkedList linked = new LinkedList();

        linked.insert(1);
        linked.insert(1);
        linked.insert(0);
        linked.insert(0);
        linked.insert(1);
        linked.insert(1);
        linked.insert(1);
        linked.insert(0);
        linked.insert(0);
        linked.insert(1);
        linked.insert(1);

        linked.display();
        System.out.println("removed: " + linked.removeOccurs(1));
        // System.out.println(linked.getHead());
        linked.display();
        System.out.println("removed: " + linked.removeOccurs(1));
        linked.display();
        
    }

}
